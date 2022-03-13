package level1;

public class ConsDemo {
	ConsDemo() {
		System.out.println("Constructor Called");
	}
	String ss="hi";
	//String s="hi";
	ConsDemo(String s){
		System.out.println("cons String "+s);
		s=ss;
		//ss=s;
		System.out.println("cons String "+s);
	}
	ConsDemo(String s,int n){
		System.out.println("cons String "+s+"Cons num "+n);
		ss=s;
	}
	int yr=2000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConsDemo obj=new ConsDemo();
obj.ss="Hello Every one";
System.out.println(obj.ss);
ConsDemo obj2=new ConsDemo("welcome");
System.out.println(obj2.ss);
obj2.ss="Hello";
System.out.println(obj2.ss);
ConsDemo obj3=new ConsDemo("Shahid",28);
System.out.println(obj3.yr+obj3.ss);
	}

}
