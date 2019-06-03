package com.drawingapp.services;

import static com.drawingapp.constants.Constants.SQUARE;
import javax.inject.Inject;

import com.drawingapp.annotations.EdgeSize;
import com.drawingapp.annotations.SquareColorValue;

public class DrawSquare implements DrawShape {
	
	@Override
	public void draw() {
		System.out.println("Drawing Square !");		
	}

	@Override
	public String getShapeName() {
		return SQUARE;
	}	

}
