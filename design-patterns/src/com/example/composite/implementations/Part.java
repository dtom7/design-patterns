package com.example.composite.implementations;

import java.util.List;

import com.example.composite.interfaces.Item;

public class Part extends Item {

	public Part(String description, double price) {
		super(description, price);
	}

	@Override
	public void addItem(Item item) {
		throw new UnsupportedOperationException("this operation is not supported");
	}

	@Override
	public void removeItem(Item item) {
		throw new UnsupportedOperationException("this operation is not supported");
	}

	@Override
	public List<Item> getItems() {
		return null;
	}

}
