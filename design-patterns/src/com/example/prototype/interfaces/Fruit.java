package com.example.prototype.interfaces;

public abstract class Fruit implements Cloneable {
	public abstract String getName();
	public abstract int getCalories();
	@Override
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
