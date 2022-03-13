package level1;

public class AccessMod2 extends AccessMod1{      // modifiers in same package sub class 
	void met() {
		 //System.out.println(pri); // error occured
		 System.out.println(pro);
		 System.out.println(pub);
		 System.out.println(nomod);
	 }
}


