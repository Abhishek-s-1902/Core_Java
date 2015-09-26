package shopping;

import java.util.Scanner;

public class NoofObject extends AbstractClass implements InterfaceClass{

	
	int quantityofNO, weightofID;
	String elementWE[] = new String[5];
	int Noofitems[] = new int[5];
	
	Scanner inputobj = new Scanner(System.in);
	
	void setquantity()
	{
		
		System.out.println("enter the no of Individual Item");
		quantityofNO = inputobj.nextInt();
		
		for(int i = 1; i<quantityofNO;i++)
		{
		System.out.println("enter the product colour for element:" + i);
		elementWE[i] = inputobj.nextLine();
		
		System.out.println("enter the no of this Item");
		Noofitems[i] = inputobj.nextInt();
		}
	}
	
	void price()
	{
		
		
	}
	

}
