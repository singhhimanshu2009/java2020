class Testfive{

	public void m1(int i,float f) {
		System.out.println("first method");
	}
	
	public void m1(float f,int i) {
		System.out.println("second method");
	}
	
}
public class MethodOverloadingEnhen_4 {

	public static void main(String[] args) {
	
		Testfive t1 =new Testfive();
		
		t1.m1(10, 10.5f);
		t1.m1(10.6f, 10);	
		t1.m1(10, 10);
		
		
	}

}
