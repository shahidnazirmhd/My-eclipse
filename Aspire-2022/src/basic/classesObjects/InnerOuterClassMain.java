package basic.classesObjects;
class OuterClass {
	int x;
	 class InnerClass   // if  If you don't want outside objects to access the inner class,
	 {                 // declare the class as private:
		int y;
	}
}
public class InnerOuterClassMain {
	public static void main(String[] args) {
        OuterClass out=new OuterClass();
        OuterClass.InnerClass in=out.new InnerClass();
        out.x=20;
        in.y=8;
        System.out.println(out.x+in.y);
	}
}
