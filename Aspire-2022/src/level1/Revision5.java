package level1;

public class Revision5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {10,20,30,40,50};
       System.out.println("Before passing.. "+a[0]);
       new PassArray().setArray(a);                         //array always passing a reference, original value affected
       System.out.println("After passing.. "+a[0]+"\n");
       //solution 1 -Anonymous array 
       int b[]= {10,20,30,40,50};
       System.out.println("Before passing.. "+b[0]);
       new PassArray().setArray(new int[] {10,20,30,40,50} );
       System.out.println("After passing.. "+b[0]+"\n");
       //solution 2 -create a copy and send
       int c[]=new int[5];
       for (int i=0;i<b.length;i++) {
    	   c[i]=b[i];
       }
       System.out.println("Before passing.. "+b[0]);
       new PassArray().setArray(c);                         
       System.out.println("After passing.. "+b[0]+"\n");
       //solution 3 -create a copy using system class
       int d[]=new int[5];
       System.arraycopy(b, 0, d, 0, 5);
       System.out.println("Before passing.. "+b[0]);
       new PassArray().setArray(d);                         
       System.out.println("After passing.. "+b[0]+"\n");
	}

}
class PassArray{
	void setArray(int r[]) {
		r[0]=999;
		System.out.println(r[0]);
	}
	
	
}