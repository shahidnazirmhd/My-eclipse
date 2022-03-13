package basic.classesObjects;
interface Motor {
	public void motorSwitch();
	public void waterLevel();
}
class WaterTank implements Motor {
	public void motorSwitch()
	{
		System.out.println("switch on");
	}
	public void waterLevel() {
		System.out.println("water is filling half");
	}
}
public class InterfMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WaterTank water =new WaterTank();
         water.motorSwitch();
         System.out.println( "A few minute later....  ");
         water.waterLevel();
	}

}
