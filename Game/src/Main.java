import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame implements ActionListener{

	  private static final long serialVersionUID = 1L;
	  
	private JPanel contentPane;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	 JButton one = new JButton("click");
	 JButton two = new JButton("click");
	 JButton three = new JButton("click");
	 JButton four = new JButton("click");
	 JButton five = new JButton("click");
	 JButton six = new JButton("click");
	 JButton seven = new JButton("click");
	 JButton eight = new JButton("click");
	 JButton nine = new JButton("click");
	 JButton ten = new JButton("click");
	 JButton eleven = new JButton("click");
	 JButton twelve = new JButton("click");
	 JButton thirteen = new JButton("click");
	 JButton fourteen = new JButton("click");
	 JButton fifteen = new JButton("click");
	 JButton sixteen = new JButton("click");
	 JButton seventeen = new JButton("click");
	 JButton eighteen = new JButton("click");
	 JButton nineteen = new JButton("click");
	 JButton twenty = new JButton("click");
	 JButton textDisplay = new JButton("click to play");
	 
	 static Vector V1 = new Vector();
	 static Vector V2 = new Vector();
	 TextField txt=new TextField();
	 
	public Main() {
		
		Dimension boardSize = new Dimension(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.red);
		contentPane.setLayout( new GridLayout(8, 8) );
		contentPane.setPreferredSize( boardSize );
		contentPane.setBounds(0, 0, boardSize.width, boardSize.height);
		
		
		for(int i=0;i<20;i++){
		V1.add((int)( Math.random()*99 ));
		}
		
		System.out.println(V1);

		V2 = V1;
		
		Collections.shuffle(V2);
		int luckyno = (int)V2.get(0);
		
		contentPane.add(textDisplay);
		textDisplay.setBounds(300,150,150, 60);
				
		contentPane.add(txt);
		txt.setBounds(300, 0, 150, 100);
		txt.setText("your lucky no:"+ luckyno);
		 
		one.setBounds(0, 0, 60, 60);
		contentPane.add(one);
		one.addActionListener(this);
		
		 
		two.setBounds(0, 60, 60, 60);
		contentPane.add(two);
		two.addActionListener(this);
		
		three.setBounds(0,120, 60, 60);
		contentPane.add(three);
		three.addActionListener(this);
		
		four.setBounds(0,180, 60, 60);
		contentPane.add(four);
		four.addActionListener(this);
		
		five.setBounds(60,0, 60, 60);
		contentPane.add(five);
		five.addActionListener(this);
		
		six.setBounds(60,60,60, 60);
		contentPane.add(six);
		six.addActionListener(this);
		
		seven.setBounds(60,120, 60, 60);
		contentPane.add(seven);
		seven.addActionListener(this);
		
		eight.setBounds(60,180, 60, 60);
		contentPane.add(eight);
		eight.addActionListener(this);
		
		nine.setBounds(120, 0, 60, 60);
		contentPane.add(nine);
		nine.addActionListener(this);
		
		ten.setBounds(120, 60, 60, 60);
		contentPane.add(ten);
		ten.addActionListener(this);
		
		eleven.setBounds(120,120, 60, 60);
		contentPane.add(eleven);
		
		
		twelve.setBounds(120, 180, 60, 60);
		contentPane.add(twelve);
		
		
		thirteen.setBounds(180,0, 60, 60);
		contentPane.add(thirteen);
		
		
		fourteen.setBounds(180, 60, 60, 60);
		contentPane.add(fourteen);
		
		
		fifteen.setBounds(180,120,60, 60);
		contentPane.add(fifteen);
		
		
		sixteen.setBounds(180,180, 60, 60);
		contentPane.add(sixteen);
		
		
		seventeen.setBounds(240 , 0, 60, 60);
		contentPane.add(seventeen);
		
		
		eighteen.setBounds(240, 60, 60, 60);
		contentPane.add(eighteen);
		
		
		nineteen.setBounds(240, 120, 60, 60);
		contentPane.add(nineteen);
		
		
		twenty.setBounds(240,180, 60, 60);
		contentPane.add(twenty);
		
		
				
	}
	
	
	
	 public void actionPerformed(ActionEvent e) {
	        
		    if(e.getSource()==one) {
		           one.setText("1");
		           }
		    else if(e.getSource()==two) {
		           two.setText("2");
		            }
		    else if(e.getSource()==three) {
		           three.setText("3");
		          }
		    else if(e.getSource()==four) {
		           four.setText("4");
		           }
		    else if(e.getSource()==five) {
		           five.setText("5");
		            }
		    else if(e.getSource()==six) {
		           six.setText("6");
		            } 
		    else if(e.getSource()==seven) {
		    	seven.setText("7");
		          }
		    else if(e.getSource()==eight) {
		           eight.setText("8");
		           }
		    else if(e.getSource()==nine) {
		           nine.setText("9");
		            }
		    else if(e.getSource()==ten) {
		           ten.setText("10");
		            }
	 }

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
