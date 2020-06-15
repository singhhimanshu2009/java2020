package StringPack;

public class DoubleEqual {

	public static void main(String[] args) {
		String s1 =new String ("java");
		String s2 =new String("java");

		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));


		StringBuffer b1 =new StringBuffer("java");
		StringBuffer b2 =new StringBuffer("java");

		System.out.println(b1==b2); //flase
		System.out.println(b1.equals(b2));//false

	}

}
