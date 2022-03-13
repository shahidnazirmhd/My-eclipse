package level1;

public class MethodOver {
	

void met() {
	System.out.println("met called..");
}

void met(int i) {
	System.out.println("met with int param called.."+i);
}

void met(long i) {
	System.out.println("met with long param called.."+i);
}

void met2(int i,String n) {
	System.out.println("......................"+i+n);
}

void met3(boolean boo) {
	System.out.println("booooooooooooooooooooooooooooooo"+boo);
}

void met4(int a[]) {
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	for(int i:a) {
		System.out.print(i+"\t");
	}
}

void met5(int... aa) {//var args
	for(int i=0;i<aa.length;i++) {
		System.out.println(aa[i]);
	}
	
	for(int i:aa) {
		System.out.print(i+"\t");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOver obj=new MethodOver();
		obj.met();
		
		obj.met(2);
		
		obj.met((long)100);
		
		obj.met2(10,"aspire");
		
		obj.met3(false);
		
		int arr[]= {34,76,98,76};
		
		obj.met4(arr);
		obj.met4(new int[] {10,20,30,40});//anonymous array
		
		obj.met5(12,45,67,89);
	}

}
