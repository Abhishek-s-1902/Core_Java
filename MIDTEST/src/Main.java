import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;


/*
 * PrimeTest.java
 * 
 * version : 1.0 10/24/2013
 * 
 * @author : Aditya Kasturi 
 * @author : Abhishek Sharma
 * 
 * This Main Program will execute a game where two
 * persons can play against each other.On each turn
 * there will be a random number get generated and 
 * which player will find the number first from the 
 * set of buttons will wins the game.
 *  
 */

public class Main extends JFrame implements ActionListener{

	/*
	 * Three Panel for 3 display window
	 * @JPanel togglePane :This will be the 1st screen
	 * @JPanel contentPane: This will be 2nd screen 
	 * 				where player can play the games
	 * @JPanel finalresult: This screen will display the result
	 */
	private JPanel contentPane;
	private JPanel togglePane;
	private JPanel finalresult;
	
	/*
	 * Launch the application.
	 * and create the frame
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					frame.setSize(500,400);
					
					} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * @var first: to store the Vector element
	 * @var V1: Vector to sore the random generated number
	 * @var V2: Vector to store the copy of V1 and do the 
	 * 			shuffle the element in it and give the lucky number
	 * @JButton: to take the input from the user and begins the game
	 * @var track: to keep the track of player1 or player2 playing
	 * @JButtons one - twenty: player can choose any one turn by turn
	 * 					to check their luck
	 * @JLables txttoggle1: to produce the text at contentPane
	 * @JLable turn: to give which player is playing
	 * @JLable finalwin: to give the result of game
	 * 
	 */
	Object first;
	Vector V1 = new Vector();
	Vector V2 = new Vector();
	JButton check;
	boolean track = true;
	
	//////////////////////////////////////////////////
	
	 JButton jbutton[]= new JButton[20];
	
	
	
	 /*JButton one = new JButton("click ");
	 JButton two = new JButton("click ");
	 JButton three = new JButton("click");
	 JButton four = new JButton("click");
	 JButton five = new JButton("click");
	 JButton six = new JButton("click");
	 JButton seven = new JButton("click");
	 JButton eight = new JButton("click");
	 JButton nine = new JButton("click");
	 JButton ten = new JButton("click");
	 JButton eleven = new JButton("click");
	 JButton twelve = new JButton("click");
	 JButton thirteen = new JButton("click");
	 JButton fourteen = new JButton("click");
	 JButton fifteen = new JButton("click");
	 JButton sixteen = new JButton("click");
	 JButton seventeen = new JButton("click");
	 JButton eighteen = new JButton("click");
	 JButton nineteen = new JButton("click");
	 JButton twenty = new JButton("click");*/
	 JButton textButton = new JButton("click to play");
	 JButton testbutton = new JButton("click");
	 JButton Exit = new JButton("Exit");
	 JButton Exitlast = new JButton("Exit");
	 JButton playagain = new JButton("playagain");
	 TextField txt=new TextField();
	 
	 JLabel txttoggle1=new JLabel();
	 JLabel txttoggle2=new JLabel();
	 JLabel txttoggle3=new JLabel();
	 JLabel turn =new JLabel();
	 JLabel finalwin =new JLabel();
	 
	 /*
	  *@Constructor Main :To initialize each member of the frame
	  *						and set there position on the screen 
	  */
	 
