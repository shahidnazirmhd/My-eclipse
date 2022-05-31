package level1;

public class LambdaDemo3 {
 public static void main(String[] args) {
	MyInter myinter=()->{System.out.println("say hello met called");};
	myinter.sayHello();
	//MyInter2 myinter2=(String n,int a)->{System.out.println("say batch called "+n+" : "+a);};
	MyInter2 myinter2=(n,a)->{System.out.println("say batch called "+n+" : "+a);};
	myinter2.sayBatch("Aspire",38);
	MyInter3 myinter3=(s)->{return "Welcome all "+s;};
	System.out.println(myinter3.sayGreet("Aspires"));
	greet(myinter3);
}
 public static void greet(MyInter3 m3){
	 System.out.println(m3.sayGreet("eves"));
}
}
interface MyInter{
	public void sayHello();
}
interface MyInter2{
	public void sayBatch(String name,int roll);
}
interface MyInter3{
	public String sayGreet(String Gname);
}

