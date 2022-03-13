package basic;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String welcome = "\tHello\\ \nworld";
		String name= "it\'s\"shahid\"";
		System.out.println(welcome);
		System.out.println("length:"+welcome.length());
		System.out.println("capital:"+welcome.toUpperCase());
		System.out.println("Lower:"+welcome.toLowerCase());
		System.out.println("locateof:"+welcome.indexOf("world")); //include space
        System.out.println(welcome+" "+name);
        System.out.println(welcome.concat(name));
	}

}
