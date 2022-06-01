package level1.threadpack;                    // class lock

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo5 {
	public static void main(String[] args){
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			synchronized(ClassLock.class) {
				ClassLock.met();
				}
		});
		es.execute(()->{
			synchronized(ClassLock.class) {
			 ClassLock.met();
			}
			});
		es.shutdown();	
	}
}
class ClassLock{
	static public void met() {     // use synchronized for class in outside. it work in static met.
		System.out.println("met called");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("calling met is over...");
	}
}