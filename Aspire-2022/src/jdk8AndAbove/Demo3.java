package jdk8AndAbove;

public class Demo3 {

	public static void main(String[] args) {
		//--Old Way of using constants--
		System.out.println(MyInter.pi);
		System.out.println(MyInter.fruits[1]);
		//--New Way of using constants--
		System.out.println(Fruits.apple);
		Fruits fruit=Fruits.orange;
		System.out.println(fruit.getPrice());
		process(Fruits.mango);
		//From JDK5 onwards SwitchCase accepts both String and enum.
		switch (fruit) {
		case apple:{System.out.println("This is apple");
			break;}
		case grapes:{System.out.println("This is grapes");
			break;}
		case mango:{System.out.println("This is mango");
			break;}
		case orange:{System.out.println("This is orange-");
			break;}
		default:{System.out.println("No item in this name");
			break;}
		}
	}
	public static void process(Fruits fruit) {
		System.out.println(fruit.getPrice());
	}

}
//--Old Way--
interface MyInter{
	public static final float pi=3.14f;
	public static final String fruits[]= {"apple","mango","orange"};
}
//--New Way--
enum Fruits{
	apple(100),mango(60),orange(120),grapes(80);
	int price;

	private Fruits(int price) {
		//this.price = price;
		setPrice(price);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
