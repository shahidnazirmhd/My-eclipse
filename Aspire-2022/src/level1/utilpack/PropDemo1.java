package level1.utilpack;

import java.util.Enumeration;
import java.util.Properties;

public class PropDemo1 {

	public static void main(String[] args) {
		Properties pro=new Properties();
		pro.put("a7","Hey");
		pro.put("a3","Hi");
		pro.put("a9","Hai");
		pro.put("a8","Oye");
		pro.put("a4","Bye");
		pro.put("a6","Bai");
		System.out.println(pro);
		Enumeration enu= pro.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}

	}

}
