package shopping;

import java.util.Scanner;

public class Individual extends AbstractClass implements InterfaceClass{

	int NoofID,quantityofID;
	String elementID;
	float priceofID;
	Individual(){}
	
	Scanner inputobj = new Scanner(System.in);
	
	
	
	
	void setquantity()
	{
		System.out.println("enter the no of Individual Item");
		NoofID = inputobj.nextInt();
		
		for(int i = 1; i<NoofID;i++)
		{
		System.out.println("enter the product colour for element:" + i);
		elementID = inputobj.nextLine();
		
		System.out.println("enter the quatity for Individual Item :"+ i);
		quantityofID = inputobj.nextInt();
		}
	}
	
	void price()
	{
		
	}
	
	
	
	

}
