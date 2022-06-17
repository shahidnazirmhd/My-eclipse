package level1.utilpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class CollDemo1 {

	public static void main(String[] args) {
		int array[]=new int[4];
		System.out.println(array.length);
		//ArrayList<String> alist=new ArrayList();
		//LinkedList<String> alist=new LinkedList();
		Vector<String> alist=new Vector<>();
		System.out.println(alist);
		System.out.println("After creating  :"+alist.size());
		alist.add("Muhammad");
		alist.add("Ahamed");
		alist.add("Mehamood");
		System.out.println(alist);
		System.out.println("After adding  :"+alist.size());
		alist.remove(1);
		System.out.println(alist);
		System.out.println("After removing  :"+alist.size());
		System.out.println(alist.get(1));
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		System.out.println(".................................................................");
		for(String s:alist) {
			System.out.println(s);
		}
		System.out.println(".................................................................");
		Iterator<String> iter=alist.iterator();
		//alist.add("The Great");    - not possible to modify after Iterator
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(".................................................................");
		ListIterator<String> lisIter=alist.listIterator();
		while(lisIter.hasNext()) {
			System.out.println(lisIter.next());
		}
		System.out.println("___________________________");
		while(lisIter.hasPrevious()) {
			System.out.println(lisIter.previous());
		}
		System.out.println(alist);
		System.out.println("....................For Vector................................");
		Enumeration<String> en=alist.elements();
		alist.add("The Great");  //  - it is possible to modify after element
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println(".................................................................");
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println(alist);
		System.out.println(".................................................................");
	}

}
