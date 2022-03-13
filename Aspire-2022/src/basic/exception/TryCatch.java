package basic.exception;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /* int a[]= {1,2,3,4,5,6,7,8,9,0};
     System.out.println(a[10]);*/        // error occur
	try {
		int a[]= {1,2,3,4,5,6,7,8,9,0};
	     System.out.println(a[10]);
	}
	catch (Exception e) {
		System.out.println("Something went wrong:::Please verify");
	}
	finally {
		System.out.println("The 'try catch' statement is Used");
	}
	}

}
