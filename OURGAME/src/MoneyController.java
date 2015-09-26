import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import java.net.*;

// @author  Abhishek Sharma

	public class MoneyController extends UnicastRemoteObject implements gamePlay{
	
	static MoneyView view;
	//= new MoneyView();
	
	static MoneyModel model;
	static MoneyController moneycontrollerobj;
	static Registry registry;
	static gamePlay RmiServer;
	static String comunicatestring;
	static boolean comunicate = false;				//for checking if the button has been clicked and String has been set  
					
	// New code starts here
	
	public void startGame() {
		System.out.println("you want to be a server or a client, Type 'server' or 'client'");
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
       try{
        	if(S.toUpperCase().equals("SERVER"))
        	{
        	comunicatestring = "SERVER";
    	   moneycontrollerobj = new MoneyController();
    	   registry = LocateRegistry.createRegistry(5555);
           registry.rebind("rmiServer", moneycontrollerobj);
            System.out.println("ServerPlayer1 bound in registry");
            view.constructFrame(S);
           

            System.out.println("if you want to connect to the other player Y ,N");
                S = in.nextLine();

                if(S.toUpperCase().equals("Y"))
                {
                    registry =LocateRegistry.getRegistry(
                                   "127.0.0.1",6666);
                    RmiServer =  (gamePlay)(registry.lookup("rmiServer"));
                    RmiServer.setMessage(comunicatestring);
                    
                }
                else
                {
                    return;
                }
        	
        	}
        	
        		else if(S.toUpperCase().equals("CLIENT")) 
        		{
        			  comunicatestring = "CLIENT";
        			   moneycontrollerobj = new MoneyController();
        	    	   registry = LocateRegistry.createRegistry(6666);
        	           registry.rebind("rmiServer", moneycontrollerobj);
        	            System.out.println("ServerPlayer2 bound in registry");
        	            view.constructFrame(S);
        	         
        	            
        	            System.out.println("if you want to connect to the other player Y ,N");
        	                S = in.nextLine();

        	                if(S.toUpperCase().equals("Y"))
        	                {
        	                    registry =LocateRegistry.getRegistry(
        	                                   "127.0.0.1",5555);
        	                    RmiServer =  (gamePlay)(registry.lookup("rmiServer"));
        	                    RmiServer.setMessage(comunicatestring);
        	                }
        	                else
        	                {
        	                    return;
        	                }
        	
        		}
  
           } catch (Exception e) {
             System.out.println("ServerDouble err: " + e.getMessage());
             e.printStackTrace();
            }

		
	}
	
	
	
	
	public MoneyController() throws java.rmi.RemoteException {
		super();
	}
	
	
	public static void main(String args[]) throws RemoteException {

		moneycontrollerobj = new MoneyController();
		view = new MoneyView(moneycontrollerobj);
		model=new MoneyModel();
		
		moneycontrollerobj.startGame();
		
	}
	
	
		
	public void setMessage(String S) throws RemoteException{
		System.out.println(S);
	}
	
	public void updateData(String S) throws java.rmi.RemoteException   //Interface method for communication
	{		
		view.updateData(S);
		
	}
	
	public void updateDataPlayer1(String S){
		view.updateDataPlayer1(S);
	}
	
	public void updateDataPlayer2(String S){
		view.updateDataPlayer2(S);
	}
	
	public void setPlayeroneString(String S) throws java.rmi.RemoteException{
		RmiServer.updateDataPlayer1(S);
		System.out.println("setString"+S );
	}
	
	public void setPlayertwoString(String S) throws java.rmi.RemoteException{
		RmiServer.updateDataPlayer2(S);
		System.out.println("setString"+S );
	}
	
	public void setString(String S) throws java.rmi.RemoteException{
		
		RmiServer.updateData(S);
		System.out.println("setString"+S );
	}

	public void finalWinner(String winner)throws java.rmi.RemoteException{
		RmiServer.setfinalWinner(winner);
	}
	
	public void setfinalWinner(String winner){
		view.setfinalWinner(winner);
	}
	
	void setOnenumber(String oneNumber){
		model.setOnenumber(oneNumber);
	}

	public String getOneCard(){
		
		return model.getOneCard();
	}

	 public String getTwoCard(){
		 
		 return model.getTwoCard();
	 }

	 public void Score(){
		 model.Score();
	 }

	 public int getHighestScore(){
		 
		int hig = model.getHighestScore();
		System.out.println("contriller  "+hig);
		return hig;
	 }
	 
	 public int playerOneScore(){
		return model.playerOneScore();
	 }
	 
	 public int playerTwoScore(){
		 return model.playerTwoScore();
	 }
	 
	 public String getPlayerOneScore(){
		return model.getPlayerOneScore();
	 }
	 
	 public String getPlayerTwoScore(){
		 return model.getPlayerTwoScore();
	 }
}
