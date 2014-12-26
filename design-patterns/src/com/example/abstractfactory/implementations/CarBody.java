package com.example.abstractfactory.implementations;

import com.example.abstractfactory.interfaces.Body;

public class CarBody implements Body {
	@Override
	public String getBodyParts() {
		return "Car body parts";
	}
}
