package basic.classesObjects;

public class ClsObj4 {   //static VS. non static
	static void method()
	{
		System.out.println("static method");
	}
	public void method2()
	{
		System.out.println("public method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       method();
       // method2(); - it throws an error
       ClsObj4 obj= new ClsObj4();
        obj.method2(); // call by object
	}

}
