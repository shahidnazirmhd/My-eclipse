package demo;

public class AbsClass2 {

	public static void main(String[] args) {
		HumanDetail det =new HumanDetail();
		det.name();
		det.race();

	}

}
abstract class Human{
	abstract public void race();
	public void name() {
		System.out.println("I am Shahid");
	}
}
class HumanDetail extends Human{
	@Override
	public void race() {
		System.out.println("Asian");
		
	}
}