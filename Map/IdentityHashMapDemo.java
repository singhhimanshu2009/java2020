package Map;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		
		//HashMap hm =new HashMap();   // .equals() 
		IdentityHashMap hm =new IdentityHashMap(); // ==
		
		
		
		Integer i1 =new Integer(10);
		Integer i2 =new Integer(10);
		
		hm.put(i1, "vishu");
		hm.put(i2, "java");
		
		System.out.println(hm);
		
		
		

	}

}
