package level1.utilpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollDemo1 {

	public static void main(String[] args) {
		int array[]=new int[4];
		System.out.println(array.length);
		ArrayList<String> alist=new ArrayList();
		System.out.println("After creating  :"+alist.size());
		alist.add("Muhammad");
		alist.add("Ahamed");
		alist.add("Mehamood");
		System.out.println("After adding  :"+alist.size());
		alist.remove(1);
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
	}

}
