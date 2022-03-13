package basic.constructors;

public class Cons1 {
	int x;
	public Cons1() {
	System.out.println("cons called");
		//x=5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons1 obj = new Cons1();
      System.out.println(obj.x);  // object calls a constructor
	}

}
