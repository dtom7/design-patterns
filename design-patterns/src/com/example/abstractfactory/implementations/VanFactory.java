package com.example.abstractfactory.implementations;

import com.example.abstractfactory.interfaces.AbstractVehicleFactory;
import com.example.abstractfactory.interfaces.Body;
import com.example.abstractfactory.interfaces.Chassis;
import com.example.abstractfactory.interfaces.Window;

public class VanFactory implements AbstractVehicleFactory {

	@Override
	public Body createBody() {
		return new VanBody();
	}

	@Override
	public Chassis createChassis() {
		return new VanChassis();
	}

	@Override
	public Window createWindow() {
		return new VanWindow();
	}

}
