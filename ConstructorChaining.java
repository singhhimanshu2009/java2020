public class ConstructorChaining{
	
	private int roll;
	private String name;
	
	public ConstructorChaining() {
		this(1 ,"java",2);
		System.out.println("Default constructor is call");
	}
	
	public ConstructorChaining(int roll,String name) {
		this();
		this.roll =roll;
		this.name =name;
	}
	
	public ConstructorChaining(int roll,String name, int a) {
	
	System.out.println("3rd constructor is call");
		
	}
			
	public void display() {
		System.out.println(roll);
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		ConstructorChaining obj =new ConstructorChaining(1,"vishu");
		obj.display();
	}

}