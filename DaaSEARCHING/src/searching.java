import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.html.Option;


public class searching extends JFrame implements ActionListener {
	
	   JTextField tf1;
	    JButton btn1;
	    
	    searching()
	    {

	        setVisible(true);

	        setSize(1000, 1000);

	       setLayout(null);

	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    tf1 = new JTextField();
	    btn1= new JButton("Search");
	    btn1.addActionListener(this);
	    tf1.setBounds(500, 250, 400, 30);
	    btn1.setBounds(600, 300, 150, 30);
	    add(tf1);
	    add(btn1);
	   }

		/**
	 * @param args
	 */
	    public void actionPerformed(ActionEvent e)
	     {

	        if (e.getSource() == btn1)
	         {
	        	
	           	setVisible(false);
	           	retrieved obj=new retrieved();
	           	obj.setVisible(true);
	        	// JOptionPane.showMessageDialog(btn1, "Seaching");

	         }
	      }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		new searching();


	}



}
