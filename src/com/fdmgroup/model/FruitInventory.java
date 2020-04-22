package com.fdmgroup.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FruitInventory {
	
	public static Fruit loadFruit(String name) {
	
			Properties pty = new Properties();
			Fruit fruit = null;
			try {
				pty.load(new FileInputStream("fruit.properties"));
			} catch (IOException e) {
				e.printStackTrace();
			}

			for (String key : pty.stringPropertyNames()) {
				if (key.equalsIgnoreCase(name)) {
					double price = Double.parseDouble(pty.getProperty(key)) ;
					fruit = new Fruit(key, price);
				}
			}

			return fruit;
	
	}
}
