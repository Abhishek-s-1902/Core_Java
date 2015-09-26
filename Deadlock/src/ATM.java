
public class ATM extends Thread{
	
	static Object id = new Object();
	static Object O = new Object();
	static double balance = 0;
	private char name;	
			
	ATM(char thischar){
			this.name = thischar;
			}
	
	 
	 
	 boolean balancecheck(){
		
		if(balance<300)
			return true;
		else return false;
		
	}
	
		  void credit(int amount){
			  synchronized(id){
			  boolean flag = balancecheck();
			  synchronized(O){
			  if(flag == true){
			 	balance = balance +amount;
			 	System.out.println(balance);
			 	id.notify();
			   }
			  else{
				  try{id.notify();
				O.wait(); 
				  }catch(InterruptedException  e){
					  
					  System.out.println(": InterruptedException");
					  //printstack
				  }}
				}
			  }  
		}
		
		 void debit(int amount){
			 synchronized(O){
			boolean flag = balancecheck();
			synchronized(id){
				if(flag == false){	
			balance = balance - amount;
			System.out.println(balance);
			O.notify();
			}
			try{O.notify();
				id.wait(); 
				  }catch(InterruptedException  e){
					  
					  System.out.println(": InterruptedException");
					  //printstack
				  	}}
			 }
		 }
		
		public void run(){
			if(this.name == 'a'){
			for(int i=0;i<10;i++){
				
				credit(100);
				}
			}
			if(this.name =='b'){
				for(int i=0;i<10;i++){
					
					debit(100);
					
					}}
			}
		
		
		public static void main(String args[]){
			
			
			ATM A1 = new ATM('a');
			ATM A2 = new ATM('b');
			
			A1.start();
			A2.start();
		}
		
		
	
}
