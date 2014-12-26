package com.example.abstractfactory.client;

import com.example.abstractfactory.implementations.CarFactory;
import com.example.abstractfactory.implementations.VanFactory;
import com.example.abstractfactory.interfaces.AbstractVehicleFactory;

public class VehicleDemo {

	public static void main(String[] args) {
		String vehicle = "car";
		AbstractVehicleFactory factory;
		if (vehicle.equals("car")) {
			factory = new CarFactory();
		} else {
			factory = new VanFactory();
		}
		System.out.println(factory.createBody().getBodyParts());
		System.out.println(factory.createChassis().getChassisParts());
		System.out.println(factory.createWindow().getWindowParts());
	}

}
