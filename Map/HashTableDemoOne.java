package Map;

import java.util.Hashtable;

class temp{
	
	int i;
	public temp(int i) {
		this.i =i;
	}
	public int hashCode() {
		return i;
	}
	
	public String toString() {
		return i+"";
	}
}

public class HashTableDemoOne {

	public static void main(String[] args) {
		
		Hashtable t1 =new Hashtable();  
		
		t1.put(new temp(5), "java");
		t1.put(new temp(2), "sddsds");
		t1.put(new temp(6), "sjdhj");
		t1.put(new temp(15), "dsd");
		t1.put(new temp(23), "ssd");
		t1.put(new temp(16), "sdd");
		
		System.out.println(t1);
		
	}

}
