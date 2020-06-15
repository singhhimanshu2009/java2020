package StringPack;

public class MmutableandImmutable {

	public static void main(String[] args) {
		
		String s1 ="java";
		
		String s2=s1.concat("developer");
		
		System.out.println(s2);
		
		StringBuffer b1 =new StringBuffer("java");
		b1.append("developer");
		System.out.println(b1);
		
	}

}
