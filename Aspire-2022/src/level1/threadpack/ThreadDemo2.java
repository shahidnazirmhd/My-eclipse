package level1.threadpack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo2 {

	public static void main(String[] args) {
		/* Thread t=new Thread(new ThreadJob());
		t.start(); */      //   - NOt recommended because it not understand latest hardware.
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(new ThreadJob());
		//es.execute(()->{System.out.println("child thread called by lambda.");});
		//es.execute(ThreadDemo2::met);
//		es.execute(new Runnable() {			
//			@Override
//			public void run() {
//				System.out.println("child thread called by anonymous inner type");
//			}
//		});
		
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {Thread.sleep(500);} catch (Exception e) {}
		}
		es.shutdown();
	}
	static void met() {
		System.out.println("child thread called by met ref");
	}
}
class ThreadJob implements Runnable{
	@Override
	public void run() {
	System.out.println("child thread called...");
		
	}
}