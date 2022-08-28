package jdk8AndAbove;

public class Demo5 {

	public static void main(String[] args) {
		//Ancient Way
		MyIface my=new MyfuncImp();
		my.met();
		//Old Way
		my=new MyIface() {
			
			@Override
			public void met() {
				System.out.println("Annonymous way of implementation");
			}
		//}.met();
		};
		my.met();
		//New Way 
		//Lambda
		my=()->{System.out.println("Lambda way of implementation");};
		my.met();
		MyIface2 my2=(st,in)->{System.out.println("Lambda way of implementation method with return and parameter. ");return "Returning:"+st+" "+in;};
		System.out.println(my2.met("Shahid", 28));
		//New Way using Method referencing
		//my=Demo5::metrefway;   // - for static met
		my=new Demo5()::metrefway;
		my.met();
		my2=new Demo5()::metrefway2;
		System.out.println(my2.met("Nazir", 2000));
	}
	public void metrefway() {
		System.out.println("Method ref way of implementation");
	}
	public String metrefway2(String str,int num) {
		System.out.println("Method ref way of implementation with return and param");
		return "Returning:"+str+" "+num;
	}

}
//Functional interface - interface have only one method
interface MyIface{
	public void met();
	public default void metd() {}
	private void metp() {}
	public static void mets() {}	
}
interface MyIface2{
	public String met(String s,int i); //method with return and parameter.
}
//Ancient Way
class MyfuncImp implements MyIface{
	@Override
	public void met() {
		System.out.println("Ancient Way of implementation");	
	}
}
