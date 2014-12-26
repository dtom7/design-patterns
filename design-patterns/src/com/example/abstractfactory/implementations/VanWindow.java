package com.example.abstractfactory.implementations;

import com.example.abstractfactory.interfaces.Window;

public class VanWindow implements Window {
	@Override
	public String getWindowParts() {
		return "Van window parts";
	}
}
