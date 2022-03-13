package basic.classesObjects;

public class EncapsMain {

	public static void main(String[] args) {
		Encaps1 obj = new Encaps1();
		// obj.name(); - error bcz variable is private
		obj.setName("shahid");
		System.out.println(obj.getName());
		

	}

}
