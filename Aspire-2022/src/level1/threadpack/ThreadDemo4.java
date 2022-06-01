package level1.threadpack;                       // method lock

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo4 {
	public static void main(String[] args){
		//SingleTon obj=SingleTon.createObject();
		//SingleTon obj2=SingleTon.createObject();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{SingleTon.createObject();});
		es.execute(()->{SingleTon.createObject();});
		es.shutdown();
	}
}
class SingleTon {
	private SingleTon() {            // creating a object is not possible, because constructor is private. 
	System.out.println("SingleTon Cons called...");
	}
	private static SingleTon single;
	synchronized public static SingleTon createObject() {// we got a double dip problem from using executorservice. 
		if(single==null) {                   //to overcome synchronized used.
			single=new SingleTon();
		}
	return single;	
	}
}