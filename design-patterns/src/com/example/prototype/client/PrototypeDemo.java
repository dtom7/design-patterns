package com.example.prototype.client;

import com.example.prototype.implementations.FruitRegistry;
import com.example.prototype.interfaces.Fruit;

public class PrototypeDemo {

	public static void main(String[] args) {
		
		Fruit apple = FruitRegistry.getInstance("apple");
		Fruit orange = FruitRegistry.getInstance("orange");
		System.out.println("Name: " + apple.getName() + " -- Calories: "
				+ apple.getCalories());
		System.out.println("Name: " + orange.getName() + " -- Calories: "
				+ orange.getCalories());
	}

}
