package basic.classesObjects;
import java.util.ArrayList;
import java.util.Collections; 

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> name=new ArrayList<String>();
     name.add("shahid");
     name.add("arshad");
     name.add("amjad");
     System.out.println(name);
     name.add("nazir");
     System.out.println(name);
     System.out.println(name.add("Brothers"));
     System.out.println(name);
     System.out.println(name.get(4));
     name.set(0,"SHAHID");
     System.out.println(name);
    name.remove("Brothers");
    System.out.println(name);
    System.out.println(name.size());
    for(int i=0;i<name.size();i++) {
    	System.out.println(name.get(i));
    }
    for(String i:name) {
    	System.out.println(i);
    }
  //  name.clear();
   // System.out.println(name);
    System.out.println(name.size());
    System.out.println("\n \n");
    ArrayList<Integer> number=new ArrayList<Integer>();
    number.add(28);
    number.add(02);
    number.add(2000);
    System.out.println(number);
    Collections.sort(number);
    Collections.sort(name);
    System.out.println(number);
    System.out.println(name);
    name.clear();
    number.clear();
    System.out.println(name+" "+number);
	}

}
