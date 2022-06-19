package level1.utilpack;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollDemo4 {

	public static void main(String[] args) {
		//Set<String> myset= new HashSet<String>();
		TreeSet<String> myset=new TreeSet<String>((s1,s2)->{return s1.compareTo(s2);});
		myset.add("Sharp");
		myset.add("Hope");
		myset.add("Active");
		myset.add("Honest");
		myset.add("Idealistic");
		myset.add("Dignity");
		System.out.println(myset);
		//Collections.sort(myset);
		 
		Iterator<String> itr=myset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
