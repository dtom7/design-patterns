package com.example.abstractfactory.implementations;

import com.example.abstractfactory.interfaces.Chassis;

public class CarChassis implements Chassis {
	@Override
	public String getChassisParts() {
		return "Car chassis parts";
	}
}
