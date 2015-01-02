package com.example.composite.implementations;

import java.util.ArrayList;
import java.util.List;

import com.example.composite.interfaces.Item;

public class Assembly extends Item {
	
	private List<Item> itemList = new ArrayList<Item>();

	public Assembly(String description) {
		super(description, 0);
	}

	@Override
	public void addItem(Item item) {
		this.itemList.add(item);
	}

	@Override
	public void removeItem(Item item) {
		this.itemList.remove(item);

	}

	@Override
	public List<Item> getItems() {
		return this.itemList;
	}
	
	@Override
	public double getPrice() {
		double price = 0.0;
		for(Item item:this.itemList) {
			price += item.getPrice();
		}
		return price;
	}

}
