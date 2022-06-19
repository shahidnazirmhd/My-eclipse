package level1.utilpack;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class CollDemo5 {

	public static void main(String[] args) {
		Random ran=new Random();
		Set<Integer> myset=new TreeSet<Integer>();
	/*  for (int i = 0; i < 10; i++) {
			//System.out.println(ran.nextInt(10));
			myset.add(ran.nextInt(100));
		}
		System.out.println(myset);
		System.out.println(myset.size());       */
		while (true) {
			myset.add(ran.nextInt(1000));
			if (myset.size()==10) {
				break;
			}
		}
		System.out.println(myset);
		System.out.println(myset.size());

	}

}
