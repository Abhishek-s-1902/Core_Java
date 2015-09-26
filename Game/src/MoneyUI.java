/**
 * 
 * 
 * MoneyUI.java
 * 
 * @Version 1.0 18/11/2013	
 * 
 * 
 * @author Aditya Kasturi 
 * 
 * @author Abhishek Sharma.
 * 
 */
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class MoneyUI extends javax.swing.JFrame {
    
    private javax.swing.JLabel _oneScore;
    private javax.swing.JLabel _twoScore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton oneButton;
    private javax.swing.JLabel oneCard;
    private javax.swing.JLabel oneScore;
    private javax.swing.JLabel twoCard;
    private javax.swing.JLabel twoScore;
    // End of variables declaration
    /**
     * Creates new form MoneyUI
     * and Initializes all The Components.
     * 
     */	 
    public MoneyUI() {
        initComponents();
    }
    private int numberofClicks=1;
    private static int onePlayerNumber=0;
    private static int cycle=1;
    private int twoPlayerNumber=0;
    private int scoreOne=0;
    private int scoreTwo=0;
    /**
     * 
     * This is The Method That is Used to Initialize the Components 
     * into the Perfect State. 
     * 
     */
    private void initComponents() {
        oneButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        oneCard = new javax.swing.JLabel();
        twoCard = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        oneScore = new javax.swing.JLabel();
        twoScore = new javax.swing.JLabel();
        _twoScore = new javax.swing.JLabel();
        _oneScore = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        oneButton.setFont(new java.awt.Font("Britannic Bold", 1, 14)); 
        oneButton.setText("Player 1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });
        jLabel1.setFont(new java.awt.Font("Harrington", 3, 14)); 
        jLabel1.setText("Player One :");

        jLabel2.setFont(new java.awt.Font("Harrington", 3, 14)); 
        jLabel2.setText("Player Two :");

        oneCard.setFont(new java.awt.Font("Elephant", 2, 24));
        oneCard.setText("Card Name ");

        twoCard.setFont(new java.awt.Font("Elephant", 2, 24));
        twoCard.setText("Card Name");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("MONEY");
        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));

        oneScore.setText("Score :");

        twoScore.setText("Score :");

        _twoScore.setText("0");

        _oneScore.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(268, 268, 268)
            .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addComponent(oneScore)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(_oneScore)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
            .addGap(44, 44, 44)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(oneCard, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addComponent(twoScore)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(_twoScore)
            .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(twoCard, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
            .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(66, 66, 66)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
            .addGap(142, 142, 142)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(oneCard)
            .addComponent(jLabel2)
            .addComponent(twoCard, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(oneScore)
            .addComponent(twoScore)
            .addComponent(_twoScore)
            .addComponent(_oneScore))
            .addGap(57, 57, 57)
            .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(49, 49, 49))
        );
        pack();
    }                     
    /**
     * SuitNumber
     * 
     * @return suitNumber will Return The random Suit Number.
     *  
     */
    private int SuitNumber(){
		Random randomGenerator=new Random();
		int suitNumber=randomGenerator.nextInt(4);//0-3 Random Numbers Range.		
		return suitNumber;
	} 
    /**
     * setScore It will Set Score for the Players .
     * 
     */
    private void setScore(){
        int score;
        String _score;   
            if(onePlayerNumber>twoPlayerNumber){
                score=onePlayerNumber-twoPlayerNumber;
                scoreOne=score+scoreOne;    
                _score=String.valueOf(scoreOne);
                _twoScore.setText(_score);
            }
            else {
            score=twoPlayerNumber-onePlayerNumber;
            scoreTwo=score+scoreTwo;
            _score=String.valueOf(scoreTwo);            
            _oneScore.setText(_score);
            }
        if(scoreOne>20){
        JOptionPane.showMessageDialog(this,"Player Two Wins ");        
        }
        else if(scoreTwo>20){
        JOptionPane.showMessageDialog(this,"Player One Wins");
        }
        cycle++;
    }
    /**
     * 
     * @return the Random Number in the Deck.
     * 
     */
    private int NumberintheSuit(){
		Random randomGenerator=new Random();
		int numintheSuit=randomGenerator.nextInt(12);//0-12 Random Numbers Range.		
		return numintheSuit;
	}
    /**
     * 
     * @param number The Random number of The Suit.
     * 
     * @return name of The String.
     * 
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
     * getCard() It will return The 
     * 
     * @return usercard It will return the UserCArd Name.
     * 
     */
    public String getCard(){		
		String userCard;
		String numberintheSuit="1";
                int suitNumber=SuitNumber();		
                String suitName=SuitName(suitNumber);                
                int number=NumberintheSuit();
                int currentNumber=numberofClicks;
                if((currentNumber%2)==0){
                onePlayerNumber=number+1;
                }
                else twoPlayerNumber=number+1;
                if(number>9){
                    if(number==10)numberintheSuit=" J";
                    else if(number==11)numberintheSuit=" Q";
                    else if(number==12)numberintheSuit=" K";
                } 
                else
                	numberintheSuit=String.valueOf(number+1);
            		userCard=suitName+"  "+numberintheSuit;
		return userCard;
	}
    /**
     * 
     * @param evt It is The ActionEvent Which will invoke when
     * 				mouse is Clicked. 
     * 			  	
     */
    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String k;//score;
        int currentNumber=numberofClicks;        
        k=getCard(); 
        if((currentNumber%2)==0){
            oneButton.setText("Player ONE");               
            twoCard.setText(k);    
             setScore();
        }
        else {
            oneButton.setText("Player TWO");
            oneCard.setText(k);
        }       
        numberofClicks++;        
    }                                         

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    	/**
    	 * This will Set up the Nimbus Look and Then It will 
    	 * Make look like and Feel by Default look and feel.
    	 * 
    	 */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MoneyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoneyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoneyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoneyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoneyUI().setVisible(true);
            }
        });
    }
               
}
