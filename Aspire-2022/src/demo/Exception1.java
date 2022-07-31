package demo;

public class Exception1 {

	public static void main(String[] args) {
		 if (args.length!=0) {
			String val=args[0];
			char c=val.charAt(0);
			if (Character.isDigit(c)) {
				if (Integer.parseInt(c+"")!=0) {
					int x=1/c;
					System.out.println(x);
				}
				else {
					System.out.println("Please enter a non zero value");
				}
			}
			else {
				 System.out.println("Please enter a number value");
			}
			
		}
		 else {
			 System.out.println("Please enter argument value...");
		 }

	}

}
