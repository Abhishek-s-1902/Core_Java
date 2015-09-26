package catcher;

/*extending the catchermain to toast class*/ 
public class toast extends catchermain{
	
	double x, y,gravity;
	
	toast(double gravity,double x,double y)
	{
			super(gravity,x,y);    /*initialising the position of toast by 
										using the super class classmain method*/
	}
	
	double freq,Hperfrequency,Htoast;
	int D = 0;String position;
	
	/*calculating the finalposition of toast on ground*/
	double FinalPositionToast(){ /*will explain you the concept tommotow*/
		freq = 1;
		Hperfrequency = 1/15;
		Htoast = y;
		
		while(Htoast>1/15)
		{
			Htoast = Htoast-(1/2);
			counter++;
			D = D+1;
		}
			if(D/2 == 0)
				 position = "buttered";
			else position = "unbuttered";
			
			System.out.println("the position is"+ position);
						
		return(0);
		} 
		
	}


