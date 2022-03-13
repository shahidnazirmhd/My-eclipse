package basic.methods;

public class Method4 {
     static void checkAge(int age)
     {
    	 if(age<18)
    	 {
    		 System.out.println("access denied-your child");
    	 }
    	 else
    	 {
    		 System.out.println("access granted");
    	 }
   }
     public static void main(String[] args) {
            checkAge(18);	
	}
}
