import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class retrieved extends JFrame {
	 JLabel l1;
  retrieved()
  {
       // setVisible(true);
       
      
        
        setSize(1000, 1000);

       setLayout(null);
       l1 = new JLabel("Retrieved Documents");

       l1.setForeground(Color.blue);

       l1.setFont(new Font("Serif", Font.BOLD, 20));

       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       l1.setBounds(100, 30, 400, 30);  
       add(l1);
       }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
