package basic;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10,y=20;
		if(x>y)
		{
			System.out.println("x is greater");
		}
		else 
		{
			System.out.println("y is greater");
			
		}
		int time=10;
		if(time>12)
		{
			System.out.println("good after noon");
			
		}
		else if(time>18)
		{
			System.out.println("good evening");
			
		}
		else {
			System.out.println("good morning");
		}
		int hour = 20;
		String result= (hour<18)? "good day":"good evening";// if else easy alter
		System.out.println(result);
	}

}
