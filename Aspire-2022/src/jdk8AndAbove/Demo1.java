package jdk8AndAbove;          // Enhanced forLoop

public class Demo1 {

	public static void main(String[] args) {
	Demo1 callmet=new Demo1();
	//----OLd Way----
	//callmet.met1(1,2,3,4,5); //-not possible
	/*int ar[]= {1,2,3,4,5};
	callmet.met1(ar);*/
	callmet.met1(new int[] {1,2,3,4,5});
	//----New Way----
	callmet.met2(6,7,8,9,0);

	}
	//Old Way
	public void met1(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	//New Way
	public void met2(int ...i) {
		for (int j : i) {
			System.out.println(j);
		}
	}

}
