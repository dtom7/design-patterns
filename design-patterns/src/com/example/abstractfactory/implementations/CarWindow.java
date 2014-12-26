package com.example.abstractfactory.implementations;

import com.example.abstractfactory.interfaces.Window;

public class CarWindow implements Window {
	@Override
	public String getWindowParts() {
		return "Car window parts";
	}
}
