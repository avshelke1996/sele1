package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import ltim.practise2.BaseTest;

public class ReadProp extends BaseTest {
	
	public static String propertyReader(String attribute) throws IOException {
		File f = new File("H:\\wp2\\practise2\\config.properties");
		FileInputStream fis = new FileInputStream(f);
		prop.load(fis);
		String value = prop.getProperty(attribute);
		return value;
	}

}
