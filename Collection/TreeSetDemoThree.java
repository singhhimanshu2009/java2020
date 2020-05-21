package Collection;

import java.util.Comparator;
import java.util.TreeSet;


class MyComprator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 =(Integer)o1;
		Integer i2 =(Integer)o2;
		
		if(i1<i2) 
		return +2122;
		else if(i1>i2)
			return -212;
		else
		return 0;
	}
	
}

public class TreeSetDemoThree {

	public static void main(String[] args) {
		
		TreeSet t1 =new TreeSet(new MyComprator());
		
		t1.add(10);
		t1.add(8);
		t1.add(1);
		t1.add(0);
		t1.add(20);
		t1.add(40);
		
		
		System.out.println(t1);
	
	}

}
