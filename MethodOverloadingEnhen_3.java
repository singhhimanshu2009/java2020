class Testfour{


	
	public void m1(String s1) {
		System.out.println("String class");
	}
	
	public void m1(StringBuffer s1) {
		System.out.println("String Buffer class");
	}
	
}
public class MethodOverloadingEnhen_3 {

	public static void main(String[] args) {
	
		Testfour t1 =new Testfour();
		
		t1.m1("java");
		t1.m1(new StringBuffer("vishu"));
		t1.m1(null);
	
		
	}

}