	public Main() {
		
		
		for(int i=0;i<20;i++){
			jbutton[i] = new JButton("click");
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		
		
		contentPane = new JPanel();
		togglePane = new JPanel();
		finalresult = new JPanel();
		
		finalresult.setLayout(null);
		contentPane.setLayout(null);
		togglePane.setLayout(null);
		setContentPane(togglePane);
		
		finalresult.add(finalwin);
		finalwin.setOpaque(true);
		finalwin.setBounds(50,10,200,30);
		finalwin.setBackground(Color.blue);
		finalwin.setForeground(Color.red);
		finalwin.setText("test");
		
		finalresult.add(Exitlast);
		Exitlast.setBounds(30,100,80,50);
		Exitlast.addActionListener(this);
		
		
			
		finalwin.add(testbutton);
		testbutton.setBounds(20,60,50,50);
		
		
		togglePane.add(txttoggle3);
		txttoggle3.setOpaque(true);
		txttoggle3.setBounds(20, 20,350 ,30);
		txttoggle3.setBackground(Color.blue);
		txttoggle3.setForeground(Color.red);
		txttoggle3.setText("Get the lucky number");
		
		togglePane.add(txttoggle1);
		txttoggle1.setOpaque(true);
		txttoggle1.setBounds(20, 50,350 ,30);
		txttoggle1.setBackground(Color.blue);
		txttoggle1.setForeground(Color.red);
		txttoggle1.setText("the player gets the lucky number first will win\r\n");
		
		togglePane.add(txttoggle2);
		txttoggle2.setOpaque(true);
		txttoggle2.setBounds(20, 80,350 ,30);
		txttoggle2.setBackground(Color.blue);
		txttoggle2.setForeground(Color.red);
		txttoggle2.setText("want to play? press the button");
		
		togglePane.add(Exit);
		Exit.setBounds(190,150,90,30);
		Exit.addActionListener(this);
		
		togglePane.add(textButton);
		textButton.setBounds(20,150,150,30);
		textButton.addActionListener(this);
	
		
		contentPane.add(txt);
		txt.setBounds(350, 0, 120, 100);
		
		contentPane.add(turn);
		turn.setOpaque(true);
		turn.setBounds(350,120,120 ,100);
		turn.setBackground(Color.blue);
		turn.setForeground(Color.red);
		turn.setText("Player1 turn");
		
		jbutton[0].setBounds(0, 0, 70, 60);
		contentPane.add(jbutton[0]);
		jbutton[0].addActionListener(this);
				 
		jbutton[1].setBounds(0, 60, 70, 60);
		contentPane.add(jbutton[1]);
		jbutton[1].addActionListener(this);
		
		jbutton[2].setBounds(0,120, 70, 60);
		contentPane.add(jbutton[1]);
		jbutton[2].addActionListener(this);
		
		jbutton[3].setBounds(0,180, 70, 60);
		contentPane.add(jbutton[1]);
		jbutton[3].addActionListener(this);
		
		jbutton[4].setBounds(70,0, 70, 60);
		contentPane.add(jbutton[1]);
		jbutton[4].addActionListener(this);
		
		jbutton[5].setBounds(70,60,70, 60);
		contentPane.add(jbutton[1]);
		jbutton[5].addActionListener(this);
		
		jbutton[6].setBounds(70,120, 70, 60);
		contentPane.add(jbutton[1]);
		jbutton[6].addActionListener(this);
		
		jbutton[7].setBounds(70,180, 70, 60);
		contentPane.add(jbutton[1]);
		jbutton[7].addActionListener(this);
		
		jbutton[8].setBounds(140, 0, 70, 60);
		contentPane.add(jbutton[1]);
		jbutton[8].addActionListener(this);
		
		jbutton[9].setBounds(140, 60, 70, 60);
		contentPane.add(jbutton[1]);
		jbutton[9].addActionListener(this);
		
		jbutton[10].setBounds(140,120, 70, 60);
		contentPane.add(jbutton[1]);
		jbutton[10].addActionListener(this);
		
		jbutton[11].setBounds(140, 180, 70, 60);
		contentPane.add(jbutton[1]);
		jbutton[11].addActionListener(this);
		
		jbutton[12].setBounds(210,0, 70, 60);
		contentPane.add(jbutton[1]);
		jbutton[12].addActionListener(this);
		
		jbutton[13].setBounds(210, 60, 70, 60);
		contentPane.add(jbutton[1]);
		jbutton[13].addActionListener(this);
		
		jbutton[14].setBounds(210,120,70, 60);
		contentPane.add(jbutton[1]);
		jbutton[14].addActionListener(this);
		
		jbutton[15].setBounds(210,180, 70, 60);
		contentPane.add(jbutton[1]);
		jbutton[15].addActionListener(this);
		
		jbutton[16].setBounds(280 , 0, 70, 60);
		contentPane.add(jbutton[1]);
		jbutton[16].addActionListener(this);
		
		jbutton[17].setBounds(280, 60, 70, 60);
		contentPane.add(jbutton[1]);
		jbutton[17].addActionListener(this);
		
		jbutton[18].setBounds(280, 120, 70, 60);
		contentPane.add(jbutton[1]);
		jbutton[18].addActionListener(this);
		
		jbutton[19].setBounds(280,180, 70, 60);
		contentPane.add(jbutton[1]);
		jbutton[19].addActionListener(this);
		
		for(int i=0;i<20;i++){
		V1.add((int)( Math.random()*99 ));
		}
		
		for(int i=0;i<20;i++){
			V2.add(V1.get(i));
			}
		
		
		Collections.shuffle(V2);
		first = V2.get(0);
		
		txt.setText("your lucky no is:"+ first);
		
		
		
	}
	
	/*
	 * 
	 * @func actionPerformed: Java function to catch the action on objects 
	 * 				 java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 * 
	 * 
	 */
	
	 public void actionPerformed(ActionEvent e) {
		 
		 
		 if(e.getSource()==textButton){
			 togglePane.setVisible(false);
			 setContentPane(contentPane);
		 }
		 
		
		 if(e.getSource()==Exitlast){
			 System.exit(0);
		 }
		 
		 if(e.getSource()==Exit){
			 System.exit(0);
		 }		 
		 
		
		 if(e.getSource()==jbutton[0]) {
			    String S1 =	String.valueOf(V1.get(0));
			        jbutton[0].setText(S1);
			          if(V1.get(0)==first){
			        	  if(track==true){
			        	  finalwin.setText("player one wins");  
			           setContentPane(finalresult);}
			           else {
			        	   finalwin.setText("player two wins");  
				           setContentPane(finalresult);   
			           }
			            }
			   if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
		 }
		 else if(e.getSource()==two) {
			    	String S1 =	String.valueOf(V1.get(1));
			           two.setText(S1);
			           if(V1.get(1)==first){
				        	  if(track==true){
				        	  finalwin.setText("player one wins");  
				           setContentPane(finalresult);}
				           else {
				        	   finalwin.setText("player two wins");  
					           setContentPane(finalresult);   
				           }
				            }
			           if(track==true){
						   turn.setText("Player two turn");
						   track = false;}
					   else{  turn.setText("Player one turn");
						   track =true;}
		 			}
		 else if(e.getSource()==three) {
		    	String S1 =	String.valueOf(V1.get(2));
		    	three.setText(S1);
		        if(V1.get(2)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
		        if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
		            }
		 else if(e.getSource()==four) {
		    	String S1 =	String.valueOf(V1.get(3));
		           four.setText(S1);
		           if(V1.get(3)==first){
			        	  if(track==true){
			        	  finalwin.setText("player one wins");  
			           setContentPane(finalresult);}
			           else {
			        	   finalwin.setText("player two wins");  
				           setContentPane(finalresult);   
			           }
			            }
		           if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
		            }
		 else if(e.getSource()==five) {
		    	String S1 =	String.valueOf(V1.get(4));
		           five.setText(S1);
		           if(V1.get(4)==first){
			        	  if(track==true){
			        	  finalwin.setText("player one wins");  
			           setContentPane(finalresult);}
			           else {
			        	   finalwin.setText("player two wins");  
				           setContentPane(finalresult);   
			           }
			            }
		           if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
		            }
		 else if(e.getSource()==six) {
		    	String S1 =	String.valueOf(V1.get(5));
		           six.setText(S1);
		           if(V1.get(5)==first){
			        	  if(track==true){
			        	  finalwin.setText("player one wins");  
			           setContentPane(finalresult);}
			           else {
			        	   finalwin.setText("player two wins");  
				           setContentPane(finalresult);   
			           }
			            }
		           if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
		            }
		 else if(e.getSource()==seven) {
		    	String S1 =	String.valueOf(V1.get(6));
		           seven.setText(S1);
		           if(V1.get(6)==first){
			        	  if(track==true){
			        	  finalwin.setText("player one wins");  
			           setContentPane(finalresult);}
			           else {
			        	   finalwin.setText("player two wins");  
				           setContentPane(finalresult);   
			           }
			            }
		           if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
		            }
		 else if(e.getSource()==eight) {
		    	String S1 =	String.valueOf(V1.get(7));
		           eight.setText(S1);
		           if(V1.get(7)==first){
			        	  if(track==true){
			        	  finalwin.setText("player one wins");  
			           setContentPane(finalresult);}
			           else {
			        	   finalwin.setText("player two wins");  
				           setContentPane(finalresult);   
			           }
			            }
		           if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
		            }
		 else if(e.getSource()==nine) {
		    	String S1 =	String.valueOf(V1.get(8));
		           nine.setText(S1);
		           if(V1.get(8)==first){
			        	  if(track==true){
			        	  finalwin.setText("player one wins");  
			           setContentPane(finalresult);}
			           else {
			        	   finalwin.setText("player two wins");  
				           setContentPane(finalresult);   
			           }
			            }
		           if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
		            }
		 else if(e.getSource()==ten) {
		    	String S1 =	String.valueOf(V1.get(9));
		           ten.setText(S1);
		           if(V1.get(9)==first){
			        	  if(track==true){
			        	  finalwin.setText("player one wins");  
			           setContentPane(finalresult);}
			           else {
			        	   finalwin.setText("player two wins");  
				           setContentPane(finalresult);   
			           }
			            }
		           if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
		            }
		 else if(e.getSource()==eleven) {
		    	String S1 =	String.valueOf(V1.get(10));
		    	eleven.setText(S1);
		        if(V1.get(10)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
		        if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
		            }
		 else if(e.getSource()==twelve) {
		    	String S1 =	String.valueOf(V1.get(11));
		    	twelve.setText(S1);
		        if(V1.get(11)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
		        if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
		            }
		 else if(e.getSource()==thirteen) {
		    	String S1 =	String.valueOf(V1.get(12));
		    	thirteen.setText(S1);
		        if(V1.get(12)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
		        if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
		            }
		 else if(e.getSource()==fourteen) {
		    	String S1 =	String.valueOf(V1.get(13));
		    	fourteen.setText(S1);
		        if(V1.get(13)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
		        if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
		            }
		 else if(e.getSource()==fifteen) {
		    	String S1 =	String.valueOf(V1.get(14));
		    	fifteen.setText(S1);
		        if(V1.get(14)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
		        if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
		            }
		 else if(e.getSource()==sixteen) {
		    	String S1 =	String.valueOf(V1.get(15));
		    	sixteen.setText(S1);
		        if(V1.get(15)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
		        if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
		            }
		 else if(e.getSource()==seventeen) {
		    	String S1 =	String.valueOf(V1.get(16));
		    	seventeen.setText(S1);
		        if(V1.get(16)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
		        if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
		            }
		 else if(e.getSource()==eighteen) {
		    	String S1 =	String.valueOf(V1.get(17));
		    	eighteen.setText(S1);
		        if(V1.get(17)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
		        if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
		            }
		 else if(e.getSource()==nineteen) {
		    	String S1 =	String.valueOf(V1.get(18));
		    	nineteen.setText(S1);
		        if(V1.get(18)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
		        if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
		            }
		 else if(e.getSource()==twenty) {
		    	String S1 =	String.valueOf(V1.get(19));
		    	twenty.setText(S1);
		        if(V1.get(19)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
		        if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
		            }
		 
		 
		 }
		 
		 
		   
	 }

	
