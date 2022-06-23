package demo;
// Multiple Inheritance in Java types        -Java doesn’t support hybrid/Multiple Inheritance
public class Inheritance4 {

	public static void main(String[] args) {
		MyABC abc=new MyABC();
		abc.metA();
		abc.metB();
		abc.metC();
	}
}
interface InterA{
	public void metA();
}
interface InterB{
	public void metB();
}
interface InterC extends InterA,InterB{
	public void metC();
}
class MyABC implements InterC{
	@Override
	public void metA() {
		System.out.println("A from InterA");
		
	}
	@Override
	public void metB() {
		System.out.println("B from InterB");
		
	}
	@Override
	public void metC() {
		System.out.println("C from InterC");
		
	}
}