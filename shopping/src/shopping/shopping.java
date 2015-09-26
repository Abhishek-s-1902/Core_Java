package shopping;
import java.util.Scanner;

public class shopping {

	public static void main(String[] args) {
		
		int numberofobj,objkind[] = new int[4];
		
		
		System.out.println("you can choose from the below objects");
		System.out.println("1: Individual obj");
		System.out.println("2: Weight");
		System.out.println("3: Number of object");
		System.out.println("4: By Bag");
		
		System.out.println("enter the nuber of diffrent kind of objetct to be purchase");
		Scanner inputobj = new Scanner(System.in);
		numberofobj = inputobj.nextInt();
		System.out.println("enter the number coresponds to your choice");
		
		for(int loopforobj= 0; loopforobj < numberofobj; loopforobj++)
		{
			objkind[loopforobj] = inputobj.nextInt();
			
				 
			}
			
			inputobj.close();
			
			for(int loopforeach= 0;loopforeach<numberofobj;loopforeach++)
			{
				switch(objkind[loopforeach]){
				case 1:
					Individual ID = new Individual();
					ID.setquantity();
					ID.price();	
					break;
				case 2:
					Weight WE = new Weight();
					WE.setquantity();
					WE.price();
					break;
				case 3:
					NoofObject NO = new NoofObject();
					NO.setquantity();
					NO.price();	
					break;
				case 4:
					Bybag BAG = new Bybag();
					BAG.setquantity();
					BAG.price();
					break;
				}
			
			
		}
		
	 
	}	
		

	

}
