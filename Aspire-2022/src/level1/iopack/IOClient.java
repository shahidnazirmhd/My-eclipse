package level1.iopack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class IOClient {
	Socket client;
	public IOClient() throws Exception{
		while(true) {
		client=new Socket("localhost",2000);
		
		BufferedReader read=new BufferedReader(new InputStreamReader(client.getInputStream()));
		String msgfrmsrvr=read.readLine();
		System.out.println("SERVER: "+msgfrmsrvr);
		
		PrintWriter out=new PrintWriter(client.getOutputStream(),true);
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("YOU: ");
		String msgtoserver=in.readLine();
		out.println(msgtoserver);
	}    }
	public static void main(String[] args) throws Exception{
		new IOClient();
	}

}
