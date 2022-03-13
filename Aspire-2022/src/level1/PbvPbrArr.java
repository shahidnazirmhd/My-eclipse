package level1;

public class PbvPbrArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int orgarr[]= {11,13,12,15,14};
       int orgCparr[]= {21,23,22,25,24};
   PbvPbrArr vr =new PbvPbrArr();
    System.out.println("Before passing array value: "+orgarr[3]);
    vr.passArr(orgarr);              //by default arrays are "pass by reference"
    System.out.println("After passing array value: "+orgarr[3]);
    vr.passArr(new int[] {1,2,3,4,5});    //Anonymous Array
    System.out.println("\n:::ArrayCopy:::\n");
    int arrCop[]=new int[5];
    System.arraycopy(orgCparr, 0, arrCop, 0, 5);
    System.out.println("Before passing array value: "+orgCparr[2]);
    System.out.println("Before Passing Copy array: "+arrCop[2]);
    vr.passCpArr(arrCop);// copy is affected instead of original
    System.out.println("After passing array value: "+orgCparr[2]);
    System.out.println("After Passing Copy array: "+arrCop[2]);
	}
void passArr(int a[])
{
	a[3]=0;
	System.out.println("Test-Inside Method Array Value: "+a[2]);
	System.out.println("Inside Method Array Value given original: "+a[3]);
	}
void passCpArr(int a[]) {
	a[2]=00;
	System.out.println("Test-Inside Method Array Value: "+a[3]);
	System.out.println("Inside Method Array Value given original: "+a[2]);
}
}
