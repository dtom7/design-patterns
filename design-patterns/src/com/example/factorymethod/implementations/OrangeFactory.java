package com.example.factorymethod.implementations;

import com.example.factorymethod.interfaces.Fruit;
import com.example.factorymethod.interfaces.Fruits;

public class OrangeFactory extends Fruits {

	@Override
	protected Fruit createFruit() {
		return new Orange();
	}

}
