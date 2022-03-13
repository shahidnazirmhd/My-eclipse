package basic.classesObjects;

abstract class AbstCls {
	String fname= "shahid";
	int age = 21;
	public abstract void study(); 
}
class Student extends AbstCls {
	int graduateYear= 2021;
	public void study() {
		System.out.println("study well");
	}
	
}



