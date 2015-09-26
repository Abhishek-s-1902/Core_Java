

package catcher;

/*class catcher calls the main method*/

public class catcher{
	
	
	public static void main(String[] args)
	{
			/*initialising the catchermain constructor*/
			catchermain acatcher=new catchermain(2.0,3.0,4.0);
		
            //printing the position of catcher after landing to groun*/
           
			System.out.println("2." + acatcher.finalposition());
            
			/* initialising 2 leave constructor*/
            
			leave leave1 = new leave(2.5,4,5);
			
			leave leave2 = new leave(2.5,6,5);			
			
			/* initialising 2 smartleave constructor*/
			Smartleave smartleave1 = new Smartleave(4.8,4,5);			
			Smartleave smartleave2 = new Smartleave(4.8,6,5);
			
			/* initialising the Toast constructor*/
			toast toast1 = new toast(9.8,4,5);
			
			int counter = 4; /*initialising one counter for 4 leave*/
			
			double leaveposition[] = new double[3]; /*initialising one array from taking the all 4
													leave positons*/
			
			int noofleaves=0;
			
			leaveposition[noofleaves] = leave1.finalpositionleave();			/*printing the leave positions */
			leaveposition[noofleaves++] = leave2.finalpositionleave();
			leaveposition[noofleaves++]= smartleave1.finalpositionsmartleave();
			leaveposition[noofleaves++]= smartleave2.finalpositionsmartleave();
			
										toast1.finalposition();   /*printing the toast position*/
			
			acatcher.catcherTrytocatch(leaveposition,counter); /*how many leave the catcher can take in its radius*/
	
    	}
	

}
