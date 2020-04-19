
public class ExacpeionHandOne {

	public static void main(String[] args) {
	
		// without try block abnoraml
		
//	System.out.println("vishu");
//	System.out.println(10/0);
//	System.out.println("java");
//		
		// with try block  normal
		
		System.out.println("vishu");
		try {
			System.out.println(10/2);
			
		} catch (Exception e) {
			System.out.println(10/0);
		}
	
	System.out.println("java");
		

	}

}
