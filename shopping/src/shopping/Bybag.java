package shopping;

import java.util.Scanner;

public class Bybag extends AbstractClass implements InterfaceClass{

	
	double priceyello,pricegreen,pricered,priceorange;
	
	boolean T = true; 
	int quantityofNO, weightofID,NoofBags,loopprice,i;
	String elementWE[] = new String[10];
	double price;
	
	
	Scanner inputobj = new Scanner(System.in);
	
	void setquantity()
	{
		
		System.out.println("enter the no of bags");
		quantityofNO = inputobj.nextInt();
		
		for(i = 0;i<quantityofNO;i++)
		{
		System.out.println("enter the product colour for element:" + i);
		elementWE[i] = inputobj.nextLine();
		
		}
	}
	
	
	
	double price()
	{
		i=1;
		
		while(T)
		{
		switch(elementWE[i]) 
		{
		case "yellow":
			
			System.out.println("enter the no of bags for this  Item ");
			NoofBags = inputobj.nextInt();
			price = price + priceyello*NoofBags; 
			i++; continue;
			
		case "green":
			
			System.out.println("enter the no of bags for Individual Item :"+ i);
			NoofBags = inputobj.nextInt();
			price = price + pricegreen*NoofBags; 
			i++; continue;
			
		case "orange":
			
			System.out.println("enter the no of bags for Individual Item :"+ i);
			NoofBags = inputobj.nextInt();
			price = price + pricegreen*NoofBags;
			i++; continue;
			
		case "red":
			
			System.out.println("enter the no of bags for Individual Item :"+ i);
			NoofBags = inputobj.nextInt();
			price = price + pricegreen*NoofBags;
			i++; continue;
	 default:
			T=false;
		
			
		}
		}
		
		//discount to be calculated
		
		return(price);
			
		}
	}




