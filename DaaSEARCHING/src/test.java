import java.io.BufferedReader;

import java.io.FileInputStream;


import java.io.InputStreamReader;




public class test {

	public static void main(String[] args) {

        String path = "H:/eclipse/files/"; //ADD YOUR PATH HERE
        String fileName = "g.txt";
        String testWord = "heelo abc"; //CHANGE THIS IF YOU WANT
        int tLen = testWord.length();
        int wordCntr = 0;
        String file = path + fileName;
        boolean check;

        try{
            FileInputStream fstream = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;        
            //Read File Line By Line
            while((strLine = br.readLine()) != null){                
                //check to see whether testWord occurs at least once in the line of text
                check = strLine.toLowerCase().contains(testWord.toLowerCase());
                if(check){                    
                    //get the line, and parse its words into a String array
                    String[] lineWords = strLine.split("\\s+");                    
                    for(String w : lineWords){
                        //first see if the word is as least as long as the testWord
                        if(w.length() >= tLen){
                            /*
                            1) grab the specific word, minus whitespace
                            2) check to see whether the first part of it having same length
                                as testWord is equivalent to testWord, ignoring case
                            */
                            String word = w.substring(0,tLen).trim();                                                        
                            if(word.equalsIgnoreCase(testWord)){                                
                                wordCntr++;
                            }                            
                        }
                    }                    
                }   
            }    
            
            System.out.println("total is: " + wordCntr);
        //Close the input stream
        br.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}