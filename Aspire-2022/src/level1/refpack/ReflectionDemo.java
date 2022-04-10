package level1.refpack;                //  Reflection - Knowing the unknown.

import java.lang.reflect.Field;           
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) {
		PoliceStation p1=new PoliceStation();
		Politician politician=new Politician();
		Butcher butcher=new Butcher();
		p1.arrest(butcher);
		p1.arrest(politician);

	}

}
class PoliceStation{
	public void arrest(Object pol) {
		try {
			Class suspect=pol.getClass();
			Field field=suspect.getField("name");
			System.out.println(field.get(pol));
			Method met=suspect.getMethod("service");
			met.invoke(pol);
			// To know private or non public - Use different methods.
			field=suspect.getDeclaredField("secretName");
			field.setAccessible(true);
			System.out.println(field.get(pol));
			met=suspect.getDeclaredMethod("secretService");
			met.setAccessible(true);
			met.invoke(pol);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Butcher{
	public String name="Best Butcher";
	private String secretName="Worst Butcher";
	public void service() {
		System.out.println("Sell Good mutton...");
		
	}
	private void secretService() {
		System.out.println("Sell bad mutton - yesterday slaughtered muttton");
	}
}
class Politician{
	public String name="Good Name";
	private String secretName="Theif";
	public void service() {
		System.out.println("I am public....");
	}
	private void secretService() {
		System.out.println("I am loot people....");
	}
	
}