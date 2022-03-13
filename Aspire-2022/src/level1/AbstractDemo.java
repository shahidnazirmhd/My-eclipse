package level1;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hall koodam;
		Hall.mett();
		koodam=new PartyHall();
		//koodam.lights();
		koodam.mett();
		koodam.met();
		koodam=new MeetingHall();
		if (koodam instanceof PartyHall) {
			System.out.println("Hall is now PartyHall");
		} else {
			System.out.println("Hall is now MeetingHall");
		}
		accept(koodam);
		accept(new PartyHall());
		if (koodam instanceof PartyHall) {
			System.out.println("Hall is now PartyHall");
		} else {
			System.out.println("Hall is now MeetingHall");
		}
	
	}
	public static void accept(Hall koodam) {
		System.out.println("meeting....."+koodam);
	}
	public static void accept(PartyHall koodam) {
		System.out.println("Party....."+koodam);
	}
}
abstract class Hall{
	static {
		System.out.println("abs static ... ");
	}
	public void met() {
	System.out.println("abs met ... ");	
	}
	public static void mett() {
		System.out.println("abs static met.... ");
	}
	public Hall() {
		System.out.println("abs cons.... ");
	}
}
class PartyHall extends Hall{
	public void lights(){
		System.out.println("blow...");
	}
	public PartyHall() {
	System.out.println("PHall cons.... ");
	}
}
class MeetingHall extends Hall{
	public MeetingHall() {
	System.out.println("MHall cons... ");
	}
}