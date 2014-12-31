package com.example.bridge.implementations;

import com.example.bridge.interfaces.Shape;

public class Triangle extends Shape {

	public Triangle(String platform) {
		super(platform);
	}
	
	@Override
	public void paint() {
		System.out.println("Painting triangle ..");
		painter.paint(0, 0, 4, 0);
		painter.paint(4, 0, 2, 4);
		painter.paint(2, 4, 0, 0);
	}

}
