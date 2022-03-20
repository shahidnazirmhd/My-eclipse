package level1;

public class Revision2 {                      //complex types always pass by reference
	public static void main(String[] args) {
		Revision2 obj=new Revision2();
		Ladduu mylad=new Ladduu();
		System.out.println("before passing value  "+mylad.sz);
		obj.setSize(mylad.sz);
		System.out.println("After passing value  "+mylad.sz);
		System.out.println("before passing reference  "+mylad.sz);
		obj.setSize(mylad);
		System.out.println("After passing reference  "+mylad.sz);
	}
	void setSize(int sz) {
		sz=5;
	}
	void setSize(Ladduu laadu) {
		laadu.sz=5;
	}
}
class Ladduu{
	int sz=10;
}