package level1.iopack;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class CopyFromInternet {

	public static void main(String[] args) throws Exception{
		URL url=new URL("http://google.com/index.html");
		URLConnection urlcon=url.openConnection();
		//BufferedReader bis=new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
		BufferedInputStream bis=new BufferedInputStream(urlcon.getInputStream());
		FileOutputStream fos=new FileOutputStream("google.html");
		int c=0;
		byte b[]=new byte[8];
		while((c=bis.read(b))!=-1) {
			String str =new String(b,0,c);
			System.out.print(str);
			fos.write(b, 0, c);
		}
	}

}
