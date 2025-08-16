package com.maegen.generic.fileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String getDataFromPropertiesFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream(".\\configAppData\\commondata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String DATA=pobj.getProperty(key);
		return DATA;
	}
	
}

