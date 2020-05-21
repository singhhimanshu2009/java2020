package Collection;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {

		// ArrayList al =new ArrayList(); // 10 size
		ArrayList al = new ArrayList(1000); // 999
		// ArrayList al2 =new ArrayList(Collection obj);
		ArrayList al3 = new ArrayList(); // 10 size

		al3.add("ramu");
		al3.add("kamu");

		al.add("java");
		al.add("kava");
		al.add(10 + 5);
		al.add(15);
		al.add(10.8);
		al.add("java");

		al.add(0, "vishu");
		al.add(1, "dsjhjsdh");
		al.addAll(al3);

		System.out.println(al.contains("kava"));

		System.out.println(al);

	}

}
