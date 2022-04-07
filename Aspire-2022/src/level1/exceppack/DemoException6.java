package level1.exceppack;


public class DemoException6 {
	public static void main(String[] args) {
		System.out.println("Before Exception");
		new DemoException6().met();
		System.out.println("After Exception");
	}
	void met() {
		try{
			super.clone();
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}