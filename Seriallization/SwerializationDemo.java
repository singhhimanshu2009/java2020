package Seriallization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable{
	
	int i =10;
	int j =20;
	//10 k
	  //	6 //
}

public class SwerializationDemo {

	public static void main(String[] args) throws Exception {
		Test t1 =new Test();
		
		
		// 2 min 
		
		FileOutputStream fos = new FileOutputStream("abs.ser");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(t1);
		
		// 2 read
		FileInputStream fis =new FileInputStream("abs.ser");
		ObjectInputStream ois =new ObjectInputStream(fis);
		Test t2 =(Test)ois.readObject();
		
		System.out.println(t2.i);
		System.out.println(t2.j);

	}

}
