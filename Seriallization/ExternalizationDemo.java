package Seriallization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class ExternalTest implements Externalizable {

	String s;
	int j;
	int k;

	public ExternalTest() {
		super();

	}
	public ExternalTest(String s, int j, int k) {
		super();
		this.s = s;
		this.j = j;
		this.k = k;
	}

	@Override
	public void writeExternal(ObjectOutput oo) throws IOException {
		oo.writeObject(s);
		oo.writeInt(j);

	}

	@Override
	public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException {

		s = (String) oi.readObject();
		j = oi.readInt();

	}

}

public class ExternalizationDemo {

	public static void main(String[] args)throws Exception {
		
		ExternalTest et =new ExternalTest("java",1,2);
		
		ObjectOutputStream oss =new ObjectOutputStream(new FileOutputStream("ext.ser"));
		oss.writeObject(et);
		
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("ext.ser"));
		ExternalTest ev =(ExternalTest)ois.readObject();
		
		System.out.println(ev.s);
		System.out.println(ev.j);
		System.out.println(ev.k);

	}

}
