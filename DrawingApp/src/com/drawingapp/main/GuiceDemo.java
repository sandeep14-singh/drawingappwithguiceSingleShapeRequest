package com.drawingapp.main;

import static com.drawingapp.constants.Constants.SQUARE;
import static com.drawingapp.constants.Constants.CIRCLE;
import com.drawingapp.module.AppModule;
import com.drawingapp.requests.ShapeRequest;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemo {
	
		
	private static void sendRequest(String sqaureReq) {
		
		Injector injector = Guice.createInjector(new AppModule());			
		ShapeRequest request = injector.getInstance(ShapeRequest.class);
		request.makeRequest(SQUARE);			
		
		
	}
	
	public static void main(String[] args) {		
		sendRequest(SQUARE);		
	}
}
