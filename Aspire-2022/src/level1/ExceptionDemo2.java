package level1;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		LearningDriver naz=new LearningDriver();
		try{
			naz.drive("traffic");
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
class LearningDriver{
	public void drive(String road) throws Exception {
		System.out.println(" drive normally");
		if (road.equals("traffic")) {
			throw new Exception();
		}
	}
}