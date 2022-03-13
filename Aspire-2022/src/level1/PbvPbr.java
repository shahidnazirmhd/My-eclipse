package level1;

public class PbvPbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Laddu laadu = new Laddu();          //complex type
    PbvPbr vr= new PbvPbr();
    System.out.println(":::PASS BY VALUE:::\n");
    System.out.println("Before passing value :"+laadu.size);
    vr.pbv(laadu.size);  //not affect original value
    System.out.println("After passing value :"+laadu.size);
    System.out.println("\n:::PASS BY REFERENCE(Object):::\n");
    System.out.println("Before passing value :"+laadu.size);
    vr.pbr(laadu);//affect original value
    System.out.println("After passing value :"+laadu.size);
	}
	void pbv(int size) {
		size=5;
		System.out.println("inside method value :"+size);
	}
	void pbr(Laddu boondhi) {
		boondhi.size=5;
		System.out.println("inside method value :"+boondhi.size);
	}
}
class Laddu
{
	int size=10;      //primitive type
}
