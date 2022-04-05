package level1.exceppack;

import java.util.Scanner;

public class DemoException2 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		Scanner scan =new Scanner(System.in);
		int sv =Integer.parseInt(args[0]);
	//	int uv =scan.nextInt();
		int i=0;
		try{
			int resultS=sv/i;
			//int resultU=uv/i;
			System.out.println(resultS);
			//System.out.println(resultU);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("After Exception");
	}

}
