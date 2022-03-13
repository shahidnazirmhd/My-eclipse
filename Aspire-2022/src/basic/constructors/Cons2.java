package basic.constructors;

public class Cons2 {
	int x;
	public Cons2(int y) {
         x=y;
         

	}
	public static void main(String[] args) {
		Cons2 obj = new Cons2(20);
		System.out.println(obj.x);
	}

}
