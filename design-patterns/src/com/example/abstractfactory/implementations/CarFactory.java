package com.example.abstractfactory.implementations;

import com.example.abstractfactory.interfaces.AbstractVehicleFactory;
import com.example.abstractfactory.interfaces.Body;
import com.example.abstractfactory.interfaces.Chassis;
import com.example.abstractfactory.interfaces.Window;

public class CarFactory implements AbstractVehicleFactory {

	@Override
	public Body createBody() {
		return new CarBody();
	}

	@Override
	public Chassis createChassis() {
		return new CarChassis();
	}

	@Override
	public Window createWindow() {
		return new CarWindow();
	}

}
