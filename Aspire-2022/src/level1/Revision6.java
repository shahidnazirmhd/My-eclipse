package level1;
                       //METHOD OVERLOADING - Achieve POLYMORPHISM
public class Revision6 {
	void met() {
		System.out.println("no param met called....");
	}
	void met(int i) {
		System.out.println("param met called.... "+i);
	}
	public static void main(String[] args) {
		Revision6 obj =new Revision6();
		obj.met(100);
		obj.met();
		obj.help(new Ambulance());
		obj.helpA(new FireTruck());
	}
	//DYNAMIC POLYMORPHISM - CLOSED FOR MODIFICATION - IN FAVOUR OF OPEN CLOSE PRINCIPLE
		//GOOD PROGRAMMING
	void helpA(Fire fire) {
		fire.fireMet();
	}
	void helpA(FireTruck fengine) {
		fengine.fireRescue();
	}
	void helpA(Ambulance ambu) {
		ambu.lifeSave();
}
	//STATIC POLYMORPHISM - OPEN FOR MODIFICATION - AGAINST OPEN-CLOSE PRINCIPLE
		//BAD PROGRAMMING
	void help(Object obj) {
		if(obj instanceof Fire) {
			Fire fire= (Fire)obj;
			fire.fireMet();
		}
		if(obj instanceof FireTruck) {
			FireTruck fengine= (FireTruck)obj;
			fengine.fireRescue();
	}
		if(obj instanceof Ambulance) {
			Ambulance ambu= (Ambulance)obj;
			ambu.lifeSave();
		}

}
}

class Fire{
	void fireMet() {
		System.out.println("Fire spreads everywhere");
	}
}
class FireTruck{
	void fireRescue() {
		System.out.println("Rescue processing...");
	}
}
class Ambulance{
	void lifeSave()
	{
		System.err.println("Life saving...");
	}
}