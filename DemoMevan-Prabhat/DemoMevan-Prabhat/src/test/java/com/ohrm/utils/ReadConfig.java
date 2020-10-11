package com.ohrm.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties prop; 
	
	public ReadConfig()
	{
		prop= new Properties();
		File f = new File("./Configuration/config.properties");
		FileInputStream fs;
		try {
			fs = new FileInputStream(f);
			prop.load(fs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getBrowser()
	{
		String browser=prop.getProperty("browser");
		return browser;
	}
	public String getURL()
	{
		String url=prop.getProperty("url");
		return url;
	}

}
