package level1.exceppack;

import java.util.Scanner;

public class DemoException1 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		Scanner scan =new Scanner(System.in);
		int v =scan.nextInt();
		int i=0;
		try{
			int result=v/i;
			System.out.println(result);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("After Exception");
	}

}
