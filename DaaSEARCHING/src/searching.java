import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.html.Option;


public class searching extends JFrame implements ActionListener {
	
	   JTextField tf1;
	    JButton btn1;
		public static String s1;
	    
	    searching()
	    {

	    	Canvas c = new Canvas();
	    	
	        setSize(2000, 2000);

	       setLayout(null);

	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    tf1 = new JTextField();
	    btn1= new JButton("Search");
	    btn1.addActionListener(this);
	    tf1.setBounds(500, 250, 400, 30);
	    btn1.setBounds(600, 300, 150, 30);
	    add(tf1);
	    add(btn1);
	    setVisible(true);
	   }

		/**
	 * @param args
	 */
	    public  void actionPerformed(ActionEvent e)
	     {

	        if (e.getSource() == btn1)
	         {
	        	 String s1= tf1.getText();
	        	 System.out.println(s1);
	           	setVisible(false);
	           	retrieved obj = null;
				try {
					obj = new retrieved(s1);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	           	obj.setVisible(true);
	        	// JOptionPane.showMessageDialog(btn1, "Searching");
      
	         }
	      }
	   
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		new searching();
		
	}



}
