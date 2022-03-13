package basic.classesObjects;

import java.util.LinkedList;

public class LinkedListMain { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> mynum= new LinkedList<Integer>();	
    mynum.add(45);
	mynum.add(61);
	mynum.add(70);
	mynum.addLast(88);
	mynum.addFirst(00);
	mynum.addAll(mynum);
	System.out.println(mynum);
	}

}
