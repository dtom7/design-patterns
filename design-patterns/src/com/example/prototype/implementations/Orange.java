package com.example.prototype.implementations;

import com.example.prototype.interfaces.Fruit;

public class Orange extends Fruit {

	@Override
	public String getName() {
		return "Orange";
	}

	@Override
	public int getCalories() {
		return 25;
	}

}
