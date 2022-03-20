package level1;                      
//Construction Demo
public class Revision3 {                     
	public static void main(String[] args) {
		new ConsA();
		new ConsA(100);
		new ConsA("Nazir");
		ConsA obj=new ConsA("Nazir");
		obj.printVar();
		ConsA obj2=new ConsA("Muhammed");
		obj2.printVar();
	}
}
class ConsA{
	String str="shahid";
	ConsA(int n) {
		System.out.println("Cons param Called......... "+n);
	}
	ConsA(){
		System.out.println("Cons Called.........");
	}
	ConsA(String str){
		System.out.println("Cons param Called......... "+str);
		System.out.println("Cons param Called......... "+this.str);
		this.str=str;
		System.out.println("Cons param Called......... "+this.str);
		System.out.println("\n");
	}
	void printVar() {
		System.out.println(str);
	}
}