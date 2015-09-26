package catcher;

public class Smartleave extends catchermain{
	
	double x, y,gravity;
	
	Smartleave(double gravity,double x,double y)
	{
			super(gravity,x,y); /*using the super class method for
								initialising the position*/
	}
	
	/*calculating the final position of the smart leave*/
	double finalpositionsmartleave()  /*same thing in the catchermain but dont know why throwing the error*/
	{
		int degree = 30;    
		int Height = y;
		x = (x/Height)*(1/1.732);
		return(x);
	}
	
		
}
