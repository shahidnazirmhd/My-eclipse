package level2;


import java.net.URL;
import java.net.URLConnection;
public class ConnecServer {
	
	public static void main(String[] args) throws Exception{
		URL url=new URL("http://localhost:8080/myweb3/MyFirstServlet");
		
		URLConnection urlcon=url.openConnection();
		
		urlcon.getInputStream();
	}
}