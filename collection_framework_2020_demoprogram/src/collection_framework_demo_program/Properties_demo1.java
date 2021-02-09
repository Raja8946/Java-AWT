package collection_framework_demo_program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties p= new Properties();
		FileInputStream fis= new FileInputStream("ab.properties");
		p.load(fis);
		System.out.println(p);
		String string = p.getProperty("Venki");
		System.out.println(string);
		p.setProperty("Raj", "1234");
		FileOutputStream fos= new FileOutputStream("ab.properties");
		p.store(fos, "Updated by Raj Sonam");

	}

}
