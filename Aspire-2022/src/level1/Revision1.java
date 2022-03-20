package level1;

public class Revision1 {
	int n=10;
	String str="shahid";
	int arr[]=new int[4];
	int weight=metWeight("medium");
	CompType ctype=new CompType();
	public static void main(String[] args) {
		                                     // Class-Complex , simple type
        Revision1 obj=new Revision1();
        System.out.println(obj.weight);
        obj.metDetails();
	}
	void metDetails() {
		System.out.println("Details..........");
		System.out.println(ctype.name+" : "+ctype.age);
		ctype.name="Nazir";
		ctype.age=22;
		System.out.println(ctype.name+" : "+ctype.age);
		System.out.println(ctype.weiProp);
		System.out.println(ctype.weight);
		ctype.setWeightProperty("medium");
		System.out.println(ctype.weiProp);
		System.out.println(ctype.weight);
	}
	int metWeight(String s) {
	if(s.equals("heavy")) {
		return 90;
	}
	else {
		return 50;
	}
}
}
class CompType{
	String name="shahid";
	int age=20;
	String weiProp="heavy";
	int weight=getWeight(getWeightProperty());
	int getWeight(String s) {
		if(weiProp.equals("heavy")) {
			return 90;
		}
		else {
			return 50;
		}
	}
	String getWeightProperty() {
		return this.weiProp;
	}
	void setWeightProperty(String weiProp) {
		this.weiProp=weiProp;
		weight=getWeight(this.weiProp);
	}
}