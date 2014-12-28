package com.example.prototype.implementations;

import com.example.prototype.interfaces.Fruit;

public class FruitRegistry {

	private static final Fruit apple = new Apple();
	private static final Fruit orange = new Orange();

	public static final Fruit getInstance(String name) {
		switch (name) {
		case "apple":
			return (Apple) apple.clone();
		case "orange":
			return (Orange) orange.clone();
		default:
			return null;
		}
	}

}
