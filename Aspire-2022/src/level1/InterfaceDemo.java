package level1;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EnglishMedicalCollege engdoc=new EnglishMedicalCollege();
UnaniCollege undoc=new UnaniCollege();
engdoc.cure();
engdoc.care();
undoc.cure();
	}

}
class Human{
	
}
interface Doctor{
	public void cure();
}
interface Nurse{
	public void care();
}
class EnglishMedicalCollege implements Doctor,Nurse {
	@Override
	public void cure() {
		System.out.println("Doctor cures with english medicine");
	}
	@Override
	public void care() {
		System.out.println("Nurse cares.....");
	}
}
class UnaniCollege implements Doctor{
	@Override
	public void cure() {
		System.out.println("Doctor cures with unani medicine");
	}
}
