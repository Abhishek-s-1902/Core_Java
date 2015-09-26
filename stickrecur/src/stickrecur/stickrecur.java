package stickrecur;
import java.util.Scanner;
public class stickrecur {
	public static void main(String[] args){
		   
		   
	       
        int noofelement;
        int a=0, sticklength;
        int greatest=0,noofset;
       
        int i,l,j,set=0;
       

        Scanner in = new Scanner(System.in);
       
        System.out.println("enter the length of stick to be compare");
        sticklength = in.nextInt();

        System.out.println("enter the no of diferent stick you need to be use");
       
        noofelement = in.nextInt();
       
        int elements[] = new int[noofelement];
       
        for(int input=0;input<noofelement;input++)
        {
            System.out.println("put stick length:"+ input );
            elements[input]= in.nextInt();
        }
       
        in.close();
       
       
        int loop = (int)Math.pow(2,noofelement);  //calculating the total number of combination of given no of element
       
        
        sum[0] = 0;
        
        int firstpass=0;
        int b = funcn(firstpass,loop);
        
        System.out.println("Maximum length of the smaller sticks:"+ sum[set-1]);
        
	}
	
   
       
        int funcn(int i,int loop,int noofelement) {
       
        while(i<loop)
        {
        	
            int a=0, sticklength;
            int greatest=0,noofset;
            int sum[]= new int[loop];
           
            int l,j,set=0;
            
            int arrg[] = new int[noofelement];
            j=0;
            int combination = i;
           
       
            while(combination!=0)           
            {
                arrg[j]= combination%2;         
                combination=combination/2;           
                j++;
            }
           
           
                   for(l=0;l<noofelement;l++)
                {
                    if(arrg[l] == 1)
                    {
                    sum[set] = sum[set]+ elements[l];
                    }
                }
                   
                  if (sum[set]>sticklength)
                  {
                  sum[set]=0;
                  continue;
                  }   
                     
                   set++;
                       
       
        }
       
        for (noofset = 0; noofset < set; noofset++) {
           
              for (int counter = 0; counter < noofset - set - 2; counter++) {
                 
                if (sum[counter] > sum[counter+1]) /* For descending order use < */
                {
                  int swap       = sum[counter];
                  sum[counter]   = sum[counter+1];
                  sum[counter+1] = swap;
                }
              }
            }
           
        
	
	
}
}

