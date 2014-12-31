package com.example.bridge.client;

import com.example.bridge.implementations.Square;
import com.example.bridge.implementations.Triangle;
import com.example.bridge.interfaces.Shape;

public class BridgeDemo {

	public static void main(String[] args) {
		Shape SquareOnPaper = new Square("paper");
		Shape SquareOnWall = new Square("wall");
		Shape TriangleOnPaper = new Triangle("paper");
		Shape TriangleOnWall = new Triangle("wall");
		SquareOnPaper.paint();
		SquareOnWall.paint();
		TriangleOnPaper.paint();
		TriangleOnWall.paint();
	}

}
