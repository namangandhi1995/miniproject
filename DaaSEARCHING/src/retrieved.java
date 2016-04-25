import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class retrieved extends JFrame implements ActionListener {
	 JLabel l1;
	 JTextField tf1;
	    JButton btn1;
	    public static String s2;
  retrieved( final String s1) throws IOException
  {
	  
	  setVisible(true);
        setSize(2000, 2000);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        // add something to you panel...
        // panel.add(...);

        // add the panel to a JScrollPane
        JScrollPane jScrollPane = new JScrollPane(panel);
        // only a configuration to the jScrollPane...
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Then, add the jScrollPane to your frame
        frame.getContentPane().add(jScrollPane);
       setLayout(null);
       tf1 = new JTextField();
	    btn1= new JButton("Search");
	    btn1.addActionListener(this);
	    tf1.setBounds(200, 30, 250, 30);
	    btn1.setBounds(500, 30, 100, 30);
	   add(tf1);
	   add(btn1);
       l1 = new JLabel("Retrieved Documents");

       l1.setForeground(Color.blue);

       l1.setFont(new Font("Serif", Font.BOLD, 20));

       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       l1.setBounds(100, 70, 400, 30);  
       add(l1);
     
       int n,y;
	
       n=100;
       y=100;
       File dir= new File(s1);
    	for( File f: dir.listFiles()){
    		
			if(f.getName().contains(".pdf")) {
				final String x;
				  x=f.getName();
				 final PDFManager pdfManager = new PDFManager();
                 pdfManager.setFilePath(s1+"/"+x);
                 if((pdfManager.ToText())!="")
                 {
				 l1 = new JLabel(f.getName());
				
				
				  System.out.println(s1+"/"+x);
			       l1.setForeground(Color.red);

			       l1.setFont(new Font("Serif", Font.BOLD, 20));
                   
			       
			       l1.setBounds(200, n, 400, y);  
			       add(l1);
			       n=n+50;
			       y=y+50;
			     
				l1.addMouseListener(new MouseAdapter() {
			            public void mousePressed(MouseEvent me){
			           	 
			           /* if (Desktop.isDesktopSupported()) {
			                try {
			                    File myFile = new File( s1+"/"+x);
			                 System.out.println(s1+"/"+x);
			            
			                    Desktop.getDesktop().open(myFile);
			                } catch (Exception e) {
			                    // no application registered for PDFs
			                }
			            }*/
			            	
			              
								try {
									System.out.println(pdfManager.ToText());
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							
			            }
			            });
			            }
			}
			else if(f.getName().contains(".txt")|| f.getName().contains(".doc")||f.getName().contains(".docx"))
			{
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
		
			
  public  void actionPerformed(ActionEvent e)
  {

     if (e.getSource() == btn1)
      {
     	 String s2= tf1.getText();
     	 System.out.println(s2);
        	setVisible(false);
        	
        	searched obj = null;
			try {
				obj = new searched(s2);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
           	obj.setVisible(true);
     	// JOptionPane.showMessageDialog(btn1, "Searching");

      }
  }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
		new searched(s2);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	

}
