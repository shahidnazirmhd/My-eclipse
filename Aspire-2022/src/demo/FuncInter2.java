package demo;

public class FuncInter2 {

	public static void main(String[] args) {
		//Lambda
		MyFuncInter3 fc3= ()->{System.out.println("Hi.......");};
		fc3.met();
		call(fc3);
		MyFuncInter4 fc4= ()->{System.out.println("Hi.......");return "Hello....";};
		System.out.println(fc4.met2());
		
		MyFuncInter5 fc5= (name,age)->{System.out.println(name);return age;};
		System.out.println(fc5.met3("Shahid", 22));
		MyFuncInter5 fc05= (String name,int age)->{System.out.println(name);return age;};
		System.out.println(fc05.met3("Shahid", 22));
		Employee empe =new Employee();
		MyFuncInter6 fc6=(emp,name,age)->{System.out.println(emp+" "+name+" "+age); return new Employee();};
		System.out.println(fc6.met4(empe, "Shahid", 22));
		MyFuncInter6 fc06=(emp,name,age)->{System.out.println(emp+" "+name+" "+age); return new Employee();};
		System.out.println(fc06.met4(new Employee(), "Shahid", 22));
	}
	public static void call(MyFuncInter3 fi3) {
		fi3.met();
	}

}
interface MyFuncInter3{
	public void met();
}
interface MyFuncInter4{
	public String met2();
}
interface MyFuncInter5{
	public int met3(String s,int a);
}
interface MyFuncInter6{
	public Employee met4(Employee emp,String s,int a);
}
class Employee{
	
}