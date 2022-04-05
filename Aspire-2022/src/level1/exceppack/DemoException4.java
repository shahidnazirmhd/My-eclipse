package level1.exceppack;


public class DemoException4 {

	public static void main(String[] args){
		System.out.println("Before Exception");
		new DemoException4().met(10);
		System.out.println("After Exception");

	}
	void met(int i){
		try{
			if(i==10) {
			throw new Number10Exception();
		}
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
	
}
class Number10Exception extends Exception{
	
}