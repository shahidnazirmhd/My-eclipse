package level1.exceppack;


public class DemoException8 {
	public static void main(String[] args) /*throws DogBiteException*/{
		System.out.println("Before Exception");
	      Child2 baby =new Child2();
	      Dog2 jimmy=new Dog2();
	    baby.dogplaywithC(jimmy, "stick");
	     // jimmy.dogPlayWith("stick");
		System.out.println("After Exception");
	}
	
}
class Child2{
	void dogplaywithC(Dog2 dog,String item) {
		try {
			dog.dogPlayWith(item);
		} catch (DogBiteException2 dbe) {
			System.out.println(dbe);
			//dbe.printStackTrace();
		}
	}
}
class Dog2{
	void dogPlayWith(String item) throws DogBiteException2 {
		if(item.equals("stick")) {
			throw new DogBiteException2("You beat,I bite !");
		}
	}
}
class DogBiteException2 extends Exception{
	   String msg;
	   public DogBiteException2(String msg) {
	     this.msg=msg;
	}
	   @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Exception is: "+msg;
	}
}