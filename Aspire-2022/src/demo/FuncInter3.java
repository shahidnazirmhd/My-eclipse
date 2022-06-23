package demo;

public class FuncInter3 {              //    -Methed Referancing

	public static void main(String[] args) {
		MyFuncInter7 fc7=FuncInter3::myMet;
		fc7.met();
	/*	MyFuncInter7 fc07=new FuncInter3()::myMeth;
		fc07.met();           */
		fc7=new FuncInter3()::myMeth;
		fc7.met();
		
	}
	public static void myMet() {
		System.out.println("my static met.....");
	}
	public void myMeth() {
		System.out.println("my non static met.....");
	}
}
interface MyFuncInter7{
	public void met();
}