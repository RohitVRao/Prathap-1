package practice_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Read_Data_From_Proprty_File {

	public static void main(String[] args) throws Throwable {
		//step1 :get java representation object of physical file
		FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");
		
		//step2: create object for properties class
		Properties pobj = new Properties();
		
		//step3: load the keys
		pobj.load(fis);
		
		//step4:the value using getProperty
		String brows = pobj.getProperty("browser");
		String url = pobj.getProperty("url");
		String un = pobj.getProperty("username");
		String pwd = pobj.getProperty("password");
		
		System.out.println(brows);
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
	}
}
