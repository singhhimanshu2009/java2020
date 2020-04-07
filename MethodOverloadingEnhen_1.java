class TestTWO{

	public void m1(int x) {
		System.out.println("int args");
	}
	
	
	
}
public class MethodOverloadingEnhen_1 {

	public static void main(String[] args) {
	
		TestTWO t1 =new TestTWO();
		byte b1 =10;
		t1.m1(b1);
		

	}

}
