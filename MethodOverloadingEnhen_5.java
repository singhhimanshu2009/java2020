class Testsix{

	public void m1(int i) {
		System.out.println("Normal method");// java 1.0
	}
	
	public void m1(int ...x) {
		System.out.println("varArgs method"); // java 1.5
	}
	
}
public class MethodOverloadingEnhen_5 {

	public static void main(String... args) {
	
		Testsix t1 =new Testsix();
		t1.m1(10);
		t1.m1(10,20);
		
		t1.m1(10);
		
		
		
	}

}
