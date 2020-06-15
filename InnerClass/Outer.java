package InnerClass;

public class Outer {
	
	int x =10;
	static int y=20;
	
	class Inner{
	
		public void m1() {
			System.out.println(x);
			System.out.println(Outer.y);
		}
		
		}
	
	public void m2() {
		System.out.println("m2 method call ");
		Inner i =new Inner();
		i.m1();
	}
	
	
	public static void main(String[] args) {
		System.out.println("java");
		
		Outer o = new Outer();
		o.m2();
		
	}

	

}
