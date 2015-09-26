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
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
/*
 * View class creates the view of the game board
 * with 3 panes and buttons
 * 
 */

public class View extends JFrame implements ActionListener{
	
	 JPanel contentPane=  new JPanel();
	 JPanel togglePane =new JPanel();
	 JPanel finalresult = new JPanel();
	 Integer first;
	Vector<Integer> V1 = new Vector();
	boolean track = true;
	boolean howwins = false;
	Integer index = -1;				//for sending the index to other player
	boolean turnBool = false;
	 JButton jbutton[]= new JButton[20];
	
	 Vector getVector(){
		 return V1;
	 }
	int getIndex(){
		
		return index;
	}
	
	void clearData(){
		index= null;		
	}
	
	boolean getWin(){
		return howwins;
	}
	
	int getFirst(){
		return first;
	}
	
	 void setLuckyval(int lucky){
		 first = lucky;
			
			txt.setText("your lucky no is:"+ lucky);
		}
	
	 void setButtonval(Vector V){
		 
	 V1 = V;
	}
	
	 /*
	  * View constructor initializes all the object with respective
	  * to the game board 
	  */
	 View(){
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize( 600, 600);
		
		for(int i=0;i<20;i++){
			jbutton[i] = new JButton();
		}
		
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
		
		
		togglePane.add(textButton);
		textButton.setBounds(20,150,150,30);
		
	
		
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
		
				 
		jbutton[1].setBounds(0, 60, 70, 60);
		contentPane.add(jbutton[1]);
		
		
		jbutton[2].setBounds(0,120, 70, 60);
		contentPane.add(jbutton[2]);
		
		
		jbutton[3].setBounds(0,180, 70, 60);
		contentPane.add(jbutton[3]);
		
		
		jbutton[4].setBounds(70,0, 70, 60);
		contentPane.add(jbutton[4]);
		
		
		jbutton[5].setBounds(70,60,70, 60);
		contentPane.add(jbutton[5]);
		
		
		jbutton[6].setBounds(70,120, 70, 60);
		contentPane.add(jbutton[6]);
		
		
		jbutton[7].setBounds(70,180, 70, 60);
		contentPane.add(jbutton[7]);
		
		
		jbutton[8].setBounds(140, 0, 70, 60);
		contentPane.add(jbutton[8]);
		
		
		jbutton[9].setBounds(140, 60, 70, 60);
		contentPane.add(jbutton[9]);
		
		
		jbutton[10].setBounds(140,120, 70, 60);
		contentPane.add(jbutton[10]);
		
		
		jbutton[11].setBounds(140, 180, 70, 60);
		contentPane.add(jbutton[11]);
		
		
		jbutton[12].setBounds(210,0, 70, 60);
		contentPane.add(jbutton[12]);
		
		
		jbutton[13].setBounds(210, 60, 70, 60);
		contentPane.add(jbutton[13]);
		
		
		jbutton[14].setBounds(210,120,70, 60);
		contentPane.add(jbutton[14]);
		
		
		jbutton[15].setBounds(210,180, 70, 60);
		contentPane.add(jbutton[15]);
		
		
		jbutton[16].setBounds(280 , 0, 70, 60);
		contentPane.add(jbutton[16]);
		
		
		jbutton[17].setBounds(280, 60, 70, 60);
		contentPane.add(jbutton[17]);
		
		
		jbutton[18].setBounds(280, 120, 70, 60);
		contentPane.add(jbutton[18]);
		
		
		jbutton[19].setBounds(280,180, 70, 60);
		contentPane.add(jbutton[19]);
		
		
	}
	
	
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
	 
	 
	 void clicklistner(ActionListener listnerClick){
		 
		 for(int i=0;i<20;i++){
				jbutton[i].addActionListener(listnerClick);
			}
		 
		 
		Exitlast.addActionListener(listnerClick);

		Exit.addActionListener(listnerClick);
		textButton.addActionListener(listnerClick);
	 }
	


	
	 public void gameplayAction(Integer index,boolean howWins){
		 track = howwins;
		 
		// for(int i = index;;){
			 if(V1.get(index)==first){
	        	  if(track==true){
	        	  finalwin.setText("player one wins");  
	           setContentPane(finalresult);
	       } else {
        	   finalwin.setText("player two wins");  
	           setContentPane(finalresult);   
           }
	      } else{
			 String S1 = String.valueOf(V1.get(index));
			 jbutton[index].setText(S1);
			 }
		 
	 }
	 
