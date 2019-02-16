package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AUL implements IAutoConst {

	public static String getProperties(String key) {
		Properties p = new Properties();
		try {
			p.load(new FileInputStream(PROPERTIES_PATH));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = p.getProperty(key);
		return value;
	}
	
	
	
	

}
