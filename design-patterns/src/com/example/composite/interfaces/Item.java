package com.example.composite.interfaces;

import java.util.List;

public abstract class Item {
	
	private String description;
	private double price;
	
	public Item(String description, double price) {
		super();
		this.description = description;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract void addItem(Item item);
	public abstract void removeItem(Item item);
	public abstract List<Item> getItems(); 

}
