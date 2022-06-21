package level1.iopack;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyCommandDemo2 {

	public static void main(String[] args)throws Exception {
		
		FileReader fr=new FileReader("newfiles.txt");
		FileWriter fw=new FileWriter("copy2.txt");
	
		int e=-1;
	    int n=0;
	    char ch[]=new char[4];
	    while ((n=fr.read(ch))!=e) {
	    	String s=new String(ch,0,n);
			System.out.println(s);
			fw.write(ch,0,n);
		} 
	   
	    fw.close(); // this is compulsory, to avoid this we must try with resources.
		
	}

}
