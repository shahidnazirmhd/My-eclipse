package basic.classesObjects;
interface Power {
	public void motorSwitch();
}
interface Pump {
	public void waterFlow();
}
class MotorPump implements Power,Pump {
	public void motorSwitch() {
		System.out.println("Motor switched on");
	}
	public void waterFlow() {
		System.out.println("Water seamlessly flowing");
	}
}
public class InterfMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   MotorPump water =new MotorPump();
      water.motorSwitch();
      water.waterFlow();
	}

}
