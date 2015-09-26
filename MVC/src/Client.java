
/**
 * 
 * 
 * MoneyUI.java
 * 
 * @Version 1.0 27/11/2013		
 * 
 * 
 * @author Aditya Kasturi 
 * 
 * @author Abhishek Sharma.
 * 
 */
import java.io.*;
import java.net.*;

/*
 * Client class creates the socket and connects 
 * to the server and execute the gameplay
 * 
 */
public class Client {

	
public static void main(String args[])throws IOException,ClassNotFoundException{
	
	
	new Client().runClient();
		
}

/*
 *this method creates the server port and executes the gameplay
 *with client
 * 	
 */
void runClient()throws IOException,ClassNotFoundException{
	
	String S[] =new String[21];
	Model M1 = new Model();
	View V1 = new View();
	Controller c1 = new Controller(V1,M1);
	boolean clickevent = true;
	 String indexbool;
	
	Socket mySocket = new Socket("127.0.0.1",5555);
	try{
	
	PrintWriter out =
            new PrintWriter(mySocket.getOutputStream(), true);
	
	BufferedReader in = new BufferedReader(
            new InputStreamReader(mySocket.getInputStream()));
	BufferedReader stdIn =
            new BufferedReader(
                new InputStreamReader(System.in));
	

        String userInput1,userInput2;
        userInput1 = in.readLine();
        System.out.println(userInput1);
      
        String S2[] = new String[21];
        userInput1 = stdIn.readLine();
        userInput2 = userInput1;
        System.out.println(userInput1);
     
       
        if(userInput1.toUpperCase().equals("Y")){ 
      	
        	
        	out.println(userInput1);
   		
         c1.putInitialval();
   		
		
		S =  c1.setSendingval();
		
    	for(int i=0;i<21;i++){
    		out.println(S[i]);
    	}	
   		 
    	
    	 c1.setBool(); 
       	
   	while(true){
   		
   		while(clickevent){					
   			
   			if(c1.getIndexBool()==false){
   				continue;
   			}
   			
   				indexbool = c1.getData();
   				out.println(indexbool);
   				clickevent = false;
   			  c1.setBool();
   				c1.clearData();
   			}
   		
   			userInput1 = in.readLine();
   			c1.gameplayAction(userInput1);
   			clickevent =true;
   		  c1.setBool();
   		}
   		  
      }
      
      } catch (UnknownHostException e) {
        System.err.println("Don't know about host ");
        System.exit(1);
    } catch (IOException e) {
        System.err.println("Couldn't get I/O for the connection to " 
            );
        System.exit(1);
    } 
	
	
} 

}



