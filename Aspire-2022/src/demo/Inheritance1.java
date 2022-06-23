package demo;
// Single Inheritance
public class Inheritance1 {

	public static void main(String[] args) {
		Sub sub=new Sub();
		sub.metA();
		sub.metB();
	}

}
class Super{
	public void metA(){
		System.out.println("A from Super");
	}
}
class Sub extends Super{
	public void metB() {
		System.out.println("B from Sub");
	}
}