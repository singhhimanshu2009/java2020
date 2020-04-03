public class MethodChaining {
	
	public MethodChaining m1() {
		System.out.println("m1 method");
		return this;
	}
	
	public MethodChaining m2() {
		System.out.println("m2 method");
		return this;
	}

	public void m3() {
		System.out.println("m3 method");
	}


	public static void main(String[] args) {
		
		new MethodChaining().m1().m2().m3();
		
	}

}