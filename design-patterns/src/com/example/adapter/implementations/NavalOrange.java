package com.example.adapter.implementations;

import com.example.adapter.interfaces.Fruit;

public class NavalOrange implements Fruit {

	@Override
	public String getName() {
		return "Naval orange";
	}

	@Override
	public int getCalories() {
		return 10;
	}

}
