
public class MultiCatchBlock {

	public static void main(String[] args) {
		
		try {
			//System.out.println(10/0);
			
			String s1=null;
			System.out.println(s1.length());
		}		
		catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		}

	}

}
