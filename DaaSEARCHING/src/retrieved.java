import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class retrieved extends JFrame implements ActionListener {
	 JLabel l1;
	// JTextField tf1;
	  //  JButton btn1;
	    public static String s2;
  retrieved( final String s1)
  {
	  setVisible(true);
        setSize(2000, 2000);

       setLayout(null);
     /*  tf1 = new JTextField();
	    btn1= new JButton("Search");
	    btn1.addActionListener(this);
	    tf1.setBounds(200, 30, 250, 30);
	    btn1.setBounds(500, 30, 100, 30);
	    add(tf1);
	    add(btn1);*/
       l1 = new JLabel("Retrieved Documents");

       l1.setForeground(Color.blue);

       l1.setFont(new Font("Serif", Font.BOLD, 20));

       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       l1.setBounds(100, 70, 400, 30);  
       add(l1);
     
       int n,y,c=0;
       n=100;
       y=100;
       File dir= new File(s1);
    	for( File f: dir.listFiles()){
			if(f.getName().contains(".pdf")|| f.getName().contains(".txt")|| f.getName().contains(".doc")||f.getName().contains(".docx")){
				
				 l1 = new JLabel(f.getName());
				final String x;
				  x=f.getName();
				  System.out.println(s1+"/"+x);
			       l1.setForeground(Color.red);

			       l1.setFont(new Font("Serif", Font.BOLD, 20));
       
			       
			       l1.setBounds(200, n, 400, y);  
			       add(l1);
			       n=n+50;
			       y=y+50;
			     
				l1.addMouseListener(new MouseAdapter() {
			            public void mousePressed(MouseEvent me){
			           	
			            if (Desktop.isDesktopSupported()) {
			                try {
			                    File myFile = new File( s1+"/"+x);
			                 System.out.println(s1+"/"+x);
			                    Desktop.getDesktop().open(myFile);
			                } catch (Exception e) {
			                    // no application registered for PDFs
			                }
			            }
			            }
			            });
			            }
			}
		}
/*			
  public  void actionPerformed(ActionEvent e)
  {

     if (e.getSource() == btn1)
      {
     	 String s2= tf1.getText();
     	 System.out.println(s2);
        	setVisible(false);
        	retrieved obj=new retrieved(s2);
        	obj.setVisible(true);
     	// JOptionPane.showMessageDialog(btn1, "Searching");

      }
  }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new retrieved(s2);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
