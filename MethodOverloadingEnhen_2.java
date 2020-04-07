class TestThree{


	
	public void m1(Object obj) {
		System.out.println("object class");
	}
	
	public void m1(String s1) {
		System.out.println("String class");
	}
	
}
public class MethodOverloadingEnhen_2 {

	public static void main(String[] args) {
	
		TestThree t1 =new TestThree();
		
		t1.m1("java");
		t1.m1(new Object());
		
		t1.m1(null);
		
	}

}
