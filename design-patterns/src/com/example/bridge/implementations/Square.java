package com.example.bridge.implementations;

import com.example.bridge.interfaces.Shape;

public class Square extends Shape {

	public Square(String platform) {
		super(platform);
	}
	
	@Override
	public void paint() {
		System.out.println("Painting square ..");
		painter.paint(0, 0, 4, 0);
		painter.paint(4, 0, 4, 4);
		painter.paint(4, 4, 0, 4);
		painter.paint(0, 4, 0, 0);
	}

}
