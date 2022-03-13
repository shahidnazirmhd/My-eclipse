package level1;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try{
			int i=1/Integer.parseInt(args[0]);
		}
		catch (ArrayIndexOutOfBoundsException aie) {
		        System.out.println(aie);
		        System.out.println("Enter a value in command line");
		}
		catch (ArithmeticException ae) {
			System.out.println(ae);
			System.out.println("Division by zero not possible");
		}
		catch (NumberFormatException ne) {
			System.out.println(ne);
			System.out.println("Division only done by Numbers");
		}
		catch(Exception e){
			System.err.println(e);
			System.out.println("Something went wrong");
		}
		finally {
			System.out.println("finally called");
		}
		System.err.println("After Exception");

	}

}
