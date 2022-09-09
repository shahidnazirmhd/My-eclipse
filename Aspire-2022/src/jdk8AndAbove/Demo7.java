package jdk8AndAbove;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo7 {
	

	public static void main(String[] args) throws Exception{
	/*	//Wrong way
		List list=new ArrayList();
		list.add("abc");
		list.add(1);
		list.add(new Object());
		System.out.println(list);
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			String s=(String)iter.next();
			System.out.println(s);
		}                                      */
		//Old way
		List<String> oldlist=new ArrayList<>();
		oldlist.add("abc");
		oldlist.add("def");
		oldlist.add("ghi");
		System.out.println(oldlist);
		Iterator iter=oldlist.iterator();
		while(iter.hasNext()) {
			String s=(String)iter.next();
			System.out.println(s);
		}
		System.out.println("\n______________________________________________\n");
		//New Way  -  Streams
		List<String> newlist=Arrays.asList("jkl","mno","pqr","zzz","zzz","zzz");
		//Streams - stream object can be used ones.
		Stream<String> stream=newlist.stream();
		//stream.forEach(System.out::println);
		//stream.forEachOrdered(System.out::println);
		//stream.forEach((s)->{System.out.println(s);});
		//stream.parallel().forEach(System.out::println); //Using multiThread-parallel.
		//stream.parallel().forEachOrdered(System.out::println);
		List templist=stream.parallel().
				filter((s)->{return s.equals("zzz");}).limit(2).
				collect(Collectors.toList());
		System.out.println(templist);
		
		//Complex type - New Way
		Student ramu=new Student(1, "A.ramu", 60);
		Student samu=new Student(2, "B.samu", 80);
		Student somu=new Student(3, "C.somu", 90);
		Student mamu=new Student(4, "D.mamu", 100);
		List<Student> students=Arrays.asList(ramu,samu,somu,mamu);
		System.out.println(students);
		List toppers=students.stream().parallel().
				filter(s->s.marks>70).map(s->s.name+":"+s.marks).
				sorted((x,y)->{return y.compareTo(x);}).
				collect(Collectors.toList());
		System.out.println(toppers);
		List toppers2=students.stream().parallel().
				filter(s->s.marks>70).
				sorted((x,y)->{return y.compareTo(x);}).
				collect(Collectors.toList());
		System.out.println(toppers2);
		FileOutputStream fos=new FileOutputStream("toppers.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(toppers2);
	}
}
class Student implements Serializable,Comparable<Student>{
	int sid;
	String name;
	int marks;
	public Student(int sid, String name, int marks) {
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
	
}


