package stick;

public class stick {
	public static void main(String[] args)
	{
		int noofelement; 
		int a=0, sticklength;
		int greatest;

				
		system.out.println("enter the length of stick to be compare");
		sticklength = in.nextInt();

		system.out.println("enter the no of diferent stick you need to be use");

		noofelement = in.nextlnt();
		
		int elements[] = int String[noofelement];
		
		for(int input=0;input<noofelement;input++)
		{
			system.out.println("put stick 1 length :");
			elements[input]= in.nextlnt();
		}
		
		
		int i,l,j,set,sumition[];    //chk here if need to initialise the length;

		int loop = (int)Math.pow(2,noofelement);  //calculating the total number of combination of given no of element 
		for(i=1;i<loop+1;i++)
		{
			int arrg[] = new int[noofelement]; 
			j=0;
			int combination = i;
			
		
			while(combination!=0)			
			{
				arrg[j]= combination%2;  		
				combination=combination/2;			
				j++;
			}

		
		for(noofset=1;noofset<loop+1;noofset++)
		{
		  	 for(l=0;l<noofelement;l++)
			{
				if(arr[l] == 1)
				sumition[set] = sumition[set]+ elements[l];
			   				
			}
			if(sumition[set]>sticklength)
			sumition[set] = 0;
			break;

			set++;
		
		}

		for(noofset=1;noofset=set;noofset++)
			{
			if(sumition[noofset] > sumition[noofset+1])
			greatest = sumition[noofset];
			else
			greatest = sumition[noofset+1];
			}

		}


		system.out.println("Maximum length of the smaller sticks:"+greatest);
			
	}
}
