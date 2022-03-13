package level1;

public class InnerClassStatic {

	public static void main(String[] args) {
		Outer.InnerStatic obj= new Outer.InnerStatic();
		obj.sClass();
		Outer.Inner obj2= new Outer().new Inner();
		obj2.nsClass();

	}

}
class Outer{
	String a="TEST";
	 void oClass()
	{
		System.out.println("a class inside a class is Inner class");
	}
	static class InnerStatic{
		void sClass()
		{
			System.out.println("staic class met called");
		//	oClass();
		//	System.out.println("staic class met called"+a);     " error occur  to use in static class"
		}
	}
	class Inner{
		void nsClass()
		{
			oClass();
			System.out.println("Non static class met called "+a);
		}
	}
	
	
}
