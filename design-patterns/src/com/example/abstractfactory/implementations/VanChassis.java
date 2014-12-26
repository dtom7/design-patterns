package com.example.abstractfactory.implementations;

import com.example.abstractfactory.interfaces.Chassis;

public class VanChassis implements Chassis {
	@Override
	public String getChassisParts() {
		return "Van chassis parts";
	}
}
