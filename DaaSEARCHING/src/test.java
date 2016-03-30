    import java.util.Scanner;
    import java.io.*;
    public class test
    {
    	public static void main(String[] args)
    	{
    		
    		Scanner user_input = new Scanner(System.in);
    		String user_i;
    		
    		System.out.print("Directory: ");
    		user_i= user_input.next();
    		
    		File dir= new File(user_i);
    		for(File f: dir.listFiles()){
    			if(f.getName().contains(".pdf")){
    				System.out.println(f.getName());
    			}
    			
    		}
    	}//end main
    }//end class