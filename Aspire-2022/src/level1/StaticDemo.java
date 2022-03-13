package level1;

public class StaticDemo {

	public static void main(String[] args) {
		HomeKitchen.food();
		HomeKitchen.food();
	}

}
class Kitchen{
	String incredients="salt";
}
class HomeKitchen extends Kitchen{
	String main;
	String incredients="Pepper";
	public HomeKitchen() {
	          System.out.println("Accessed cons...");
	          System.out.println(this.incredients);
	          System.out.println(super.incredients);
	}
	static {
		System.out.println("East or West Home Is thee best");
	}
	static void food() {
		System.out.println("yummy............healthy");
		HomeKitchen obj=new HomeKitchen();
		obj.main="Rice";
		obj.foodInDinig();
	}
	void foodInDinig() {
         System.out.println("Food Yummy....Not Hot");	
         System.out.println(this.main);
	}
}