package demo;

public class AbsClass1 extends Abstract{

	public static void main(String[] args) {
		AbsClass1 abs =new AbsClass1();
		abs.met();

	}

}
abstract class Abstract{
	public void met() {
		System.out.println("My abstract class met....");
	}
}