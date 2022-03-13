package level1;

public class VariableScope {
	int i;                  //instance variable 
	static int ii;          //class variable
	void met(int i) {       //local variable
		System.out.println(i);
	}
	void met2(long l) {
		System.out.println(l);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableScope obj =new VariableScope();
		obj.i=10;
		//obj.ii=100; -static variable are called by class name
		VariableScope.ii=100;
		VariableScope obj2 =new VariableScope();
		System.out.println(obj.i+":"+obj2.i);
		System.out.println(VariableScope.ii+":"+VariableScope.ii);
		//System.out.println(obj.ii+":"+obj2.ii);
		obj2.i=20;
		VariableScope.ii=200;
		System.out.println(obj.i+":"+obj2.i);
		System.out.println(VariableScope.ii+":"+VariableScope.ii); 
		//System.out.println(obj.ii+":"+obj2.ii);
		
		obj.met(1000);
		VariableScope objX=obj;
		objX.met(2000);
		System.out.println(obj.i+":"+objX.i);
		
	}

}
