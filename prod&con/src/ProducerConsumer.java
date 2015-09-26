
	
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
	public class ProducerConsumer{
	/*
	* LinkedList is used here for The Adding and Removing of The 
	* Element Into The LinkedList.
	* 
	* Here the Limit is set into One and Then The Final Length is Fixed 
	* so That There Will be no Alteration After Wards
	* 
	*/
	private LinkedList<Integer> number=new LinkedList<Integer>();	
	private final int limit=1;
	Object lock=new Object();
	/*
	* 
	*/
	public void Producer(){
	int numberAddedintheList=0;//this is The Number which is Used to Add in the List.
	while(true){
	synchronized (lock) {
	while (number.size()==limit){
	try {
	//int num=numberAddedintheList;
	//System.out.println("P/"+num);
	lock.wait();
	} catch (InterruptedException e) {
	e.printStackTrace();
	}
	}	
	int num=numberAddedintheList;
	number.add(numberAddedintheList++);
	lock.notify();
	System.out.println("P/"+num);	
	//System.out.println("Notified C");
	}
	}
	}
	public void Consumer() {
	while(true){
	//System.out.println("Enter C");
	synchronized (lock){
	//System.out.println("Enter c Syn");
	while(number.size()==0){
	try {
//		System.out.println("Enter c Wait");
	lock.wait();	
	} catch (InterruptedException e) {
	e.printStackTrace();
	}
	}
	int Number=number.removeFirst();	
	System.out.println("C/"+Number);
	lock.notify();
	//System.out.println("P Notify");
	}	
	try {
	Thread.sleep(2000);
	} catch (InterruptedException e) {
	e.printStackTrace();
	}	
	}
	}
	public static void main(String args[]) throws InterruptedException{
	final ProducerConsumer pcObject=new ProducerConsumer();
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


