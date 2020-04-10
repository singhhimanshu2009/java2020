class ParentOne{
	
	public Object m1(int x) {
		System.out.println("first method");
		return null;
		
	}
}
class childOne extends ParentOne {
	public String m1(int y ) {
			System.out.println("child class method");
			return "hello";
	}
}

public class MethodOverriding_Enhen_2 {
	
public static void main(String...aa) {
	
	ParentOne p1 =new childOne();
	p1.m1(10);
	
}
	
	

}
