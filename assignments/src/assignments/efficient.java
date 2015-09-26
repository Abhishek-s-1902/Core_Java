package assignments;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class efficient {

	 public static void x(Scanner aInputHandle  ) {
		 
		 int counter[] = new int[50];
		 
		                       while ( aInputHandle.hasNextLine() )    
		                       {
		                         String character =  (aInputHandle.nextLine()).toLowerCase();
		                         
		                        
		                         for(int i=0; i<character.length();i++)
		                         {
		                        	 
		                        	 counter[(character.charAt(i))-97]++;
		                        	 
		                         }
		                         
		                               	
		                  }
		              
		                       printCounter(counter);     
		                       
		           }
	 
	 
	 
	 public static int Y(Scanner aInputHandle,int i) {
			
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
	 
	 
	 
	 
	
		
		public static void main(String[] args) 
		{
			long startTime=0;
			long endTime=0;
			long endTime2=0;
			int counter1[] = new int[50];
			
			              for ( String arg: args ) {
			                      try {
			                              Scanner sc;
			                              startTime = System.currentTimeMillis();
			                              //startTime = System.currentTimeMillis();
			                              x( sc = new Scanner( new File(arg)  ) ); // first program
			                              endTime = System.currentTimeMillis();
			                              
			                              
			                              
			                              for(int i='a'; i<'z';i++)
			                              {  
			                            counter1[i-97]=  Y( sc = new Scanner( new File(arg)), i ); // 2nd method
			                              
			                              }
			                              
			                              System.out.println("for program 2");
			                              printCounter(counter1);
			                              endTime2 = System.currentTimeMillis();
			                              
			
			                              
			                      } catch ( FileNotFoundException e )     {
			                              System.err.println("File not found.");
			                              System.exit(0);
			                      } catch ( Exception e ) {
			                              System.err.println("Something went wrong.");
			                              System.exit(1);
		
			                      }
			              }
			              
			              System.out.println("for 1st program it took : " + (endTime - startTime));
			              System.out.println("for 2nd program it took :: " + (endTime2 - startTime));
			}
	
	
	
	
		 
		 
		           public static void printCounter(int counter[])
		           {
		             for ( int index = 'a'; index <= 'z'; index ++ )
		             {
		            	 char charvalue= (char)index; 
		                      System.out.println( charvalue + ":   " + counter[index-97]);
		             }
		           }
	
	

}
	
	

