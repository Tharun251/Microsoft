package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This Class contains re-usuable methods to initialize and read data from
 * properties file
 * 
 * @author admin
 */
public class PropertiesUtility {
	private Properties property;

	/**
	 * This method is used to initialize properties file
	 * 
	 * @param filepath
	 */
	public void properties(String filepath) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		property = new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	/**
	 * This method fetches data from properties file based on the key passed by the
	 * user as an argument
	 * 
	 * @param key
	 * @return
	 */
	public String readFromProperties(String key) {
		return property.getProperty(key);
	}
}
