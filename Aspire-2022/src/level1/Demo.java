package level1;
                                     //Anonymous innerclass type
public class Demo {
         void distributeQuiz() {
        	 new Test() {
				
				@Override
				void quiz() {
					// TODO Auto-generated method stub
				       System.out.println("question Distributed");	
				}
			}.quiz();
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test mcq=new Test();	
		Demo mcq=new Demo();
		mcq.distributeQuiz();
	}

}
abstract class Test{
	abstract void quiz();
}