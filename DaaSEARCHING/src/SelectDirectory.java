import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SelectDirectory extends JPanel implements ActionListener {
    JButton go;

    JFileChooser chooser;
    String choosertitle;

    public SelectDirectory() {
        go = new JButton("Select directory: ");
        go.addActionListener(this);
        add(go);
    }

    public void actionPerformed(ActionEvent e) {
    	String str;
        chooser = new JFileChooser(); 
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle(choosertitle);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(true);

        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
           /* System.out.println("getCurrentDirectory(): " + 
                                chooser.getCurrentDirectory());*/
         /*   System.out.println("getSelectedFile() : " +  chooser.getSelectedFile());*/
        	System.out.print(chooser.getSelectedFile());
            //
            //
            //
            try {
				searchFiles(null, choosertitle, null);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} // error here, I dont know really how to use this method
            //
            //
            //
        } 
        else {
            System.out.println("No Selection ");
        }
    }

  /*  public Dimension getPreferredSize(){
        return new Dimension(200, 200);
    }*/

    public static void main(String s[]) {
        JFrame frame = new JFrame("");
        SelectDirectory panel = new SelectDirectory();
        frame.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        frame.getContentPane().add(panel,"Center");
        frame.setSize(panel.getPreferredSize());
        frame.setVisible(true);
    }

    private ArrayList<String> searchFiles(File file, String pattern, 
                        ArrayList<String> result) throws FileNotFoundException {

    	 if (!file.isDirectory()) {
    	        throw new IllegalArgumentException("file has to be a directory");
    	    }

    	    if (result == null) {
    	        result = new ArrayList<String>();
    	    }

    	    File[] files = file.listFiles();

    	    if (files != null) {
    	        for (File currentFile : files) {
    	            if (currentFile.isDirectory()) {
    	                searchFiles(currentFile, pattern, result);
    	            } else {
    	                Scanner scanner = new Scanner(currentFile);
    	                if (scanner.findWithinHorizon(pattern, 0) != null) {
    	                    result.add(currentFile.getName());
    	                }
    	                scanner.close();
    	            }
    	        }
    	    }
    	    return result;
    	}
}