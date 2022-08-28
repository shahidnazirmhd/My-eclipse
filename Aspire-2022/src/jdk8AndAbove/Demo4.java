package jdk8AndAbove;

public class Demo4 {

	public static void main(String[] args) {
		MyInter2.met();
		MyInter2 my2=new MyInter2Imp();
		my2.met3();
		my2.met4();
	

	}

}
//New Way interface
interface MyInter2{
	private  void met2() {
		System.out.println("Its a private void method");
	}
	public static void met() {
		System.out.println("static method of interface called...");
		
	}
	
	public default void met3() {   //template method
		System.out.println("public default method called");
		met2();
	}
	public  void met4();
		
}

class MyInter2Imp implements MyInter2{
	@Override
	public void met4() {
	System.out.println("abst met4 called");
		
	}
}



