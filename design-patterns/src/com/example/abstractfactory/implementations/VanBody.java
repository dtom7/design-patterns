package com.example.abstractfactory.implementations;

import com.example.abstractfactory.interfaces.Body;

public class VanBody implements Body {
	@Override
	public String getBodyParts() {
		return "Van body parts";
	}
}
