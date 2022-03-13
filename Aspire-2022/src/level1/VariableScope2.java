package level1;

public class VariableScope2 {              //Complex type

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		TrainRoom sam=new TrainRoom();
		TrainRoom pam=new  TrainRoom();
		System.out.println(sam.cam+":"+pam.cam);
		System.out.println(sam.jam+":"+pam.jam); //  static variable are called by class name
		System.out.println(TrainRoom.jam+":"+TrainRoom.jam);

	}
}
	class TrainRoom
	{
		Screen cam=new Screen();                //Instance variable
		static Toilet jam=new Toilet();        //Class Variable
		 
	}
	class Screen
	{
		
	}
	class Toilet
	{
		
	}


