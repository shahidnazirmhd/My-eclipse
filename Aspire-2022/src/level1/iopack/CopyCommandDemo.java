package level1.iopack;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyCommandDemo {

	public static void main(String[] args)throws Exception {
		FileInputStream fis=new FileInputStream("newfiles.txt");
		FileOutputStream fos=new FileOutputStream("copy.txt");
		/* //System.out.print(fis.read());
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
		System.out.print((char)fis.read());
		System.out.print(fis.read());
		System.out.print((char)fis.read()); */
		
	/*	int e=-1;
	    int n=0;  
		while ((n=fis.read())!=e) {
			System.out.print((char)n);
		}                                    */
		
	/*	
		int e=-1;
	    int n=0;
	    byte b[]=new byte[4];
	    while ((n=fis.read(b))!=e) {
	    	String s=new String(b,0,n);
			System.out.println(s);
		}                                 */
		
	/*	int e=-1;
	    int n=0;
	    byte b[]=new byte[fis.available()];
	    while ((n=fis.read(b))!=e) {
	    	String s=new String(b);
			System.out.println(s);
	    }                                           */
		
	/*	System.out.println(fis.available());
		byte b[]=new byte[fis.available()];
		fis.read(b);
		String s=new String(b);
		//fos.write(b);
		System.out.println(s);                     */
		
		int e=-1;
	    int n=0;
	    byte b[]=new byte[4];
	    while ((n=fis.read(b))!=e) {
	    	String s=new String(b,0,n);
			System.out.println(s);
			fos.write(b,0,n);
		} 
		
	}

}
