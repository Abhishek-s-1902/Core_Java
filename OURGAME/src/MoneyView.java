
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

import javax.swing.*;
/**
 * The View of the Money Game is Developed here .
 * 
 * A Frame is Developed and then The ConTroller of this Game is Taken 
 * 
 * All the Game View is Developed here.
 * 
 * @author aditya
 *
 */
public class MoneyView extends JFrame {	
	static MoneyController controller;

	private	MoneyModel model =new MoneyModel(); 
	private String oneCardName="#######";
	private String twoCardName="#######";
    private JButton playerOneButton=new JButton("Player One ");
    private JButton playerTwoButton=new JButton("Player Two ");
    private JLabel playerOneName=new JLabel("Player One");
    private JLabel playerTwoName=new JLabel("Player Two");
    private JLabel oneCard=new JLabel("$$$$$$$$");
    private JLabel twoCard=new JLabel("$$$$$$$$");
    private JLabel oneScore=new JLabel("$$$$$$$$");
    private JLabel twoScore=new JLabel("$$$$$$$$");
    
    private int playerOneScore=0;
    private int playerTwoScore=0;
    boolean turn = true;
    String setname = "1";
    String whichPlayer;
    String playeroneScore;
    String playertwoScore;
    
    public MoneyView(MoneyController aController) throws java.rmi.RemoteException {
    	controller = aController;
    }
	/**
	 * It will Constucts the Frame .
	 */
    public void constructFrame(String whichside){
	JFrame myFrame=new JFrame();
	myFrame.setVisible(true);
	myFrame.setTitle("  Money  ");//setting the Title
	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	myFrame.setSize(600, 400);//Setting the Size.
	JPanel panel=new JPanel();
	
	/**
	 * Creating a Label for Displaying the Game Title.
	 */
	JLabel titleLabel=new JLabel("***** MONEY *****");	
	myFrame.add(titleLabel);
	GridLayout gLayout=new GridLayout(4,4);
	myFrame.setLayout(gLayout);
	myFrame.add(NamePanel());
	myFrame.add(ButtonsPanel(whichside));
	myFrame.add(ScorePanel());
	myFrame.add(oneCard);
	myFrame.add(twoCard);
	myFrame.add(oneScore);
	myFrame.add(twoScore);
	
	}
   
