package level1;

public class InnerClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kalimark kali =new Kalimark();
		kali.sellCola();
		Pepsi pep =new Pepsi();
		pep.sellCola();

	}

}
abstract class Cola{
	abstract void makeCola();
}
class Kalimark{
	int n=10;
	static class CampaCola extends Cola{
		@Override
		void makeCola() {
			System.out.println("static make cola called");
			
		}
	}
	class CampC extends Cola{
		@Override
		void makeCola() {
			System.out.println("non static make cola called"+n);
			
		}
	}
	void sellCola() {
		new CampaCola().makeCola();
		new Cola() {
			@Override
			void makeCola() {
				System.out.println("cola made by anonymous kalimark class");
				
			}
		}.makeCola();
	}
}
class Pepsi{
	void sellCola() {
		Kalimark.CampaCola campac=new Kalimark.CampaCola();
		campac.makeCola();
		Kalimark.CampC campc=new Kalimark().new CampC();
		campc.makeCola();
	}
}