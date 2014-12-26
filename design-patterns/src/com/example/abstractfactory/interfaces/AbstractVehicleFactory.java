package com.example.abstractfactory.interfaces;

public interface AbstractVehicleFactory {
	public Body createBody();
	public Chassis createChassis();
	public Window createWindow();
}
