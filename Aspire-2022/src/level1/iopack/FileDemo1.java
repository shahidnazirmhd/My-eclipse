package level1.iopack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class FileDemo1 {

	public static void main(String[] args)throws Exception {
		//File fl=new File("mynewfile.properties");
		File fl=new File("newfiles.txt");
		System.out.println(fl.getPath()+", "+fl.getAbsolutePath());
		System.out.println(fl.canExecute()+" "+fl.canRead()+" "+fl.canWrite());
		//System.out.println(fl.renameTo(new File("newfiles.txt")));
		fl.renameTo(new File("newfiles.txt"));
		
		
		FileInputStream fis=new FileInputStream(fl);     //  - It read by bytes.
		FileReader fr=new FileReader(fl);				 //  - It read by character.	
		

	}

}
