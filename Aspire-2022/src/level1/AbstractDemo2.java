package level1;

public class AbstractDemo2 {

	public static void main(String[] args) {
	DominoPizza piz=new IndianDomino();
	piz.makePizza();
	piz.delivery();
	piz.payment();
	//piz.review();
	System.out.println("...............................................................");
	IndianDomino pizz=new IndianDomino();
	pizz.makePizza();
	pizz.delivery();
	pizz.payment();
	pizz.review();
	}

}
abstract class DominoPizza{
	final private void dough() {
		System.out.println("Domino Secret");
	}
	final private void incredients() {
		System.out.println("Domino Secret");
	}
	final private void baking() {
		System.out.println("Domino Secret");
	}	
	final private void Packing() {
		System.out.println("Domino Package");	
	}	
	final public void makePizza() {
		System.out.println("Pizza Making Started");
		dough();
		incredients();
		baking();
		Packing();
		System.out.println("Pizza created as per Domino Standard");
	}
	public abstract void delivery();
	public abstract void payment();
}
class IndianDomino extends DominoPizza{
	@Override
	public void delivery() {
		System.out.println("Delivery as per indian standard");
	}
	@Override
	public void payment() {
		System.out.println("payment receive as per indian standard");
	}
	public void review() {
		System.out.println("Customer review good");
	}
}