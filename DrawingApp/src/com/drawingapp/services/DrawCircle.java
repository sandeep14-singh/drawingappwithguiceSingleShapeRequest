package com.drawingapp.services;
import static com.drawingapp.constants.Constants.CIRCLE;
import javax.inject.Inject;

import com.drawingapp.annotations.EdgeSize;
import com.drawingapp.annotations.SquareColorValue;

public class DrawCircle implements DrawShape {
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle !");		
	}

	@Override
	public String getShapeName() {
		return CIRCLE;
	}	

}
