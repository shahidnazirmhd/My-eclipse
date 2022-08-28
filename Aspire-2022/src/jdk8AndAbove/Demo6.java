package jdk8AndAbove;

import java.util.Optional;
import java.util.function.Consumer;

public class Demo6 {
		public static void main(String[] args) {
			String s[]=new String[5];
			//Old way of checking
			if (s[1]==null) {
				System.out.println("OldWayChecking: Empty value");
			} else {
				System.out.println("OldWayChecking: has a value");
			}
			//New way of checking
			s[1]="Hello";
			Optional.ofNullable(s[1]).ifPresentOrElse(new Myconsumer(), new MyRunnable());
			//New Trend - Lambda
			s[1]="Lambda Hello";
			Optional.ofNullable(s[1]).ifPresentOrElse((n)->{System.out.println(n);},()->{System.out.println("Empty value");});
			//New Trend - method Refrencing
			s[1]="Met Ref Hello";
			Optional.ofNullable(s[1]).ifPresentOrElse(System.out::println,()->{System.out.println("Empty value");});
		}
}
class Myconsumer implements Consumer{
	@Override
	public void accept(Object t) {
		System.out.println(t);
	}
}
class MyRunnable implements Runnable{
	@Override
	public void run() {
System.out.println("Empty value");
	}
}