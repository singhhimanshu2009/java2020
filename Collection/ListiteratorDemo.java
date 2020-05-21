package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListiteratorDemo {

	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		
		for(int i=1;i<=10;i++) {
			al.add(i);
			
		}
		
		
		ListIterator itr = al.listIterator(al.size());
			
		while(itr.hasPrevious()){
			Integer it =(Integer)itr.previous();
						
				
		}
		
		System.out.println(al);

	}

}
