package com.example.factorymethod.implementations;

import com.example.factorymethod.interfaces.Fruit;

public class Orange implements Fruit {

	@Override
	public String getName() {
		return "Orange";
	}

	@Override
	public int getCalories() {
		return 25;
	}

}
