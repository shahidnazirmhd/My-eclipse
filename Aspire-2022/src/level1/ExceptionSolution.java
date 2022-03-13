package level1;

public class ExceptionSolution {

	public static void main(String[] args) {
		int result=0;
		int length=args.length;
		if (length==0) {
			System.out.println("Enter a value in command line");
		}
		else {
			String s=args[0];
			if (Character.isDigit(s.charAt(0))) {
				int n=Integer.parseInt(s);
				if (n==0) {
					System.out.println("Division by zero not possible");	
				}
				else {
					result=1/n;
				}
			}
			else {
				System.out.println("Division only done by number");
			}
		}
		System.out.println("Result "+result);

	}

}
