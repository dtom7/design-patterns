package com.example.factorymethod.implementations;

import com.example.factorymethod.interfaces.Fruit;

public class Apple implements Fruit {

	@Override
	public String getName() {
		return "Apple";
	}

	@Override
	public int getCalories() {
		return 20;
	}

}
