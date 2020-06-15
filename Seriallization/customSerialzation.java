package Seriallization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	
	String username ="Himanshu";
	transient String password ="somya";
	
	private void writeObject(ObjectOutputStream os) throws Exception {
		os.defaultWriteObject();
		String enc_pass ="123"+password; 
		os.writeObject(enc_pass);
	}
	
	private void readObject(ObjectInputStream ois)throws Exception {
		ois.defaultReadObject();
		String dec_pass =(String)ois.readObject();
		password =dec_pass.substring(3);
	}
}

public class customSerialzation {

	public static void main(String[] args) throws Exception {
		Account a1 =new Account();
		
		ObjectOutputStream oss =new ObjectOutputStream(new FileOutputStream("abc.ser"));
		oss.writeObject(a1);
		
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("abc.ser"));
		
		Account a2 =(Account)ois.readObject();
		
		System.out.println(a2.username);
		System.out.println(a2.password);
		

	}	

}
