package level1;                      
//Static Demo
public class Revision4 {
	public static void main(String[] args) {
		ClassRoom c1=new ClassRoom();
		ClassRoom c2=new ClassRoom();
		System.out.println(c1.blackboard);
		System.out.println(c2.blackboard);
		System.out.println(c1.toilet);
		System.out.println(c2.toilet);    //  static variable are called by class name
		System.out.println(ClassRoom.toilet);
		System.out.println(ClassRoom.toilet);
		met();
	}
	static void met() {
		//this - cannot use this - because this refers to current object
		//and for static it is jvm so it cannot point to jvm
		//super keyword cannot be used inside a static method
		//static methods cannot access non static variables or methods
	}
}
class ClassRoom{
	Board blackboard=new Board();   //Instance variable
	static RestRoom toilet=new RestRoom();  //Class variable
	//class variable means - n number of instances will use the same object of toilet
}
class Board{
	
}
class RestRoom{
      
}