	/*
	 * actionPerformed: This is the actionPerformer for 
	 * events
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
		 
		 if(jbutton[0].getText()!=""){
			 return;
		 }
		 else if( turnBool== false){
				 return;
			 }
			 else{ index = 0;
				 String S1 =	String.valueOf(V1.get(0));
		    jbutton[0].setText(S1);
		          if(V1.get(0)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);
		           }
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
	 else if(e.getSource()==jbutton[1]) {
		 if(jbutton[1].getText()!=""||turnBool== false){
			 return;
		 } else if( turnBool== false){
			 return;
		 }
		 else{index = 1;
		    	String S1 =	String.valueOf(V1.get(1));
		    	jbutton[1].setText(S1);
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
	 	} else if(e.getSource()==jbutton[2]) {
		 if(jbutton[2].getText()!=""||turnBool== false){
			 return;
		 } else if( turnBool== false){
			 return;
		 }
		 else{index = 2;
	    	String S1 =	String.valueOf(V1.get(2));
	    	jbutton[2].setText(S1);
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
	            }}
	 else if(e.getSource()==jbutton[3]) {
		 if(jbutton[3].getText()!=""||turnBool== false){
			 return;
		 } else if( turnBool== false){
			 return;
		 }else{index = 3;
	    	String S1 =	String.valueOf(V1.get(3));
	    	jbutton[3].setText(S1);
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
	            }}
	 else if(e.getSource()==jbutton[4]) {
		 if(jbutton[4].getText()!=""||turnBool== false){
			 return;
		 } else if( turnBool== false){
			 return;
		 }else{index = 4;
	    	String S1 =	String.valueOf(V1.get(4));
	    	jbutton[4].setText(S1);
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
	            }}
	 else if(e.getSource()==jbutton[5] ) {
		 if(jbutton[5].getText()!="" ||turnBool== false){
			 return;
		 } else if( turnBool== false){
			 return;
		 }else{index = 5;
	    	String S1 =	String.valueOf(V1.get(5));
	    	jbutton[5].setText(S1);
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
	            }}
	 else if(e.getSource()==jbutton[6] ) {
		 if(jbutton[6].getText()!="" ||turnBool== false){
			 return;
		 } else if( turnBool== false){
			 return;
		 }else{index = 6;
	    	String S1 =	String.valueOf(V1.get(6));
	    	jbutton[6].setText(S1);
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
	            }}
	 else if(e.getSource()==jbutton[7] ) {
		 if(jbutton[7].getText()!=""||turnBool== false){
			 return;
		 } else if( turnBool== false){
			 return;
		 }else{index = 7;
	    	String S1 =	String.valueOf(V1.get(7));
	    	jbutton[7].setText(S1);
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
	            }}
	 else if(e.getSource()==jbutton[8] ) {
		 if(jbutton[8].getText()!=""||turnBool== false){
			 return;
		 } else if( turnBool== false){
			 return;
		 }else{index = 8;
	    	String S1 =	String.valueOf(V1.get(8));
	    	jbutton[8].setText(S1);
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
	            }}
	 else if(e.getSource()==jbutton[9]) {
		 if(jbutton[9].getText()!=""||turnBool== false){
			 return;
		 } else if( turnBool== false){
			 return;
		 }else{index = 9;
	    	String S1 =	String.valueOf(V1.get(9));
	    	jbutton[9].setText(S1);
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
	            }}
	 else if(e.getSource()==jbutton[10]) {
		 if(jbutton[10].getText()!=""||turnBool== false){
			 return;
		 } else if( turnBool== false){
			 return;
		 }else{index = 10;
	    	String S1 =	String.valueOf(V1.get(10));
	    	jbutton[10].setText(S1);
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
	            }}
	 else if(e.getSource()==jbutton[11]) {
		 if(jbutton[11].getText()!=""||turnBool== false){
			 return;
		 } else if( turnBool== false){
			 return;
		 }else{index = 11;
	    	String S1 =	String.valueOf(V1.get(11));
	    	jbutton[11].setText(S1);
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
	            }}
	 else if(e.getSource()==jbutton[12]||turnBool== false) {
		 if(jbutton[12].getText()!=""){
			 return;
		 } else if( turnBool== false){
			 return;
		 }else{index = 12;
	    	String S1 =	String.valueOf(V1.get(12));
	    	jbutton[12].setText(S1);
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
	            }}
	 else if(e.getSource()==jbutton[13]) {
		 if(jbutton[13].getText()!=""||turnBool== false){
			 return;
		 } else if( turnBool== false){
			 return;
		 }else{index = 13;
	    	String S1 =	String.valueOf(V1.get(13));
	    	jbutton[13].setText(S1);
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
	            }}
	 else if(e.getSource()==jbutton[14]) {
		 if(jbutton[14].getText()!=""||turnBool== false){
			 return;
		 } else if( turnBool== false){
			 return;
		 }else{
	    	String S1 =	String.valueOf(V1.get(14));
	    	jbutton[14].setText(S1);
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
	            }}
	 else if(e.getSource()==jbutton[15]) {
		 if(jbutton[15].getText()!=""||turnBool== false){
			 return;
		 } else if( turnBool== false){
			 return;
		 }else{index = 15;
	    	String S1 =	String.valueOf(V1.get(15));
	    	jbutton[15].setText(S1);
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
	            }}
	 else if(e.getSource()==jbutton[16]) {
		 if(jbutton[16].getText()!=""||turnBool== false){
			 return;
		 } else if( turnBool== false){
			 return;
		 }else{index = 16;
	    	String S1 =	String.valueOf(V1.get(16));
	    	jbutton[16].setText(S1);
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
	            }}
	 else if(e.getSource()==jbutton[17]) {
		 if(jbutton[17].getText()!=""||turnBool== false){
			 return;
		 } else if( turnBool== false){
			 return;
		 }else{index = 17;
	    	String S1 =	String.valueOf(V1.get(17));
	    	jbutton[17].setText(S1);
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
	            }}
	 else if(e.getSource()==jbutton[18]) {
		 if(jbutton[18].getText()!=""||turnBool== false){
			 return;
		 } else if( turnBool== false){
			 return;
		 }else{index = 18;
	    	String S1 =	String.valueOf(V1.get(18));
	    	jbutton[18].setText(S1);
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
	            }}
	 else if(e.getSource()==jbutton[19]) {
		 if(jbutton[19].getText()!=""||turnBool== false){
			 return;
		 } else if( turnBool== false){
			 return;
		 }else{index = 19;
	    	String S1 =	String.valueOf(V1.get(19));
	    	jbutton[19].setText(S1);
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
	            }}
	 
	 }
	 
}
