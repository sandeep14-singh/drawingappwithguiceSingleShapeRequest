package com.drawingapp.requests;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import com.drawingapp.annotations.Square;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.Provider;

public class ShapeRequest {	
	
	Map<String, DrawShape> shapeNameVSDrawShape;
	
	@Inject
	public ShapeRequest(Set<DrawShape> set){
		shapeNameVSDrawShape = new HashMap<String, DrawShape>();
		for(DrawShape d : set){
			shapeNameVSDrawShape.put(d.getShapeName(), d);
		}
	}
	public void makeRequest(String ShapeName){
		DrawShape d = shapeNameVSDrawShape.get(ShapeName);
		d.draw();
	}		
}
