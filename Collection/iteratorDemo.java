package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorDemo {

	public static void main(String[] args) {
	
		ArrayList al =new ArrayList();
		
		for(int i=1;i<=10;i++) {
			al.add(i);
			
		}
		System.out.println(al);
		
		Iterator itr = al.iterator();
		
		while (itr.hasNext()) {
			
			Integer it =(Integer)itr.next();
			System.out.println(it);
			itr.remove();
		}
		System.out.println(al);//empty
		
	}


	}

