package basic.constructors;

public class Cons3 {
	int age;
	String name;
	public Cons3(int ag,String nam) {
	        age= ag;
	        name = nam;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Cons3 obj =  new Cons3(21,"shahid");
   System.out.println(obj.age+" "+obj.name);
	}

}
