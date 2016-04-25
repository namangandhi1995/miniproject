

import java.io.IOException;

public class JavaPDFTest {
 
    public static void main(String[] args) throws IOException {
 
       PDFManager pdfManager = new PDFManager();
       pdfManager.setFilePath("H:/eclipse/files/2008-09.pdf");
       if(pdfManager.ToText()!=null)
       System.out.println(pdfManager.ToText());   
       else
    	   System.out.println("null");   
    
}    
}