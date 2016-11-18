package com.rikki.props;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws IOException {
		//see things inside the application's classpath
		//in eclipse the classpath is in the source folders
		ClassLoader loader = PropertiesExample.class.getClassLoader();
		//use classLoader to load a resource from classpath
		InputStream inStream = loader.getResourceAsStream("info.properties");
		
		//loading properties from the file
		Properties props = new Properties();
		props.load(inStream);
		
		String value = props.getProperty("url");
		System.out.println(value);
	}
	
}
