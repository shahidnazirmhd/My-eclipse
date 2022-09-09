package jdk8AndAbove;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo8 {

	public static void main(String[] args) {
	//Old Way
		Map<String, Student> map=new TreeMap<>();
		Student ramu=new Student(1, "A.ramu", 60);
		Student samu=new Student(2, "B.samu", 80);
		Student somu=new Student(3, "C.somu", 90);
		Student mamu=new Student(4, "D.mamu", 100);
		map.put("s1", ramu);
		map.put("s2", samu);
		map.put("s3", somu);
		map.put("s4", mamu); 
		System.out.println(map.get("s1"));
		Set<Map.Entry<String,Student>> set=map.entrySet();
		Iterator<Map.Entry<String, Student>> iter=set.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Student> me=iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
			//New Way
		System.out.println("\n_____________________________\n");
		map.entrySet().stream().
		sorted(Entry.comparingByKey((x,y)->{return y.compareTo(x);})).
		forEach(System.out::println);
	}

}
