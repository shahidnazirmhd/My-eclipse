package level1.exceppack;

import java.util.Scanner;

public class DemoException3 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		Scanner scan =new Scanner(System.in);
	//	int uv =scan.nextInt();
		int i=0;
		try{
			int sv =Integer.parseInt(args[0]);
			int resultS=sv/i;
			//int resultU=uv/i;
			System.out.println(resultS);
			//System.out.println(resultU);
		}
		catch (ArithmeticException ae) {
			System.out.println(ae);
		}
		catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie);
		}
//		catch (NumberFormatException ne) {
//			System.out.println(ne);
//		}
		catch (Exception e) {
		System.out.println(e);
	}
		finally {
			System.out.println("finally ..........");
		}
	
		System.out.println("After Exception");
	}

}
