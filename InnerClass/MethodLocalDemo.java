package InnerClass;

public class MethodLocalDemo {
	
	public void m1() {
		class Inner{
			
			public void sum(int x, int y) {
				System.out.println(x+y);
			}
			
		}
		Inner i =new Inner();
		i.sum(10, 20);
		i.sum(30, 40);
		i.sum(400,700);
	}

	public static void main(String[] args) {
		MethodLocalDemo obj =new MethodLocalDemo();
		obj.m1();


	}

}
