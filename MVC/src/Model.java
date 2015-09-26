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

import java.util.Collections;
import java.util.Vector;

import javax.swing.JButton;
/*
 * Model class stores the Data required during the play
 * and also stores the methods used for operation on the DATA 
 * 
 */

public class Model {
	
	int first;
	Vector<Integer> V1 = new Vector();
	Vector<Integer> V2 = new Vector();
	
	boolean track = true;
	
	/*
	 * Model Constructor initializes 
	 * the data required prior the game start
	 */	
	
	Model(){
	for(int i=0;i<20;i++){
		V1.add((int)( Math.random()*99 ));
		}
		
		for(int i=0;i<20;i++){
			V2.add(V1.get(i));
			}
		
		
		Collections.shuffle(V2);
		first = V2.get(0);
		
	}
	
	
	int getlucky(){
		return first;}
	
	Vector getButtonval(){
		return V1;
	}
	
}
