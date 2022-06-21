package level1.utilpack;

import java.io.FileInputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropDemo2 {

	public static void main(String[] args)throws Exception {
		Properties prop=new Properties();
		prop.load(new FileInputStream("myfile.properties"));
		System.out.println(prop);
		Locale lo=Locale.getDefault();
		System.out.println(lo);
		Locale.setDefault(new Locale("ta"));
		ResourceBundle rb=ResourceBundle.getBundle("language",Locale.getDefault());
		System.out.println(rb.getString("Welcome"));

	}

}
