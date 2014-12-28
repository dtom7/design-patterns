package com.example.prototype.implementations;

import com.example.prototype.interfaces.Fruit;

public class Apple extends Fruit {

	@Override
	public String getName() {
		return "Apple";
	}

	@Override
	public int getCalories() {
		return 20;
	}

}
