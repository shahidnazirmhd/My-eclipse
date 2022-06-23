package demo;
// Hierarchical Inheritance
public class Inheritance3 {

	public static void main(String[] args) {
		Sub1 sub1=new Sub1();
		sub1.metA();
		sub1.metB();
		Sub2 sub2=new Sub2();
		sub2.metA();
		sub2.metC();
		Sub3 sub3=new Sub3();
		sub3.metA();
		sub3.metD();
	}

}
class SuperOne{
	public void metA(){
		System.out.println("A from SuperOne");
	}
}
class Sub1 extends SuperOne{
	public void metB() {
		System.out.println("B from Sub1");
	}
}
class Sub2 extends SuperOne{
	public void metC() {
		System.out.println("C from Sub2");
	}
}
class Sub3 extends SuperOne{
	public void metD() {
		System.out.println("D from Sub3");
	}
}