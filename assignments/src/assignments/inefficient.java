package assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class inefficient {
	
	
	
 public static int x(Scanner aInputHandle,int i) {
		  			
	 int counter[] = new int[50];
		 			
		 		
		                       while ( aInputHandle.hasNextLine())    
		                       {
		                    	  String  character =  (aInputHandle.nextLine()).toLowerCase();
		                    	   	                        
		                    	  for(int charcount=0; charcount<character.length();charcount++)
		                    		  
		                         {
		                    		  int nextchar = character.charAt(charcount);
		                        	 if( i == nextchar)		                        	 
		                        		 counter[i-97]++;
		                         }
		                         
		                               	
		                  }	
		                       
		                       return(counter[i-97]);
		                       
		                       
		           }
		 			 
 
	
	
	
 public static void printCounter(int counter[])
 {
   for ( int index = 'a'; index <= 'z'; index ++ )
   {
  	 char charvalue= (char)index; 
            System.out.println( charvalue + ":   " + counter[index-97]);
   }
 }
	
	
	
	
	public static void main(String[] args) 
	{
		long startTime=0;
		long endTime=0;
		int counter[] = new int[50];
		
		              for ( String arg: args ) {
		                      try {
		                              Scanner sc;
		                              startTime = System.currentTimeMillis();
		                              //startTime = System.currentTimeMillis();
		                              
		                              for(int i='a'; i<'z';i++)
		                              {  
		                            counter[i-97]=  x( sc = new Scanner( new File(arg)), i );
		                              
		                              }
		                              
		                              printCounter(counter);
		                              endTime = System.currentTimeMillis();
		
		                      } catch ( FileNotFoundException e )     {
		                              System.err.println("File not found.");
		                              System.exit(0);
		                      } catch ( Exception e ) {
		                              System.err.println("Something went wrong.");
		                              System.exit(1);
	
		                      }
		              }
		              
		              System.out.println("Took : " + ((endTime - startTime) / 1000));
		}
}
