package level1;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		Dog puppy = new Dog();
		try {
		puppy.playWith("stone");
		} catch (DogAnger da) {
			System.out.println(da);
		} catch (DogRuns dr) {
			System.out.println(dr);
		}
	}

}
class Dog{
	   public void playWith(String item) throws DogAnger,DogRuns{
		if (item.equals("stick")) {
			throw new DogAnger("If You beat, I Will anger and Bite");
		}
			if (item.equals("stone")) {
				throw new DogRuns("If You throw, I Will scar and Runs");
			}
		}
	}
class DogAnger extends Exception{
	String msg;
	public DogAnger(String msg) {
	     this.msg=msg;
	}
	@Override                       // tostring(); - from object class.   Every user defined class extends object class when object created
	public String toString() {
		return "Exception is "+msg;
	}
}
class DogRuns extends Exception{
	String msg;
	public DogRuns(String msg) {
	     this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is "+msg;
	}
}