package basic;

public class ForLoop {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.print(i);
			}
		System.out.println("\r");
		for(int j=0;j<10;j+=2)//j=j+2
			{
				System.out.print(j);
		}
		System.out.println("\r\r");
		String cars[]= {"toyota","shift","omni","ferrari"};
//for each loop
		for (String i : cars) {
			System.out.println(i);
		}
		
	}

}
