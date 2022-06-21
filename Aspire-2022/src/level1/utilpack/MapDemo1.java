package level1.utilpack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		//HashMap<Integer, String> hm=new HashMap<Integer, String>();
		//TreeMap<Integer, String> hm=new TreeMap<Integer, String>();
		TreeMap<Integer, String> hm=new TreeMap<Integer, String>((s1,s2)->{return s2.compareTo(s1);});
		hm.put(5, "anju");
		hm.put(4, "naalu");
		hm.put(7, "yelu");
		hm.put(8, "yettu");
		hm.put(6, "aaruu");
		System.out.println(hm);
		System.out.println(hm.get(7));
		Set<Map.Entry<Integer,String>> set=hm.entrySet();
		Iterator<Map.Entry<Integer,String>> iter=set.iterator();
		while (iter.hasNext()) {
			Map.Entry<Integer,String> me=iter.next();
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		
		

	}

}
