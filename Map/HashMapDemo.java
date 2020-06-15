package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		

		HashMap hm =new HashMap();	
		
		hm.put(101 ,"java");	
		hm.put(102 ,"java Developer");	
		hm.put(103 ,"java Job");	
		hm.put(104 ,"Spring");	
		hm.put(105 ,"Spring_Boot");	
		hm.put(106 ,"JPA");	
		
		System.out.println("Simple Print " +hm);
		
		Set keySet =hm.keySet();
		
		System.out.println("Key_Set "+ keySet);
		
		Collection c =hm.values();
		System.out.println("Values "+ c);
		
		
		Set EntrySet =hm.entrySet();
		
		System.out.println("Entry_Set "+ EntrySet );
		
		Iterator itr = EntrySet.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry m1 =(Map.Entry)itr.next();
			
			System.out.println("Key IS "+m1.getKey() +" | "+"Value "+m1.getValue());
			
						
		}
		
		
		
		
		
	}

}
