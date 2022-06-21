
package level1.iopack;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyCommandDemo3 {

	public static void main(String[] args)throws Exception {
		try (
		FileReader fr=new FileReader("newfiles.txt");
		FileWriter fw=new FileWriter("copy3.txt");)
{
		int e=-1;
	    int n=0;
	    char ch[]=new char[4];
	    while ((n=fr.read(ch))!=e) {
	    	String s=new String(ch,0,n);
			System.out.println(s);
			fw.write(ch,0,n);
		} 
}catch (Exception e) {e.printStackTrace();}

	   
	   // fw.close(); // this is compulsory, to avoid this we must try with resources.
		
	}

}
