package basic.classesObjects;

import level1.AccessMod1;

public class AccesMod4Diff extends AccessMod1 {
	void met1(){
	//System.out.println(pri);//CLASS Scope     // error occured
	 System.out.println(pro);//RELATION Scope (inherited)
	 System.out.println(pub);//GLOBAL Scope
	// System.out.println(nomod);//PACKAGE Scope       // error occured
	}
}
