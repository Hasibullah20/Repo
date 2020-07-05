package base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.core.config.Loggers;
import org.openqa.selenium.WebDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties properties;
	public static Loggers Logger;
	private String userDir = System.getProperty("user.dir");
	private String pathToProperty ="\\src\\test\\resources\\inputData\\Property.properties";
	private String ppfile = userDir+pathToProperty;
	
	
	
	// create a constructor method for base class
	public Base () {
		
		try {
		// read the text by character from property file
		BufferedReader reader;
		reader = new BufferedReader(new FileReader(ppfile));
		properties = new Properties();
		try {
		properties.load(reader);
		reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static String getBrowserName() {
		String browserName = properties.getProperty("browser");
		return browserName;
		
	}
	
	public static String getURL() {
		String url = properties.getProperty("url");
		return url;
	}
	
	public static long getPageLoad () {
		String pageload = properties.getProperty("pageload");
		return Long.parseLong(pageload);
	}
	
	public static long getImplicitWait() {
		String implicitWait = properties.getProperty("implicitWait");
		return Long.parseLong(implicitWait);
		
	}
	public static void initialize () {
		driver.get(getURL());
	}
	public static void tearDown() {
		driver.quit();
		
	}

}
