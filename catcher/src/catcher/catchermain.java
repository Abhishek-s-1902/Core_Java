package catcher;

/*catcher class*/

public class catchermain {
	
	/* arg : x,y : coordinates
	 * gravity: by which force the object is coming to the ground
	 * xfinal : final x coordinates 
	 */
	double x, y,gravity,xfinal; 
	int counter;
	
	/*catchermain()
	{
	
	}*/
	
	/*intialising position of the catcher in the air*/
	catchermain(double gravity,double x,double y)
	{
		this.gravity= gravity;
		this.x= x;
		this.y= y;
	}
	
	/*calculating the final position*/
	
	double finalposition() 
	{
		int degree = 60;   /*at which angle the catcher is coming to ground*/
		double height = y; 
		xfinal = (x/height)*(1/1.732); /* calculating the position on ground by pythagoras theorem
		return(xfinal);
	}
	
	/*calcilating the no of leaves which can fall under the radius of catcher on ground*/
	
		
		/*sending the all leave position in array & the func get called from the main program*/
	
		void catcherTrytocatch(double xleave[],int counter) 
	{
		for(int i=0;i<counter;i++)
		{
		if (xleave[i]<xfinal);   /*if the leave distance is less than the catcher x cordinate on ground*/
		this.counter++;			 /*its in the range*/
		}
		
		/*putting the count of leave in range*/
		System.out.println("the catcher catches:"+ this.counter+ "leaves");
	}
	
} 	

	



