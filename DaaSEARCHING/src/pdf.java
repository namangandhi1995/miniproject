

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import java.io.File;

/**
 *
 * @author Thomas
 */
public class pdf {

    /**
     * @param args the command line arguments
     */
    private static String INPUTFILE = "c:/temp/MyPdf.pdf"; //Specifying the file location.
   public static void main(String[] args) {
        try {
          
        PdfReader reader = new PdfReader(INPUTFILE);
        int n = reader.getNumberOfPages();
     
  String str=PdfTextExtractor.getTextFromPage(reader, 2); //Extracting the content from a particular page.
            System.out.println(str);
        document.close();

        }
        catch (Exception e) {
            System.out.println(e);
        }
      
    }

}