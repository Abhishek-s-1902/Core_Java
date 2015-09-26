
import java.util.Random;
/**
 * MoneyModel.java
 * 
 * @author  Abhishek Sharma and Aditya Kasturi
 * This Class contains The Model of The Game Money and Then It also Implements 
 * 
 * Here It all Stores the data and Then it will retrieve The Data When Called
 * for
 * 
 * 
 */
public class MoneyModel {
	private int playerOneScore=0;
	private int playerTwoScore=0;	
	private static int oneNumber;
	private static int twoNumber;	
	/**
	  * 
	  * It will generate the suit number Randomly for the Player to Know 
	  * which deck he has got .
	  * 
	  * @return suitNumber It will return the Suit Number.
	  * 
	  */
	 private int SuitNumber(){
			Random randomGenerator=new Random();
			int suitNumber=randomGenerator.nextInt(4);//0-3 Random Numbers Range.		
			return suitNumber;
		} 
	 /**
	  * 
	  * Randomly Generates the Number in the suit.
	  * 
	  * 
	  * @return numintheSuit It will return the Number in the Suit.
	  */
	 private int NumberintheSuit(){
			Random randomGenerator=new Random();
			int numintheSuit=randomGenerator.nextInt(12);//0-12 Random Numbers Range.		
			return numintheSuit;
		}
	 /**
	  * 
	  * @param number This is the Suit number which is randomly Generated in the
	  * 			  function.
	  * @return name It will return the suitName with the String which is 
	  * 				Assigned to it.
	  */
	 private String SuitName(int number){
			String name="";
			if(number==0)name="CLUB ";
			else if(number==1)name="DIAMOND ";
			else if(number==2)name="HEART ";
			else if(number==3)name="SPADE ";
			return name;
		}	
	 /**
	  * 
	  * oneCard This Method Will deliver  the Randomly selected card to
	  * The User or Player one .
	  * 
	  * @return oneCard The Name of The Card Associated with player One.
	  * 				IT will also Assigns The Number of Player one .
	  */
	 public String getOneCard(){
		 String oneCard;
		 oneNumber=1;
		 String numberintheSuit="1";
		 int suitNumber=SuitNumber();//Generates a Random Number For Deck.
		 String suitName=SuitName(suitNumber);//Returns the Deck Name .
		 int number=NumberintheSuit();//Randomly Generated.
		 
		 oneNumber=number+1;//Assigning the One Player Number .
		 System.out.println("one Number "+ oneNumber);
		 if(number>9){
             if(number==10)numberintheSuit=" J";
             else if(number==11)numberintheSuit=" Q";
             else if(number==12)numberintheSuit=" K";
         } 
		 else numberintheSuit=String.valueOf(oneNumber);
		 
		 oneCard=suitName+" "+numberintheSuit;
		 return oneCard;
	 }
	 /**
	  * twoCard this Method will deliver the randomly generated Number in 
	  * for the Player Two.
	  * 
	  * @return twoCard It will return Card Associated with player Two.
	  * 
	  */
	 public String getTwoCard(){
		 String twoCard;
		 twoNumber=1;
		 String numberintheSuit="1";
		 int suitNumber=SuitNumber();
		 String suitName=SuitName(suitNumber);
		 int number=NumberintheSuit();
		 
		 twoNumber=number+1;
		 System.out.println(" two Number "+twoNumber);
		 if(number>9){
             if(number==10)numberintheSuit=" J";
             else if(number==11)numberintheSuit=" Q";
             else if(number==12)numberintheSuit=" K";
         } 
		 else numberintheSuit=String.valueOf(twoNumber);
		 
		 twoCard=suitName+" "+numberintheSuit;
		 return twoCard;
	 }
	 /**
	  * 
	  * It will return the Name of the Card for the user when ever Called
	  * 
	  * 
	  * @return userCard The Name of the card for the Player.
	  * 
	  */
	 public String getCard(){		
			String userCard;
			String numberintheSuit="1";//Initializing the Number with one.
	                int suitNumber=SuitNumber();		
	                String suitName=SuitName(suitNumber);                
	                int number=NumberintheSuit();
	                if(number>9){
	                    if(number==10)numberintheSuit=" J";
	                    else if(number==11)numberintheSuit=" Q";
	                    else if(number==12)numberintheSuit=" K";
	                } 
	                else
	                	numberintheSuit=String.valueOf(number+1);
	            		userCard=suitName+" "+numberintheSuit;
			return userCard;
		}
	 /**
	  * Adds the score to the Player with the Highest Score .
	  * 
	  */
	 public void Score(){
		 int roundWin;//Whose score is Highest in Each Play then It is Added.
		 roundWin=getHighestScore();
		 if(roundWin==1)addScoretoPlayerOne((oneNumber-twoNumber));
		 else addScoretoPlayerTwo(twoNumber-oneNumber);
	 }
	 /**
	  * 
	  * @return playerOneScore It will return the Player One Score at the 
	  * 		moment when called.
	  */
	 public String getPlayerOneScore(){
		String score=String.valueOf(playerOneScore); 
		return score;
	 }
	 /**
	  * 
	  * @return playerTwoScore It will return the Player Two Score at the 
	  *                        moment when called.
	  */
	 public String getPlayerTwoScore(){
		 String score=String.valueOf(playerTwoScore);
		 return score;
	 }	
	 /**
	  * Adds The Score to The Player If The Player has the Highest Score.
	  * 
	  * @param diff The Difference between the Two Card values are Added here.
	  */
	 private void addScoretoPlayerOne(int diff){
		 playerOneScore=playerOneScore+diff;
		 System.out.println("playerOneScore " + playerOneScore);
	 }
	 /**
	  * Adds the Score to the Player if the Player has the Highest Score.
	  * 
	  * @param diff The Difference between the Two card values are Added Here.
	  */
	 private void addScoretoPlayerTwo(int diff){
		 playerTwoScore=playerTwoScore+diff;
		 System.out.println("playertwoScore  " + playerTwoScore);
	 }	 
	 /**
	  * 
	  * @return The Highest Scorer among the Two Players .
	  * 
	  */
	 public int getHighestScore(){
		 System.out.println(" One Number in getHighest "+oneNumber);
		 System.out.println("Two Number in getHi"+twoNumber);
		 if(oneNumber>twoNumber)return 1;
		 else return 2;
	 }
	 public int playerOneScore(){
		 return playerOneScore;
	 }
	 public int playerTwoScore(){
		 return playerTwoScore;
	 }
	 
	public void setOnenumber(String one){
		 
		if(one.equals("J")){
			oneNumber = 11;
		}else if(one.equals("Q")){
			oneNumber = 12;
		}else if(one.equals("K")){
				oneNumber = 13;
		}else{
		oneNumber = Integer.parseInt(one);}
		System.out.println(oneNumber);
	 }
}
