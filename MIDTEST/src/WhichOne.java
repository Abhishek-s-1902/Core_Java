
import javax.swing.*;          	//This is the final package name.
import java.awt.*;
import java.awt.event.*;

public class WhichOne {

    public Component createComponents() {
	JButton b1;
	JButton b2;
	GridBagLayout gridbag = new GridBagLayout();
	GridBagConstraints c = new GridBagConstraints();
        JPanel contentPane = new JPanel();

	c.gridwidth = 2;
	c.gridy = 0;
	c.gridx = 0;
	contentPane.setLayout(gridbag);
	b1 = new JButton("aaaaaaaaa");
        b1.addMouseListener( new MyMouseListener2() );
	gridbag.setConstraints(b1, c);
	contentPane.add(b1);

	c.gridwidth = 2;
	c.gridy = 0;
	c.gridx = 1;
	contentPane.setLayout(gridbag);
	b2 = new JButton("bbbbbbbbbbbbbbbbbbbbbbbbbbb");
        b2.addMouseListener( new MyMouseListener2() );

	gridbag.setConstraints(b2, c);
	contentPane.add(b2);
	return contentPane;

    }

    public static void main(String[] args) {

	String lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
	
        try {
		UIManager.setLookAndFeel( lookAndFeel);
        } catch (Exception e) { }

        JFrame frame = new JFrame("WhichOne");
        WhichOne app = new WhichOne();
        Component contents = app.createComponents();


        frame.getContentPane().add(contents);
        frame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
		    System.exit(0);
	        }
           });
        frame.pack();
        frame.setVisible(true);
    }
}