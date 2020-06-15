package Map;

import java.io.FileInputStream;   
											
											
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		
		Properties p1 =new Properties();
		
		FileInputStream fis =new FileInputStream("/Java8/abc.Properties");
		
		p1.load(fis);
		System.out.println(p1);
	
	}
}
