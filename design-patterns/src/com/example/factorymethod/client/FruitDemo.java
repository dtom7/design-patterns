package com.example.factorymethod.client;

import com.example.factorymethod.interfaces.Fruit;
import com.example.factorymethod.interfaces.Fruits;
import com.example.factorymethod.interfaces.Fruits.FruitType;

public class FruitDemo {

	public static void main(String[] args) {
		Fruit apple = Fruits.getInstance(FruitType.APPLE);
		Fruit orange = Fruits.getInstance(FruitType.ORANGE);
		System.out.println("Name: " + apple.getName() + " -- Calories: "
				+ apple.getCalories());
		System.out.println("Name: " + orange.getName() + " -- Calories: "
				+ orange.getCalories());
	}

}
