package catcher;

/*extending the catchermain to leave*/

public class leave extends catchermain{
	
	 double x, y,gravity;
	 
	leave(double gravity,double x,double y)
	{
		super(gravity,x,y); 	/*initialising the position of leave by using 
								super class function*/
	}	
	
	
	double freq,Hperfrequency,Hleave,position;
	int D = 0;
	
	/*calculating the finalposition of leave by using the function from the catchermain class*/
	
	double finalpositionleave(){  /*will explain the concept tommorow*/
		
		freq = 1;
		Hperfrequency = 1/8;
		Hleave = y;
		
		while(Hleave>1/8)
		{
			Hleave = Hleave-(1/2);
			counter++;
			D = D+1;
		}
			if(D/2 == 0)
				position = x+ (1/5);
			else position = x-(1/5);
			System.out.print("the position is"+ position +","+ 0);
			
		return(x);
		} 
	
	 
}
