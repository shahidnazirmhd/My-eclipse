package level1.threadpack;

public class ThreadDemo1 {
	public ThreadDemo1() {
		System.out.println("cons called....");
		new Thread(()->{ThreadDemo1.met2();}).start();
		new Thread(()->{ThreadDemo1.met3();}).start();
	}

	public static void main(String[] args) {
		System.out.println("First Line");
		System.out.println("Second Line");
		System.out.println("Third Line");
		new ThreadDemo1();
		met1();
		//met2();
		//met3();
		
		

	}
	static void met1() {
		try {Thread.sleep(5000);} catch (Exception e) {}
		System.out.println("met 1 called....");
	}
	static void met2() {
		System.out.println("met 2 called....");
	}
	static int met3() {
		System.out.println("met 3 called....");
		return 1;
	}

}
