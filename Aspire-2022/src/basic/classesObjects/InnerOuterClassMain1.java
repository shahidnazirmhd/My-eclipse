package basic.classesObjects;
class OuterClass1 {
	int x;
	 static class InnerClass1 // if Inner Class static you can     
	 {                         // access it without creating an object of the outer class:
		int y;
	}
}
public class InnerOuterClassMain1 {
	public static void main(String[] args) {
       // OuterClass1 out=new OuterClass1();
        OuterClass1.InnerClass1 in=new OuterClass1.InnerClass1();
       // out.x=20;
        in.y=8;
        System.out.println(in.y);
	}
}
