package basic.methods;

public class MethodOver {
static int add(int a,int b,int c)
{
	c=a+b;
	return c;
}
static double add(double a,double b)
{
	return a+b;
}
public static void main(String[] args) {
	System.out.println(add(2, 3, 1));
	System.out.println(add(2.0, 3.0));
}
}
