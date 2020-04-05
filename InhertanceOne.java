class A {
	
	int a=10;
	int b=20;
	
	public void m1() {
		System.out.println("m1 method");
	}
}

class B extends A {
	
	public void m1() {
		System.out.println("m1 method in B");
	}
	public void m2() {
		System.out.println("m2 method");
		
	}
}

public class InhertanceOne {

	public static void main(String[] args) {
		
		B obj =new B();
//		obj.m1();
//		obj.m2();
		
		A a=new A();
//		a.m1();
//		a.m2();// error
		
		A a2 =new B();
		a2.m1();
	//	a2.m2();// error
		
		
	}

}
