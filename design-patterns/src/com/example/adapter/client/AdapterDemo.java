package com.example.adapter.client;

import com.example.adapter.implementations.FruitAdapter;
import com.example.adapter.implementations.NavalOrange;
import com.example.adapter.implementations.TropicalOrange;
import com.example.adapter.interfaces.Fruit;

public class AdapterDemo {

	public static void main(String[] args) {
		Fruit orange = new NavalOrange();
		process(orange);
		FruitAdapter fruitAdapter = new FruitAdapter(new TropicalOrange());
		process(fruitAdapter);
	}

	public static void process(Fruit fruit) {
		System.out.println("Processing: " + fruit.getName() + " -- "
				+ fruit.getCalories());
	}

}
