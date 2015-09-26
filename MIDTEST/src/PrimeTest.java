/*
 * PrimeTest.java
 * 
 * version : 1.0 10/24/2013
 * 
 * @author : Aditya Kasturi 
 * @author : Abhishek Sharma
 * 
 * This PrimeTest Program Tests PrimeNumbers from the command line arguments 
 * and Then It will sort Them in order to Print the Output in Correct Order.
 * 
 *  
 * 
 */
public class PrimeTest extends Thread{
	/*
	 * @param a              This Integer is Used to Call
	 * 						 Store the argument Value 
	 *                       of The Number in Each Thread.
	 * @param sizeofNumbers  It is Used to Store The Prime Number Size
	 * 
	 * @param primeCount     It is Used in Assigning the Values in the array.
	 * 
	 * @param  k[]           This Array is Used to Store the Prime Numbers 
	 * 						 
	 * 
	 */
	private int a=0;
	private static int sizeofNumbers=0;
	private static int primeCount=0;
	private static int k[];
	/*
	 * PrimeTest() This is The Default Constructor of The Class.
	 */
	public PrimeTest(){}
	/*
	 * This Parameterized Constructor is Used to Initialize The Elements into 
	 * The Thread and Used in Run Method.
	 */
	public PrimeTest(int a){this.a=a;}
	/*
	 * This run is Used to Replace the Superclass Run and Then It is Used 
	 * Run with the Threads in the Threads and then The Threads in this Class
	 * Threads Use This.
	 */
	public void run(){
		if(isPrime(this.a))
			k[primeCount++]=this.a;
	}
	/*
	 * sizeofPrime() Check the Size of The Prime Numbers When they are 
	 * Initialized in the Main Method.	
	 */
	private int sizeofPrime(int inputNumbers[]){
		int size=0;
		int length=inputNumbers.length;		
		 for(int i=0;i<length;i++)
			if(isPrime(inputNumbers[i]))size++;
		sizeofNumbers=size;
		reInitialization();
		return size;
	}
	/*
	 * This is Used to reInitialize the Size of The Array.
	 */
	private int reInitialization(){
		int size=sizeofNumbers;
		k=new int[sizeofNumbers];
		return size;
	}
	/*
	 * isPrime is the Method Which is Used to Determine whether the given 
	 * input is Prime or Not .
	 * 
	 */
	private boolean isPrime(int a){
		if(a<=1)return false;
		if(a==2)return true;
		int iterator,remainder;
			for(iterator=2;iterator<a;iterator++){		
				remainder=a%iterator;
				if(remainder==0)return false;		
				//primeCount++;
			}
		return true;	
	}
	/*
	 * sort Method is Used to sort the Numbers in Order and 
	 * Then it is Used to Print The Numbers
	 */
	private void sort(int array[]){
		int temp;
		boolean fixednum=false;
		while(fixednum==false){
		fixednum=true;
			for(int i=0;i<array.length-1;i++)
				if(array[i]>array[i+1]){
					temp=array[i+1];
					array[i+1]=array[i];
					array[i]=temp;
				fixednum =false;
				}}
		for(int i=0;i<array.length;i++)System.out.print("  "+array[i]);			
	}
	/*
	 * The Main Method First Checks " If the Arguments are full or not  "
	 * If it is Yes then It will Throw Threads for each argument number and 
	 * Perform The Operation .
	 * 
	 */
	public static void main(String args[]){
		if (args != null) {
			int size=args.length;
			int prime[] = new int[size];	
			PrimeTest t=new PrimeTest();			
			for(int i=0;i<size;i++)
				prime[i] = Integer.valueOf(args[i]);
			t.sizeofPrime(prime);
			t.start();
			for (int n = 0; n < size; ++ n)	{
				PrimeTest t1=new PrimeTest(prime[n]);
				t1.start();
			}
			System.out.print("\n");
			t.sort(k);
			System.out.println("\t");
		}		
	}
}

