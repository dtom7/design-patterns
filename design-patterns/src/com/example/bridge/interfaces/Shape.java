package com.example.bridge.interfaces;

import com.example.bridge.implementations.PaperPainter;
import com.example.bridge.implementations.WallPainter;

public abstract class Shape {

	protected Painter painter;

	public Shape(String platform) {
		switch (platform) {
		case "paper":
			painter = new PaperPainter();
			break;
		case "wall":
			painter = new WallPainter();
			break;
		default:
			throw new IllegalArgumentException("Invalid argument: " + platform);
		}
	}
	
	public abstract void paint();

}
