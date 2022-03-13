package level1;

public class AccessMod3{      // modifiers in same package non-sub class 
	AccessMod1 acc=new AccessMod1();  // need to create a object for non subclass
	void met() {
		 //System.out.println(acc.pri);//CLASS Scope     // error occured
		 System.out.println(acc.pro);//RELATION Scope 
		 System.out.println(acc.pub);//GLOBAL Scope
		 System.out.println(acc.nomod);//PACKAGE Scope
	 }
}


