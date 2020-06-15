package Map;

import java.util.Comparator;
import java.util.TreeMap;

class Mycomprator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1 =o1.toString();
		String s2 =o2.toString();
		
		return s2.compareTo(s1);
	
		/*
		 * if(s1.length()>s2.length()) { return -1;
		 * 
		 * }else if(s2.length()<s1.length()) return +1; else { return 0; }
		 */
	}
	
	
}

public class TreeMapDemoTwo {

	public static void main(String[] args) {
		TreeMap m =new TreeMap(new Mycomprator());
		
		m.put("xxx",10);
		m.put("AAA", 30);
		m.put("zzz", 31);
		m.put("jjj", 25);
		System.out.println(m);
		
	}

}
