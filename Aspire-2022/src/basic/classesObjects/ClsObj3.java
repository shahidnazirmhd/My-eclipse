package basic.classesObjects;

public class ClsObj3 {      //operation in class attributes
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClsObj2 myobj1= new ClsObj2();
		ClsObj2 myobj2= new ClsObj2();
		System.out.println(myobj1.a+myobj1.b+myobj1.c);
        myobj1.c=5; //assign a value
        System.out.println(myobj1.c);
        System.out.println(myobj1.a+myobj1.b+myobj1.c);
        myobj1.a=10; myobj1.b=15; myobj1.c=20;  //modify a value
        System.out.println(myobj1.a+myobj1.b+myobj1.c);
        System.out.println(myobj1.d);
        System.out.println(myobj2.a+myobj2.b+myobj2.c); // object 2 unchanged
        // myobj1.d=10; - cannot modify a value , it is final
        System.out.println(myobj1.word+" "+myobj2.word2);
}
}
