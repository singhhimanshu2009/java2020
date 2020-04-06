class Method{
	
	public void m1() {
		System.out.println("No arg method");
	}
	public void m1(int a) {
		System.out.println("one arg method");
	}
	
	public void m1(int a,int b) {
		System.out.println("two arg method");
	}
	
}



public class MehodOverloading {

	public static void main(String[] args) {
		
		Method obj =new Method();
		obj.m1();
		obj.m1(10);
		obj.m1(10,20);
		
	}

}
