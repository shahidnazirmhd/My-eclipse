package basic.classesObjects;

import level1.AccessMod1;

public class AccesMod5Diff {
	AccessMod1 acc=new AccessMod1();
	void met() {
	//System.out.println(acc.pri);//CLASS Scope     // error occured
	 //System.out.println(acc.pro);//RELATION Scope  // error occured
	 System.out.println(acc.pub);//GLOBAL Scope
	// System.out.println(acc.nomod);//PACKAGE Scope   // error occured
}
}