package Seriallization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Auth implements Serializable{
	
	String username="vishu@nokia";
	transient final String password ="test";
}

public class tarnsientDemo {

	public static void main(String[] args) throws Exception {
		
		Auth auth = new Auth();
		FileOutputStream fos = new FileOutputStream("auth.ser");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(auth);
		
		
		FileInputStream fis =new FileInputStream("auth.ser");
		ObjectInputStream ois =new ObjectInputStream(fis);
		Auth t2 =(Auth)ois.readObject();
		System.out.println(t2.username);
		System.out.println(t2.password);

	}

}
