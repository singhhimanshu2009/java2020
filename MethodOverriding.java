class Parent{
	
	
	public void merrige() {
		
		System.out.println("merrige with katrina");
	}
	
}
class Child extends Parent{

	public void merrige() {
		
		System.out.println("merrige with java");
	}
	
}



public class MethodOverriding {

	public static void main(String[] args) {
		
		Parent p1 = new Child();
		p1.merrige();
		
	}

}
