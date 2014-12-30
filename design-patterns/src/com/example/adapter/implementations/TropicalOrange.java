package com.example.adapter.implementations;

import com.example.adapter.interfaces.TropicalFruit;

public class TropicalOrange implements TropicalFruit {

	@Override
	public String getFruitName() {
		return "Tropical Orange";
	}

	@Override
	public int getCalorieCount() {
		return 15;
	}

}
