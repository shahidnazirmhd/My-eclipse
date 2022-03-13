package basic;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bike[]= {"fz","plzr","apche","fazr","rx"};
		bike[0]="xl";
		System.out.println(bike[0]+bike[3]);
		bike[0]="crux";
		System.out.println(bike[0]+bike[4]);
		System.out.println("\r");
		System.out.println(bike.length);
		for(String i : bike) 
		{
			System.out.println(i);	
			}
System.out.println("\r");
				String cars[]= {"shift","toyota","audi","bmw"};
		for(String i : cars) 
		{
			System.out.println(i);	
			}
		System.out.println("\r");
		for(int i=0;i<cars.length;i++)
		{
			System.out.println(cars[i]);
		}
}
}