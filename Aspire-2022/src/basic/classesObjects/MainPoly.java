package basic.classesObjects;
class People {
	public void details() {
			System.out.println("People Details");
	}
}
class Indian extends People {
	public void details() {
		System.out.println("From Chennai, India");
		
	}
}
class Arabian extends People {
	public void details() {
		System.out.println("from Mecca, KSA");
	}
}
class English extends People {
	public void details() {
		System.out.println("From London, UK");
	}
}
 class MainPoly {
public static void main(String[] args)
{
		                                // Instead this -Polymorphism 
		People det0=new People();       //People det0=new People();
	    People det1=new Arabian();      //Arabian det1=new Arabian();
		People det2=new Indian();       //Indian det2=new Indian();
        People det3=new English();      //English det3=new English();                                                 
		     det0.details();                                                   
		     det1.details();                                                     
             det2.details();                                                           
             det3.details();
   }
 }  
   

                                                     
	             	                                       
	
