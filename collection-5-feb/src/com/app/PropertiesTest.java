package com.app;

import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {

		Properties properties = new Properties();
		properties.setProperty("A", "123");
		properties.put(1, 1);

		System.out.println(properties);
		System.out.println(properties.getProperty("A"));

	}

}
