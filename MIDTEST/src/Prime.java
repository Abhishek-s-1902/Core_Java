import java.util.*;

public class Prime extends Thread{
	
	
	/*static int noofelement;
	int value = 0; 
	static Vector<Integer> Vec = new Vector<Integer>(); 
	
	public Prime(){}
	
 public  Prime(int val){
	 this.value = val;
 }
 
	
	
 synchronized void funprime(int nextnum){
		   
		   int i=2,v;
		  v=nextnum;
	     while(i < v){
	    	 if(nextnum%i==0){
	    		 return;
	    	 }
	    	 else{
	    		 v= (int)(nextnum/i);
	    		 i++;
	    		 continue;}
	    	 }//else 
	     
	     
	    					//keep track for the value
				Vec.add(nextnum);
	    
	    	} 
	    
	     
	   
	
 synchronized public Vector<Integer>	 bubbleshort(){
		if(Vec.size()==1){return Vec;}
		else{
		for(int j=0;j<Vec.size();j++){
			for(int i=0;i== Vec.size();i++){
			Integer temp = Vec.get(i);
			if(temp < Vec.get(i+1)){
				Vec.add(i,Vec.get(j));
				Vec.add(j,temp);
							
			}}}}
		
return Vec;
}
	
	
	public void run(){
		
		
			funprime(value);
		
	
	
	}*/
	
	
	
	public static void main(String args[]){
		
		Vector V1 = new Vector();
		for(int i=0;i<5;i++){
		V1.add((int)( Math.random()*99 ));
		}
		
		System.out.println(V1);
		/*for(int i=0;i<5;i++){
			System.out.println(V1.get(i));
			}*/
		
		System.out.println("----------------");
		Collections.shuffle(V1);
		
		for(int i=0;i<5;i++){
			System.out.println(V1.get(i));
			}
		
		
		/*Prime Tshort = new Prime();
		Prime Tnew[] = new Prime[args.length];
		
		noofelement = args.length;
		for(int i=0;i<args.length;i++){
			Tnew[i] = new Prime(Integer.parseInt(args[i]));
			Tnew[i].start();}
		
		
		for(int i=0;i<args.length;i++){	
			try{
				Tnew[i].join();
	         }
	    catch(InterruptedException e){
	      System.out.println("Interrupted!");
	     }	
			
			
		}
		
		
		Tshort.bubbleshort();
		System.out.println(Vec);*/
		
		
	}
	
}
	
	
	
	
	



