import java.util.Scanner;
import java.util.*;

/*
 * @Author: Abhishek Sharma
 * Date: 05/02/2014
 * Description: This program finds the Number of Keys we can have
 * 				for affine cypher 
 */

public class GCD {
	
	/*
	 * @var: sc: scanner variable to take i/p from user
	 * @var: number: integer variable to store the i/p
	 * @var: arr: vecotr to store all the primes
	 * @var: index: keep count for number of co-prime to the user number
	 * @var: divident, divisor, quotient, reminder: having literal meaning as in maths
	 *       and stores respective value as per the method to find GCD
	 */

	public static void main(String[] args) {
		
		System.out.println("enter the number for which to find number of key:");
		Scanner sc = new Scanner(System.in);
	    int number = sc.nextInt();
	    
	    Vector arr = new Vector(number);
	    int index = 0;
		int divident, divisor,quotient,reminder;
		boolean b;
		
	     for (int i=1;i<number;i++){
	    	 b = true;
	    	 divident = number;
	    	 divisor = i;
	    	 
	    	 while(b)
	    	 {	    		
	    		 quotient = divident/divisor;
	    		 reminder = divident%divisor;
	    		 	    		 
	    		 if(reminder==0)
	    		 {
	    			 b = false;
	    			 if(divisor==1){
	    			 arr.addElement(i);	 
	    			 index++;
	    			 }
	    		 }
	    		 else
	    		 {
	    			 divident = divisor;
	    			 divisor = reminder;
	    			 continue;
	    		 }
	    	 
	    	 }
	    	    		    	 
	     }
	     
	     for(int i = 0; i< arr.size();i++)
	     System.out.println("co-prime:"+arr.elementAt(i));
	     System.out.println("number & coprime"+ number + index);
	     System.out.println("number of keys:"+ number*index);
	}

}