	/**
	 * It creates a Panel and Then Adds The Buttons to the Panel.
	 * 
	 * @return panel This is the Panel for the Buttons for Both the Players.
	 */
	public Component ButtonsPanel(String whichside){
		
		whichPlayer = whichside;
		JPanel panel=new JPanel();
		panel.setSize(200, 100);
		GridLayout layout=new GridLayout(1,2,10,3);
		panel.setLayout(layout);
		
		panel.add(playerOneButton);
		panel.add(playerTwoButton);
		
		
		playerOneButton.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				if(whichPlayer.toUpperCase().equals("SERVER")) //for seeting as server
				{	
				if(turn==true)
				{
				try{
				
				SetOneCardName(controller.getOneCard());
				oneCard.setText(getOneCard());
				setname = getOneCard();
				
				turn=false;
				controller.setString(setname);
				System.out.println("setname"+ setname);
				}catch(RemoteException EX){}
				}
				}
				else
				{
					return;
				}
			}
			
		});
		
		
			
		playerTwoButton.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e) {
				if(whichPlayer.toUpperCase().equals("CLIENT")) //for client setting
				{
				if(turn==false)
				{
				try{
				SetTwoCardName(controller.getTwoCard());
				twoCard.setText(getTwoCard());
				setname = getTwoCard();
				
				controller.Score();
				
				System.out.println("HIgher  " + controller.getHighestScore());
				if(controller.getHighestScore()==1){
					oneScore.setText(controller.getPlayerOneScore());
					playeroneScore = controller.getPlayerOneScore();
					controller.setPlayeroneString(playeroneScore);
					
				}
				else {twoScore.setText(controller.getPlayerTwoScore());
				
				playertwoScore = controller.getPlayerTwoScore();
				controller.setPlayertwoString(playertwoScore);
				}
				
				finalWinner();
			
				turn=true;
				System.out.println("setname"+ setname);
				controller.setString(setname);
				}catch(RemoteException EX){}
				}
				}
				else
				{
					return;
				}
			  }
			
		});
		
		return panel;
	}
	
	
	public void finalWinner() throws java.rmi.RemoteException {
		
	 if(controller.playerOneScore()>20){
		 controller.finalWinner("1");
	        JOptionPane.showMessageDialog(this,"Player One Wins ");
	       
	  }
	  else if(controller.playerTwoScore()>20){
		  controller.finalWinner("2");
	        JOptionPane.showMessageDialog(this,"Player Two Wins");
	       
	    }
		
	}
	
	public void setfinalWinner(String winner){
		if(winner.equals("1")){
	        JOptionPane.showMessageDialog(this,"Player One Wins ");
	       }
	        else if(winner.equals("2")){
	        JOptionPane.showMessageDialog(this,"Player Two Wins");
	        
	        }
		
	}
	
	public void updateData(String S)
	{
		
		System.out.println("update"+S);
	
		if(turn==true){
			SetOneCardName(S);
			oneCard.setText(S);
			
			String[] oneVal = new String[2];
			int i=0;
			for (String word : S.split("\\s+")){
			 oneVal[i] = word;
			 i++;}
			System.out.println("oneVal "+oneVal[0]+" "+ oneVal[1]);
			
			controller.setOnenumber(oneVal[1]);
			
		turn=false;
		}
		
		else if(turn==false){
			SetTwoCardName(S);
			twoCard.setText(S);
			
			/*controller.Score();			/////////////calculating the score//////////////
		if(controller.getHighestScore()==1)
			oneScore.setText(controller.getPlayerOneScore());
		else twoScore.setText(controller.getPlayerTwoScore());*/
			
		turn=true;
		}
		
		/*if(turn == false){
			turn = true;
		}else{
			turn = false;
		}*/
	}
	
	public void updateDataPlayer1(String S){
		
		oneScore.setText(S);
	}
	
	public void updateDataPlayer2(String S){
		
		twoScore.setText(S);
	}
	public void setTurn(boolean B){
		
		turn = B;
	}
	/**
	 * 
	 * @return
	 */
	public Component NamePanel(){
		JPanel panel=new JPanel();
		GridLayout layout=new GridLayout(1,2);
		panel.setLayout(layout);
		panel.add(playerOneName);
		panel.add(playerTwoName);
		return panel;
	}
	
	public Component ScorePanel(){
		JPanel panel=new JPanel();
		FlowLayout layout=new FlowLayout(FlowLayout.CENTER,10,20);
		panel.setLayout(layout);		
		JLabel oneScore=new JLabel("Player One Score : ");
		JLabel twoScore=new JLabel("Player Two Score : ");
		panel.add(oneScore);
		panel.add(twoScore);
		panel.add(oneScore);
		panel.add(twoScore);
		return panel;
	}

	/**
	 * 
	 * @param name
	 */
	public void SetOneCardName(String name){
		this.oneCardName=name;
	}
	public String getOneCard(){
		return this.oneCardName;
	}	
	public void SetTwoCardName(String name){
		this.twoCardName=name;
	}
	public String getTwoCard(){
		return this.twoCardName;
	}

}


/**
public void InvokeOne(){
	playerOneButton.addActionListener(new ActionListener() {			
		public void actionPerformed(ActionEvent e) {
			oneCard.setText(getOneCard());
		}
	});
}
public void InvokeTwo(final String name){
	playerTwoButton.addActionListener(new ActionListener() {			
		public void actionPerformed(ActionEvent e) {
			twoCard.setText(name);
		}
	});
}
/**
 * 
 * @param  oneCard This is Card Name Which Will be Set as The Name for The
 * 			Card And The Name for it will be Set in the Label.
 * @return oneCard The Name of The Card is Returned .
 */	
/**
public Component SetOneCard(String oneCard){
	this.oneCard.setText(oneCard);
	return this.oneCard;
}
/**
 * 
 * @param oneCard
 * @return
 */
/**
public Component SetTwoCard(String twoCard){
	this.twoCard.setText(twoCard);
	return this.twoCard;
}*/
