package level1.iopack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class IOServer {
	ServerSocket server;
	public IOServer() throws Exception {
		server =new ServerSocket(2000);
		while(true) {
		System.out.println("server ready...");
		Socket client=server.accept();
		System.out.println(client);
		
		PrintWriter out=new PrintWriter(client.getOutputStream(),true);
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("TYPE: ");
		String msgtoclient=in.readLine();
		out.println(msgtoclient);
		
		BufferedReader read=new BufferedReader(new InputStreamReader(client.getInputStream()));
		String msgfrmclient=read.readLine();
		System.out.println("CLIENT: "+msgfrmclient);
		}	}

	public static void main(String[] args) throws Exception {
		new IOServer();
	}

}
