package basic;
import java.util.Scanner;
import java.util.Random;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner myin = new Scanner(System.in);
	        System.out.println("Enter User Name: ");
	        String userName= myin.nextLine();
	        System.out.println("Enter Employee Code: ");
	        int empCode= myin.nextInt();
        Random numCode= new Random();
        int passCode= numCode.nextInt(15000+10000)+10000;
        System.out.println("The Login Credential is : ");
        System.out.println("User Name: "+userName);
        System.out.println("Employee Code: "+empCode);
        System.out.println("Pass Code: "+passCode);
	}

}
