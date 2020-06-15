package Map;

import java.util.HashMap;
import java.util.WeakHashMap;

class Temp{
	
	public String toString() {
		return "Temp";
	}
	
	public void finalize() {
		System.out.println("Object is Out");
	}
}


public class WeakHashMapDemo {

	public static void main(String[] args) throws Exception {
	
		//HashMap hm =new HashMap();
		
		WeakHashMap hm =new WeakHashMap();
		Temp t1 = new Temp();
		
		hm.put(t1, "vishu");
		
		t1=null;
		System.gc();
		Thread.sleep(5000);
		
		System.out.println(hm);
		
		
	}

}
