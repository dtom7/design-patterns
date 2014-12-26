package com.example.factorymethod.interfaces;

import com.example.factorymethod.implementations.AppleFactory;
import com.example.factorymethod.implementations.OrangeFactory;

public abstract class Fruits {

	public enum FruitType {
		ORANGE, APPLE;
	}

	public static Fruit getInstance(FruitType fruitType) {
		switch (fruitType) {
		case ORANGE: {
			Fruits fruitFactory = new OrangeFactory();
			return fruitFactory.createFruit();
		}
		case APPLE: {
			Fruits fruitFactory = new AppleFactory();
			return fruitFactory.createFruit();
		}
		default: {
			return null;
		}
		}
	}

	protected abstract Fruit createFruit();

}
