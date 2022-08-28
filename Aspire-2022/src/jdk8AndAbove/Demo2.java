package jdk8AndAbove;      //--Closabble

import java.io.FileReader;
import java.io.FileWriter;

public class Demo2 {

	public static void main(String[] args) {
		oldWay();
		newWay();
	}
	
	public static void oldWay() {
		FileWriter fwout=null;
		try {
		FileReader frin=new FileReader("original.txt");
		fwout=new FileWriter("originalCopy1.txt");
		int i=0;
		while ((i=frin.read())!=-1) {
			fwout.write(i);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				//
				fwout.close();
			}catch(Exception e) {}
		}
	}
	 public static void newWay() {
		  // this is called as TRY WITH RESOURCE
			try(FileReader frin=new FileReader("original.txt");
					FileWriter fwout=new FileWriter("originalCopy2.txt");) 
			{
			
			int i=0;
			while ((i=frin.read())!=-1) {
				fwout.write(i);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
	 }

}
