import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;

public class pdf {

    /** The original PDF that will be parsed. */
    public static final String PREFACE = "C:/Users/NAMAN/Desktop/miniproject/files/2009-10.pdf";
    /** The resulting text file. */
  //  public static final String RESULT = "results/part4/chapter15/preface.txt";

    /**
     * Parses a PDF to a plain text file.
     * @param pdf the original PDF
     * @param txt the resulting text
     * @throws IOException
     */
      
    public void parsePdf(String pdf) throws IOException {
        PdfReader reader = new PdfReader(pdf);
        PdfReaderContentParser parser = new PdfReaderContentParser(reader);
      //  PrintWriter out = new PrintWriter(new FileOutputStream(txt));
        TextExtractionStrategy strategy;
        for (int i = 1; i <= reader.getNumberOfPages(); i++) {
            strategy = parser.processContent(i, new SimpleTextExtractionStrategy());
          System.out.println(strategy.getResultantText());
        }
     //   out.flush();
     //   out.close();
    }

    /**
     * Main method.
     * @param    args    no arguments needed
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
    	System.out.println("Heloo");
        new pdf().parsePdf(PREFACE);
    }
}