package level1.utilpack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollDemo3 {

	public static void main(String[] args) {
		Student stu=new Student("Nazir");
		System.out.println(stu);
		List<Student> slist=new LinkedList<Student>();
		slist.add(new Student("Muhammed"));
		slist.add(new Student("Shahid"));
		slist.add(new Student("Nazir"));
		System.out.println(slist);
		Collections.sort(slist);
		System.out.println(slist);
		Collections.sort(slist,(s1,s2)->{return s2.compareTo(s1);}); // - using lambda for descending order.
		System.out.println(slist);
	}
}
class Student implements Comparable<Student>{
	String name;
	public Student(String name) {
	   this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The name is...: "+name+"\n";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}