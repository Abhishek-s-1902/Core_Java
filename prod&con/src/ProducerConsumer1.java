

	
	import java.util.LinkedList;
	/*
	 * 
	 * ProducerConsumer.java
	 * 
	 * @version: 1.0 10/30/2013
	 * 
	 * @author : Aditya Kasturi 
	 * 
	 * @author : Abhishek Sharma 
	 * 
	 * This Producer and Consumer Program is Used to perform the Operation on 
	 * on Threads and It displays how the Threads are Called and Then It will 
	 * 
	 * use only in One space for Producing the output .
	 * 
	 * Not Only That It also Uses the Wait and Notify in the Method to Have the 
	 * 
	 * the Intercommunication between the Two Blocks .
	 * 
	 * 
	 *  
	 */
	public class ProducerConsumer1{
	/*
	* LinkedList is used here for The Adding and Removing of The 
	* Element Into The LinkedList.
	* 
	* Here the Limit is set into One and Then The Final Length is Fixed 
	* so That There Will be no Alteration After Wards
	* 
	*/
	private static LinkedList<Integer> number=new LinkedList<Integer>();	
	private final int limit=1;
	static Object lock=new Object();
	/*
	* 
	*/
	public void Producer(){
	//this is The Number which is Used to Add in the List.
	while(true){
	
	while (number.size()==limit){
	try {
		System.out.println("P/0");
		Thread.sleep(1000);
	} catch (InterruptedException e) {
	e.printStackTrace();
	}
	}	
	
	funPC('p');
	 
	}}
	
	static int numberAddedintheList=0;
	
	  void funPC(char a){
		synchronized (lock){
		if(a == 'p'){
			int num=++numberAddedintheList;
			number.add(num);
			System.out.println("P/"+num);
				notifyAll();
			//System.out.println("Notified C");
				
				try {
					
					lock.wait();
					
				} catch (InterruptedException e){
				e.printStackTrace();
				}
			
			
		}
		
		if(a== 'c'){
			int Number=number.removeFirst();	
			System.out.println("C/"+Number);
			notifyAll();
			 
			try {
				
				lock.wait();
				
			} catch (InterruptedException e){
			e.printStackTrace();
			}
			}
		}
		}
			
			
		
		
	
	
	
	
	public void Consumer() {
	while(true){
	//System.out.println("Enter C");
	
	//System.out.println("Enter c Syn");
	while(number.size()==0){
		System.out.println("C/0");
	try {
		Thread.sleep(1400);
		} catch (InterruptedException e) {
	e.printStackTrace();
	}
	}
     	funPC('c');
	
	}}
	
	public static void main(String args[]) throws InterruptedException{
	final ProducerConsumer1 pcObject=new ProducerConsumer1();
	Thread t1=new Thread(new Runnable() {
	public void run() {
	pcObject.Producer();
	}
	});
	Thread t2=new Thread(new Runnable() {
	@Override
	public void run() {
	// TODO Auto-generated method stub
	pcObject.Consumer();
	}
	});
	t2.start();
	t1.start();
	}
	}


