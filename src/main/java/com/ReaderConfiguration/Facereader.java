package com.ReaderConfiguration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Facereader {
	Properties	p;
	
	public Facereader ( ) throws Exception {
		
		File f = new File("C:\\Users\\hp\\eclipse-workspace\\jay\\Facebook1\\src\\main\\java\\com\\propertyfiles\\Facebook.properties");
		
		FileInputStream fis = new FileInputStream (f);
		
		Properties	p = new Properties();
		
		p.load(fis);
		
	}
	public String geturl() {
		String str = p.getProperty("url");
		return str;
		
	}
	
	public String getemail() {
		
		String str = p.getProperty("email");
		return str;
		
		
	}
	
}
