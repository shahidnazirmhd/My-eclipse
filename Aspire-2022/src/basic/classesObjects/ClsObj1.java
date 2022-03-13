package basic.classesObjects;

public class ClsObj1 {
	int x=5,y=10;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ClsObj1 myobj1= new ClsObj1();
     ClsObj1 myobj2= new ClsObj1();
     ClsObj1 myobj3= new ClsObj1();
     System.out.println(myobj1.x);
     System.out.println(myobj2.x);
     System.out.println(myobj3.x+myobj3.y);
     System.out.println(myobj3.x+myobj2.y);
    /* System.out.println(myobj3.x+y); it throws error*/
     
}

}