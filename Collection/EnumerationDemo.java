package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector v =new Vector(); 		
		for(int i=1;i<=10;i++) {
			v.addElement(i);
			
		}
		
		Enumeration er =v.elements();
		
		while(er.hasMoreElements()) {
			
			Integer itr =(Integer)er.nextElement();
			
			if(itr % 2==0) {
				System.out.println(itr);
			}
			
			
			
		}
		
		
	}


	}

