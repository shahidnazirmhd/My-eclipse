package level1.utilpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollDemo2 {

	public static void main(String[] args) {
		List<Integer> nlist=new ArrayList<Integer>();
		nlist.add(28);
		nlist.add(02);
		nlist.add(20);
		nlist.add(0);
		nlist.add(2802);
		nlist.add(2000);
		System.out.println(nlist);
		Collections.sort(nlist);
		System.out.println(nlist);
		Collections.sort(nlist,new MyComparator());
		System.out.println(nlist);
	}

}
class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}