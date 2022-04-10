package level1.refpack;

import java.lang.reflect.Method;

public class ReflectionDemo2 {
	public static void main(String[] args) throws Exception{
	Hello hello1=new Hello();  // -- static way
	Hello hello2=(Hello)Class.forName("level1.refpack.Hello").newInstance();   // Old--Dynamic Way
	Hello hello3=(Hello)Class.forName("level1.refpack.Hello").getConstructor().newInstance();  // New--Dynamic Way Constructor is must in class
	hello3=(Hello)Class.forName("level1.refpack.Hello").getConstructor(String.class,int.class).newInstance("Shahid",22);
	Method method=hello1.getClass().getMethod("met");
	method.invoke(hello1);
	Method method2=hello3.getClass().getMethod("met",String.class);
	method2.invoke(hello1,"hi...");
	System.out.println(hello3);
          }
	}	
class Hello{
	public Hello() {
		System.out.println("Cons.......");
	}
       public Hello(String name,int age) {
    	   System.out.println("Cons ovrlod...."+name+" "+age);
       }
       public void met(){
    	   System.out.println("met called");
       }
       public void met(String s) {
    	   System.out.println("over met called  "+s);
       }
}