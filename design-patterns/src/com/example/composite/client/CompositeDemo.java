package com.example.composite.client;

import com.example.composite.implementations.Assembly;
import com.example.composite.implementations.Part;
import com.example.composite.interfaces.Item;

public class CompositeDemo {

	public static void main(String[] args) {
		Item hardDisk = new Part("HDD", 10.0);
		Item CPU = new Part("CPU", 50.0);
		Item circuitBoard = new Part("Circuit board", 30.0);
		Item mBoard = new Assembly("Motherboard");
		Item computer = new Assembly("Computer");
		mBoard.addItem(CPU);
		mBoard.addItem(circuitBoard);
		computer.addItem(hardDisk);
		computer.addItem(mBoard);
		System.out.println("Computer price: " + computer.getPrice());
	}

}
