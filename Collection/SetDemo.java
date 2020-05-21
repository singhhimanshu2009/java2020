package Collection;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
								//16
								//loadFactor :0.75
		
		//HashSet hs2 = new HashSet(56);//loadFactor :0.75
		//	HashSet hs3 = new HashSet(int inticapacity , float fillratio);
		//HashSet hs4 = new HashSet(Collection obj);
		
		hs.add(1);
		System.out.println(hs.add(1)); // false
		hs.add("java");
		hs.add("kava");
		
		System.out.println(hs);
	}

}
