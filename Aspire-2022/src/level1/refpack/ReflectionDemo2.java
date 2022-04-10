package level1.refpack;
public class ReflectionDemo2 {
	public static void main(String[] args) throws Exception{
	Hello hello1=new Hello();  // -- static way
	Hello hello2=(Hello)Class.forName("level1.refpack.Hello").newInstance();   // --Dynamic Way
          }
	}	
class Hello{
	
}