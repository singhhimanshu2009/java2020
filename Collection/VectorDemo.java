package Collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v =new Vector(); //10
		
		//Vector v =new Vector(int capacity);
		//Vector v =new Vector(collection);
		
		//Vector v =new Vector(int intialcapacity , int capacity);
		
		for(int i=1;i<=10;i++) {
			v.addElement(i);
			
		}
		System.out.println(v.capacity()); //10
		System.out.println(v);
		v.addElement("java");
		System.out.println(v);
		System.out.println(v.capacity());//20
	}

}
