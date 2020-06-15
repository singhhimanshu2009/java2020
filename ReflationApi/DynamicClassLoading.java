package ReflationApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicClassLoading {

	public static void main(String[] args) throws Exception {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter class name");
		
		String str  =sc.nextLine();
		
		
	if(str.isEmpty()) {
		throw new RuntimeException("Dynamic class Not found");
	}else {
		Class c = Class.forName(str);
		Field fil []=c.getDeclaredFields();
		System.out.println("==============================All Filelds======================================");
		for(Field f1 :fil) {
			System.out.println(f1);
		}
		
		Constructor [] cons =c.getDeclaredConstructors();
		System.out.println("============================All Constructor====================================");
		for(Constructor con :cons) {
			System.out.println(con);
		}
		
		Method [] mot =c.getDeclaredMethods();
		System.out.println("=====================All Methods==============================================");
		for(Method mots :mot) {
			System.out.println(mots);
		}
	}

	}

}
