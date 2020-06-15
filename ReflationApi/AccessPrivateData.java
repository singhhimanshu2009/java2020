package ReflationApi;

import java.lang.reflect.Method;
import java.util.Scanner;

public class AccessPrivateData {

	public static void main(String[] args) throws Exception {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter class name");
		String str  =sc.nextLine();
		Class c = Class.forName(str);
		Method m =c.getDeclaredMethod("message", null);
		m.setAccessible(true);
		Object obj =c.newInstance();
		m.invoke(obj, null);
	}

}

