package demodevice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigure {
	
	Properties prop;
	String path = "C:\\Users\\somisetty_veena\\eclipse-workspace\\demoproject\\src\\test\\java\\demodevice\\configure.properties";
	
	public ReadConfigure() {
		
		
		try {
			
			FileInputStream input = new FileInputStream(path);
			prop = new Properties();
			try {
				prop.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getURL() {
		String url = prop.getProperty("url");
		if(url!=null) {
			return url;
		}
		else {
			throw new RuntimeException("url not specified");
		}
	}
	
	public String getUsername() {
		String username = prop.getProperty("username");
		if(username!=null) {
			return username;
		}
		else {
			throw new RuntimeException("username not specified");
		}
	}
	
		
	public String getPassword() {
		String password = prop.getProperty("password");
		if(password!=null) {
			return password;
		}
		else {
			throw new RuntimeException("password not specified");
		}
	}

}
