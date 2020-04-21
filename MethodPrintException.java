
public class MethodPrintException {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(10/0);
			
		} catch (Exception e) {
			System.out.println("1st method");
			e.printStackTrace();
			System.out.println("2nd mehod");
			System.out.println(e.toString());
			System.out.println("3rd mehod");
			System.out.println(e.getMessage());
			
		}
	 
		
	}
	
	

}
