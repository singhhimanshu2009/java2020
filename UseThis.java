public class UseThis {
	
	private int roll;
	private String name;
	
	public UseThis(int roll,String name) {
		this.roll =roll;
		this.name =name;
	}
	
	public void display() {
		System.out.println(roll);
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		UseThis obj =new UseThis(3,"raja");
		obj.display();
	}

}