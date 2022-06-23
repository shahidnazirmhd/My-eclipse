package demo;

public class FuncInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         MyFuncInter fc=new MyFuncInter() {
			
			@Override
			public void met() {
				System.out.println("myfuncInter met called by Anonymous");
				
			}
		};
         fc.met();
         new MyFuncInter() {
			
			@Override
			public void met() {
				System.out.println("myfuncInter met called by Anonymous without object");
				
			}
		}.met();
		
		MyFuncInter2 fc2=new MyFuncInter2() {
			
			@Override
			public String met2() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		System.out.println(fc2.met2());
		
String s=new MyFuncInter2() {
			
			@Override
			public String met2() {
				// TODO Auto-generated method stub
				return null;
			}
		}.met2();
		System.out.println(s);
	}

}
interface MyFuncInter{
	public void met();
}
interface MyFuncInter2{
	public String met2();
}