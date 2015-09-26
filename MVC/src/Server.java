/**
 * 
 * 
 * MoneyUI.java
 * 
 * @Version 1.0 27/11/2013	
 * 
 * 
 * @author Aditya Kasturi 
 * 
 * @author Abhishek Sharma.
 * 
 */

import java.io.*;
import java.net.*;
import java.util.*;
public class Server {
	
	
/*
 *this methods calls the runserver() to create 
 *the server at port 5555
 * 	
 */
	public static final int port = 5555;
	public static void main(String args[])throws IOException,ClassNotFoundException{
		
		new Server().runServer();
		
	}	
		
	/*
	 *this method creates the server port and executes the gameplay
	 *with client
	 * 	
	 */	
	void runServer()throws IOException,ClassNotFoundException{
		
		 String S[] = new String[21];
		 String Stake[] = new String[21];
		Model M1 = new Model();
		View V1 = new View();
		Controller c1 = new Controller(V1,M1);
		String indexbool;
			boolean clickevent = true;
		
		ServerSocket serversocket = new ServerSocket(port);
		
		System.out.println("Server up & ready for connetion.....");
		Socket mySocket = serversocket.accept();
		
		/*
		 * try block going to create the buffers required for 
		 * storing data while transferring on net
		 */
		
		try{
			
		
			 PrintWriter out =
			            new PrintWriter(mySocket.getOutputStream(), true);
				
				BufferedReader in = new BufferedReader(
			            new InputStreamReader(mySocket.getInputStream()));
				BufferedReader stdIn =
			            new BufferedReader(
			                new InputStreamReader(System.in));	
				
				out.println("Hello Client: you are connected now. its your turn, press: Y");
			
				boolean loop = true;
		        String userInput1 = new String();
		        String userInput2 = new String();
		    
		        	 userInput1 = in.readLine();
		        	 userInput2 = userInput1;
		        	 System.out.println(userInput1);
		        	
		        	if(userInput1.toUpperCase().equals("Y")) {
		        		
		        		for(int i = 0;i<21;i++){
		        			userInput1 = in.readLine();
		        			Stake[i] = userInput1;
		        		System.out.print(Stake[i]+" ");	
		        		
		      	
		        		}
		        		
		        		System.out.println("");	
		        		
		        		c1.setInitialval(Stake);	
		        		
		        	
		        		 
		        	while(true){
		        		
		        			userInput1 = in.readLine();
		        			c1.gameplayAction(userInput1);
		        			clickevent = true;
		        			c1.setBool();
		        			while(clickevent){					//**********errorprone****************
			        			if(c1.getIndexBool()==false){
			           				continue;
			           			}
			        				indexbool = c1.getData();
			        				out.println(indexbool);
			        				clickevent = false;
			        				c1.setBool();
			        				c1.clearData();
			        			}
			        		
			        			
			        		}		
		        	}
		        	
		    }catch (UnknownHostException e) {
		        System.err.println("Don't know about host ");
		        System.exit(1);
		    } catch (IOException e) {
		        System.err.println("Couldn't get I/O for the connection to " 
		            );
		        System.exit(1);
		    } 
			
		
	}
}
		
	
	
	
	
	