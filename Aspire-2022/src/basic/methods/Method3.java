package basic.methods;

public class Method3 {
	static int add(int x,int y)
	{
		int z= x+y;
		return 5+z;
		//return z;
	}
	public static void main(String[] args) {
		int a = add(5,2);
		System.out.println(a);
		System.out.println(add(4,8));
	}

}
