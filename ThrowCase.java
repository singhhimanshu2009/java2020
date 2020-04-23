
public class ThrowCase extends RuntimeException{

	// case 1
//	
//	static ArithmeticException e =new ArithmeticException();
//	public static void main(String[] args) {
//	
//		throw e;
//	}
	
//	static ArithmeticException e ;
//	public static void main(String[] args) {
//	
//		throw e;
//	}
	
	
	/**
	 * Case 2
	 * */

//	public static void main(String[] args) {
//	
//		System.out.println(10/0);
//		System.out.println("hello");
//		
//	}
	
//	public static void main(String[] args) {
//		
//		throw new ArithmeticException("/by zero");
//		System.out.println("hello");
//		
//	}
	
	
	/**
	 * Case 3
	 * */
	
//	public static void main(String[] args) {
//		
//		throw new Test();
//	}
	
	
public static void main(String[] args) {
		
		throw new ThrowCase();
	}

	
}