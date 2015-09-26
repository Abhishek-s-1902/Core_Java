
           import java.util.*;
     
           class Thread_4 extends Thread{
        	   
        	  static Object o = new Object();
        	  int value; 
        	  static Vector<Integer> Vec = new Vector<Integer>();
        	   
        	  Thread_4(){}
        	  
        	  Thread_4(int val){
        		  
        		  value = val;
        	  }
        		  
        	  
        		  
        		  
        		 public synchronized  void funprime(int nextnum){
        			   
        		   int i=2,v;
        		  v=nextnum;
        	     while(i < v){
        	    	 if(nextnum%i==0){
        	    		 return;
        	    	 }
        	    	 else{
        	    		 v= (int)(nextnum/i);
        	    		 i++;
        	    		 continue;
        	    	 }//else 
        	     
        	     
        	     } //while
        	     
        	     Vec.add(nextnum);
        	   }
 
        	
       public  Vector<Integer>	bubbleshort(){
        		if(Vec.size()==1){return Vec;}
        		else{
        		for(int j=0;j<Vec.size();j++){
        			for(int i=0;i<Vec.size()-1;i++){
        			Integer temp = Vec.get(i);
        			if(temp > Vec.get(i+1)){
        				
        				Vec.add(i,Vec.get(i+1));
        				Vec.add(i+1,temp);
        							
        			}}}}
    return Vec;
       }
       
       
       public void run(){
			
			
			funprime(value);
		
		}
       
        	
           public static void main(String args[]){
        	   
        	   Vector<Integer> count =  new Vector<Integer>();
        	   
        	   Integer temp = 1;
        	   Class C =temp.getClass();
        	  System.out.println(C);
        	 // System.out.println( instanceof args[0]);
        	   Thread_4 T4 = new Thread_4();
        	   
        	   for(int i = 0;i<args.length;i++){
        		          		   
        		   try{
        			   Integer.parseInt(args[i]);
        			   
        		   }
        		   catch(Exception e)
        		   {
        			   System.out.println(e.getMessage());
        		   }
        	   if(Integer.parseInt(args[i])<0){
        		   System.out.println("negetive number is not accepted");
        		   return;
        	   }
        		   
        		   count.add(Integer.parseInt(args[i]));
        	   }
        		   
        			   
        			   
        		   
        	   
        	   
        	   Thread  Tnew[] = new Thread_4[count.size()];
        	   
        	     	   
        	  
        	   for(int i = 0;i<count.size();i++){
        		    Tnew[i] = new Thread_4(count.get(i));
        		  	 Tnew[i].start();
        		 }
        	   
        	   
        	   for(int i = 0;i<args.length;i++){
        		   try{
        		     	 Tnew[i].join();
        		   }
        			   catch(InterruptedException e ){
        					System.out.println("Interupted");
        				}
        		   } 
        		     		
       			
       			    		
        	   
        	   Vector<Integer> Vec1=  T4.bubbleshort();
        	   
        	   System.out.println(Vec1);
           }
          }
           
           
           
        	   
           