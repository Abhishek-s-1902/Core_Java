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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.io.Serializable;

/*
 * Controller class creates the object of View and Model class 
 * and provides the communication between the two 
 * 
 */

public class Controller implements Serializable {

	private View theView;
	private Model theModle;
	
	Vector<Integer> V1 = new Vector();
	Integer first;
	
		public Controller(View theView,Model theModle){
		this.theView = theView;
		this.theModle = theModle;
	    this.theView.clicklistner(new addListner());
	    this.theView.setLuckyval(this.theModle.getlucky());
	    this.theView.setButtonval(this.theModle.getButtonval());
	    this.theView.setVisible(true);
	
		}
	/*
	 * putInitialval() initializes the view object
	 * data
	 */
		
		void putInitialval(){
			
			this.V1= theView.V1;
			this.first = theView.first;
		}
		
	/*
	 * setSendingval: creates the initial val
	 * require to set between 2 players
	 */
			
		String[] setSendingval(){
			
			String S[] = new String[21];
			
			for(int i=0;i<20;i++){
				S[i] = theView.V1.elementAt(i).toString();				
			}
			
			S[20] = theView.first.toString();
			return S;
		}
		
		/*
		 * setInitialval: creates the initial value into string
		 * 
		 */
		void setInitialval(String[] S1){      		
			String S[] = new String[21];
		
			System.out.println( " ");
			
			for(int i=0;i<20;i++){
				System.out.print(S1[i]+ " ");
				theView.V1.clear();
				theView.V1.add(Integer.parseInt(S1[i]));
			}
			
			int j = S1.length-1;
			Integer first1 = Integer.parseInt(S1[20]);
			theView.txt.setText("your lucky no is:"+ first1);
			
			theView.setLuckyval(first1);
			System.out.println(theView.getFirst());
			putInitialval();
		}
	
	Vector	getVector(){
		return this.V1;
		
	}
	
	Integer getFirst(){  
		return this.first;
		
	}
	
	
	/*
	 * getData: returns the data string to be send
	 */
	String getData(){			
	
		Integer index = theView.getIndex();
		boolean howwins = theView.getWin();
		String S1 = (index.toString()+"\u0020"+ howwins);
		return S1;
	}
	/*
	 * setBool: sets value at run time
	 */
	
	void setBool(){
		
		if(theView.turnBool==true)
			theView.turnBool = false;
		else 
			theView.turnBool = true;
	}
	
boolean getIndexBool(){
	Integer index = theView.getIndex();
		if(index == -1){
			return false;
			
		}else{
		
		return true;
	}}

 void  getText(){
	   if(theView.jbutton[0].getText() == "" )
	   System.out.println("1");
	   else{
		   System.out.println("0"); 
	   }
   }

 
 /*
  * gameplayAction:process the incoming string
  */
   void gameplayAction(String setVal){
	String S[] = setVal.split("\u0020");
	Integer index = Integer.parseInt(S[0]);
	Boolean howwins = Boolean.valueOf(S[1]);
	
	theView.gameplayAction(index,howwins);
	
  }

	void clearData(){
	theView.clearData();
	}
	
	class addListner implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			 
			theView.actionPerformed(e);	 
			
	}
	
	
}
}