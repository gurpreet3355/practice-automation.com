package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	 private static Properties p;

	    static {
	        try {
	            FileInputStream fis = new FileInputStream("C:\\Users\\acer\\eclipse-workspace\\practice-automation.com\\src\\test\\java\\utils\\Config.properties");
	            p = new Properties();
	            p.load(fis);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static String get(String key) {
	        return p.getProperty(key);
	    }
	

}
