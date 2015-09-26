package superset1;

public class superset1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noofelement = Integer.valueOf(args[0]);
		int elements[] = new int[noofelement];
		int a=0;
		
		for(int i=1;i<=noofelement;i++)
		{
			elements[a] = Integer.valueOf(args[i]);
			a++;
		}
		
		int i,l,j;
		int loop = (int)Math.pow(2,noofelement);
		for(i=0;i<loop;i++)
		{
			int arr[] = new int[noofelement];
			j=0;
			int k = i;
			if(k == 0)
			{
				System.out.println("{}");
			}
			else
			{
			while(k!=0)
			{
				arr[j]= k%2;
				k=k/2;
				j++;
			}
			
			for(l=0;l<noofelement;l++)
			{
				if(arr[l] == 1)
				System.out.print(elements[l]);
								
			}
			System.out.println();
			}
			
		}
			
	}	

}
