package level1.threadpack;             // Why synchronized is important.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo6 {
	public static void main(String[] args){
		Bank bank=new Bank();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			synchronized (bank) {
				bank.credit(6000);
				bank.debit();
			}
		});
		es.execute(()->{
			synchronized (bank) {
				bank.credit(10000);
				bank.debit();
			}
		});
		es.shutdown();
		
	}
}
class Bank {
	int amt;
	public void credit(int amt) {
		this.amt=amt;
		System.out.println(amt+" Amount credited...");
		try{Thread.sleep(5000);}catch(Exception e) {}
	}
	public void debit() {
		System.out.println(amt+" Amount debited...");
	}
}