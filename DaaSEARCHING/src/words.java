import java.io.*;
import java.util.*;

class words
{
	public static void main(String[] args) throws IOException {
		
BufferedReader br=new BufferedReader(new FileReader("H:/eclipse/files/g.txt"));
 System.out.println("enter the string which you search");
 Scanner ob=new Scanner(System.in);
 String str=ob.next();
 String str1="",str2="";
 int count=0;
while((str1=br.readLine())!=null)
 {
 str2 +=str1;

}  

 int index = str2.indexOf(str);

 while (index != -1) {
 count++;
 str2 = str2.substring(index + 1);
 index = str2.indexOf(str);
}

System.out.println("Number of the occures="+count);
}
}  

