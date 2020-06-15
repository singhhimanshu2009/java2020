package InnerClass;

class Popcon{
	
	public void test() {
		System.out.println("salty");
	}
}
public class AnonymousDemo {

	public static void main(String[] args) {
		
		Popcon p1 = new Popcon()
		{
			public void test() {
				System.out.println("spicy");
			}
		};
		
		p1.test();
	}

}
