import java.awt.Color;
import java.awt.Font;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class retrieved extends JFrame {
	 JLabel l1;
  retrieved(String s1)
  {
      
        setSize(1000, 1000);

       setLayout(null);
       l1 = new JLabel("Retrieved Documents");

       l1.setForeground(Color.blue);

       l1.setFont(new Font("Serif", Font.BOLD, 20));

       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       l1.setBounds(100, 30, 400, 30);  
       add(l1);
     
       int n,y;
       n=100;
       y=100;
      
       File dir= new File(s1);
		for(File f: dir.listFiles()){
			if(f.getName().contains(".pdf")){
				
				 l1 = new JLabel(f.getName());

			       l1.setForeground(Color.red);

			       l1.setFont(new Font("Serif", Font.BOLD, 20));
       
			       
			       l1.setBounds(200, n, 400, y);  
			       add(l1);
			       n=n+50;
			       y=y+50;
			}
		}
	
       }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
