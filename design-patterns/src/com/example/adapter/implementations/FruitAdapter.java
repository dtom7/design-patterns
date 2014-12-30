package com.example.adapter.implementations;

import com.example.adapter.interfaces.Fruit;
import com.example.adapter.interfaces.TropicalFruit;

public class FruitAdapter implements Fruit {
	
	private TropicalFruit tropicalFruit;
	
	public FruitAdapter(TropicalFruit tropicalFruit) {
		this.tropicalFruit = tropicalFruit;
	}

	@Override
	public String getName() {
		return this.tropicalFruit.getFruitName();
	}

	@Override
	public int getCalories() {
		return this.tropicalFruit.getCalorieCount();
	}

}
