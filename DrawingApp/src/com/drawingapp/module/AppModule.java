package com.drawingapp.module;

import com.drawingapp.annotations.Circle;
import com.drawingapp.annotations.CircleColorValue;
import com.drawingapp.annotations.SquareColorValue;
import com.drawingapp.annotations.EdgeSize;
import com.drawingapp.annotations.Radius;
import com.drawingapp.annotations.Square;
import com.drawingapp.services.DrawCircle;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Scopes;
import com.google.inject.Singleton;
import com.google.inject.multibindings.Multibinder;


public class AppModule extends AbstractModule{
	
	@Override
	protected void configure() {				
		Multibinder<DrawShape> drawShapebinder = Multibinder.newSetBinder(binder(), DrawShape.class);
		drawShapebinder.addBinding().to(DrawSquare.class);
		drawShapebinder.addBinding().to(DrawCircle.class);
	}
}
