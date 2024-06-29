package com.nt.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comp.Courier;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
	private static Properties props;
	static {
		try {
			// locate properties file
			InputStream is = new FileInputStream("src/com/nt/commons/inputs.properties");
			// load properties file content into java.util.Properties class obj
			props = new Properties();
			props.load(is);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	// static factory method having factory pattern logic
	public static Flipkart getInstance() {
		try {
			// get dependent class name(courier name) from properties
			// file(java.util.Properties class obj)
			String courierClassName = props.getProperty("courier.type");
			// load dependent class
			Class c = Class.forName(courierClassName);
			// create dependent class object
			// Courier courier = (Courier) c.newInstance(); // deprecated from java9
			Constructor cons[] = c.getDeclaredConstructors();
			Courier courier = (Courier) cons[0].newInstance();
			// create Target class obj
			Flipkart fpkt = new Flipkart();
			// assign Dependent class obj to target class obj
			fpkt.setCourier(courier);
			return fpkt;
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
			return null;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
