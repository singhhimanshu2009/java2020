class ParentTwo_A{
	
	private void m1(int x) {
		System.out.println("first method");
				
	}
}
class ChildTwo_A extends ParentTwo_A {
	public void m1(int y ) {
			System.out.println("child class method");
}
}

public class MethodOverriding_Enhen_3 {
	
public static void main(String []aa) {
	
	ChildTwo_A p1 =new ChildTwo_A();
	p1.m1(10);
	
	
}
	
	

}
