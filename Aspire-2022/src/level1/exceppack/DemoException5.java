package level1.exceppack;


public class DemoException5 {
	public static void main(String[] args) throws Exception {
		System.out.println("Before Exception");
		new DemoException5().met();
		System.out.println("After Exception");
		
	}
	void met() throws Exception {
		super.clone();
	}
}