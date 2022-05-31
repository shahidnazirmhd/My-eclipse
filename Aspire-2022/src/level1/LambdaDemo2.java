package level1;

public class LambdaDemo2 {
 // Three types of inner class - static inner class, inner class, Local inner class, anonymous inner class.
	public static void main(String[] args) {
		PepsiCo pepsi=new PepsiCo();
	pepsi.sellCola();
	KaliMarkBovonto kali=new KaliMarkBovonto();
	kali.sellCola();
}
}
abstract class ColaDrink{
	public abstract void makeCola(); // one method abstract or interface is called - Functional inrerface.
	//public abstract void makeFlavour();
}
@FunctionalInterface
interface ColaInter{
	public void makeCola();
	//public void met();
}

class PepsiCo{
	public void sellCola() {
	//	ColaDrink cola= new KaliMarkBovonto().new CoCaColaIN(); // This is how we access inner class.
		//ColaDrink cola = new KaliMarkBovonto.CoCaColaIN();  // This is how we access static inner class.
	//	cola.makeCola();
		System.out.println("pepsi co., sells cola made by CoCaCola...as pepsi");
		}
}

class KaliMarkBovonto{
	public void canteen() {
		System.out.println("employees eat here");
	}
	public void sellCola() {
		// Local inner class - Outsiders cannot access. A kind of merger. |pepsi down|
		class CoCaColaIN extends ColaDrink{
			@Override
			public void makeCola() {
				canteen();// inner class access all of parent class.
				System.out.println("cola made by CoCaCola IN");
			}
//			@Override
//			public void makeFlavour() {
//				// TODO Auto-generated method stub
//				
//			}
		}
		ColaDrink cola= new CoCaColaIN();
		cola.makeCola();
		System.out.println("Kali sells cola made by CoCaCola...as Bovonto");
		// Anonymous inner class. - use for single method abstract/interface.
		new ColaDrink() {
			
			@Override
			public void makeCola() {
				System.out.println("ANONYMOUS-Cola made as per Coca cola IN Logic...");
				
			}
		}.makeCola();
		//LAMBDA - introduced in jdk8(2014)
		//Lambdas work only for Interfaces with one method.
		ColaInter colaInterImpl=()->{System.out.println("LAMBDA-cola made as per Coca cola IN logic...");};
		colaInterImpl.makeCola();
		}
//	public class CoCaColaIN extends ColaDrink{
//		@Override
//		public void makeCola() {
//			canteen();// inner class access all of parent class.
//			System.out.println("cola made by CoCaCola IN");
//		}
//	}
}



