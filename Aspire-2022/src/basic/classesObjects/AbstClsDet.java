package basic.classesObjects;
abstract class Mobile {
	public abstract void ringtone();
	public void callerName() {
		    System.out.println("Amma calling");
	}
}
class CallDetails extends Mobile {
	public void callerNumber() {
		System.out.println("7598461702");
	}
	public void ringtone()
	{
		System.out.println("ring...ring...ring");
	}
}
public class AbstClsDet {

	public static void main(String[] args) {
// Mobile objdet=new Mobile();   -it is not possible to create an object of the Mobile class:
		CallDetails det=new CallDetails();   // bcz Mobile class is abstract class
		det.callerName();
		det.callerNumber();
		det.ringtone();

	}

}
