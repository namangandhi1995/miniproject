import java.awt.List;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;

public class test2 {
	public static ArrayList<String> getWords(String text) {
	    ArrayList<String> words = new ArrayList<String>();
	    BreakIterator breakIterator = BreakIterator.getWordInstance();
	    breakIterator.setText(text);
	    int lastIndex = breakIterator.first();
	    while (BreakIterator.DONE != lastIndex) {
	        int firstIndex = lastIndex;
	        lastIndex = breakIterator.next();
	        if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(text.charAt(firstIndex))) {
	            words.add(text.substring(firstIndex, lastIndex));
	        }
	    }

	    return words;
	}
	public static void main(String[] args) {
	    System.out.println(getWords("A PT CR M0RT BOUSG SABN NTE TR/GB/(G) = RAND(MIN(XXX, YY + ABC))"));
	
	String str = "This is a simple sentence";
	String[] strgs = str.split(" ");
	for(int i=0;i<strgs.length;i++)
	System.out.println( strgs[i] );
	}
}

