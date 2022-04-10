package level1.refpack;
public class ReflectionDemo2 {
	public static void main(String[] args) throws Exception{
	Hello hello1=new Hello();  // -- static way
	Hello hello2=(Hello)Class.forName("level1.refpack.Hello").newInstance();   // Old--Dynamic Way
	Hello hello3=(Hello)Class.forName("level1.refpack.Hello").getConstructor().newInstance();  // New--Dynamic Way Constructor is must in class
	
	System.out.println(hello3);
          }
	}	
class Hello{
	public Hello() {
		// TODO Auto-generated constructor stub
	}
}