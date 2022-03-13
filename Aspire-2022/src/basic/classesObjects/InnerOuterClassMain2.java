package basic.classesObjects;
class OuterClass2 {            // Access Outer Class From Inner Class
	int x=28;
	  class InnerClass2      
	 {                         
		public int innerMet() {
			return x;
		}
	}
}
public class InnerOuterClassMain2 {
	public static void main(String[] args) {
		OuterClass2 out=new OuterClass2();
        OuterClass2.InnerClass2 in=out.new InnerClass2();
        System.out.println(in.innerMet());
	}
}
