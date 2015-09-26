package shopping;

import java.util.Scanner;

public class Weight implements InterfaceClass{
	
	int quantityofID, weightofID;
	String elementWE;
	
	Weight(){}
	Scanner inputobj = new Scanner(System.in);
	
	void setquantity(int x)
	{
		
		System.out.println("enter the no of Individual Item");
		quantityofID = inputobj.nextInt();
		
		for(int i = 1; i<quantityofID;i++)
		{
		System.out.println("enter the product colour for element:" + i);
		elementWE = inputobj.nextLine();
		
		System.out.println("enter the weight for Individual Item :"+ i);
		weightofID = inputobj.nextInt();
		}
	}
	
	void price()
	{
		
	}

	

}
