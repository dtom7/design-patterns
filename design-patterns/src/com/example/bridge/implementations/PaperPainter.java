package com.example.bridge.implementations;

import com.example.bridge.interfaces.Painter;

public class PaperPainter implements Painter {

	@Override
	public void paint(int x1, int y1, int x2, int y2) {
		System.out.println("Painting on paper ..");
	}

}
