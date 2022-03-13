package basic.methods;

public class MethodRec {
static int sum(int k)
{
	if(k>0) {
		return k + sum(k-1);
	}
	else
	{
		return 0;
	}
}
	public static void main(String[] args) {
		int mysum= sum(10);
		System.out.println(mysum);

}
}