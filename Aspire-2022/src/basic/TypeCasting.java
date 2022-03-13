package basic;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("automatic type casting");
     byte num1= 100;
     int num2= num1;
     System.out.println(num1+" "+num2);
     System.out.println("manually type casting");
     int num3=123;
     byte num4= (byte)num3;
     System.out.println(num3+" "+num4);
     float num5= 234.54f;
     int num6= (int)num5;
     System.out.println(num5+" "+num6);
	}

}
