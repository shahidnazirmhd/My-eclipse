package level1.exceppack;


public class DemoException7 {
	public static void main(String[] args) /*throws DogBiteException*/{
		System.out.println("Before Exception");
	      Child baby =new Child();
	      Dog jimmy=new Dog();
	    baby.dogplaywithC(jimmy, "stick");
	     // jimmy.dogPlayWith("stick");
		System.out.println("After Exception");
	}
	
}
class Child{
	void dogplaywithC(Dog dog,String item) {
		try {
			dog.dogPlayWith(item);
		} catch (DogBiteException dbe) {
			System.out.println(dbe);
			dbe.printStackTrace();
		}
	}
}
class Dog{
	void dogPlayWith(String item) throws DogBiteException {
		if(item.equals("stick")) {
			throw new DogBiteException();
		}
	}
}
class DogBiteException extends Exception{
	
}