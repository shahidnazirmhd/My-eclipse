package demo;
// Multilevel Inheritance
public class Inheritance2 {

	public static void main(String[] args) {
		LastSub sub=new LastSub();
		sub.metA();
		sub.metB();
		sub.metC();
	}

}
class FirstSuper{
	public void metA(){
		System.out.println("A from FirstSuper");
	}
}
class FirstSub extends FirstSuper{
	public void metB() {
		System.out.println("B from FirstSub");
	}
}
class LastSub extends FirstSub{
	public void metC() {
		System.out.println("C from LastSub");
	}
}