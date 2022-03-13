package basic.classesObjects;
import java.util.HashMap;
public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, String> caps=new HashMap<String, String>();
            caps.put("India", "Delhi");
            caps.put("KSA", "Riyadh");
            caps.put("England", "London");
            caps.put("USA", "Washington DC");
            caps.put("Japan", "Tokyo");
            caps.put("Germany", "Berlin");
            System.out.println(caps);
            System.out.println(caps.get("KSA"));
            for(String i : caps.values()) {
            	System.out.println(i);
            }
            for(String i : caps.keySet()) {
            	System.out.println(i+" "+caps.get(i));
            }
	}

}
