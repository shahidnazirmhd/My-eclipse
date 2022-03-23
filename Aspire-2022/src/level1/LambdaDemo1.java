package level1;

public class LambdaDemo1 {

	public static void main(String[] args) {
		//Nested inner class
		new LambdaDemo1().new MyinterImpl().met();
		//anonymous inner class
		new Myinterface() {
			
			@Override
			public void met() {
				System.out.println("met called by anonymous inner type");
			}
		}.met();
		//Lambda
		Myinterface mif=() -> {System.out.println("met called by lambda");};
		mif.met();
		Myinterface2 mif2=(s,n) -> {System.out.println("met param called by lambda "+s+" : "+n);};
		mif2.met("shahid",28);
	}
	class MyinterImpl implements Myinterface{
		@Override
		public void met() {
		System.out.println("met called by implemention");	
		}
	}

}
interface Myinterface{
	void met();
}
interface Myinterface2{
	void met(String s,int n);
}