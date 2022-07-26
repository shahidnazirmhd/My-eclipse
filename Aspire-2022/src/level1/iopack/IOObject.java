package level1.iopack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class IOObject {

	public static void main(String[] args)throws Exception {
		IOObject obj=new IOObject();
		Laddu mylad=new Laddu();
		obj.writeObject(mylad);
		System.out.println("Before eating "+mylad.size);
		mylad.size=5;
		System.out.println("After eating "+mylad.size);
		mylad=(Laddu)obj.readObject();
		System.out.println("After using Time machine "+mylad.size);
	}
	public void writeObject(Object obj)throws Exception {
		FileOutputStream fos=new FileOutputStream("past.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		System.out.println("Time is preserved");
	}
	public Object readObject() throws Exception{
		FileInputStream fis=new  FileInputStream("past.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		return ois.readObject();
	}
}
class Laddu implements Serializable{
	int size =10;
}