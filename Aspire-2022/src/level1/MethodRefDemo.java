package level1;

public class MethodRefDemo {
	public MethodRefDemo() {
		System.out.println("cons called.....");
	}
	public static void myHello() {
		System.out.println("this is my hello");
	}
	void greet() {
		System.out.println("Welcome....Aspire");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         myHello();
         new MethodRefDemo();
         MyInterM mm=MethodRefDemo::myHello; // this for static met
         hello(mm);
         mm=new MethodRefDemo()::greet;   // this for non static met
         hello(mm);
         mm=MethodRefDemo::myHello;   
         hello(mm);
//         mm=MethodRefDemo::greet;
//         hello(mm);
         mm=MethodRefDemo::new;         // this for call cons...
         hello(mm);
	}
	public static void hello(MyInterM m) {
		m.sayHello();
	}

}
//@FunctionalInterface
interface MyInterM{
	public void sayHello();
	//public void say();
}