package main;

import color.factory.Color;
import factory.AbstractFactory;
import factory.FactoryProducer;
import shape.factory.Shape;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractFactory shapeFactory = FactoryProducer.getFactory("ShapeFactory");
		
		AbstractFactory ColorFactory = FactoryProducer.getFactory("ColorFactory");
		
		Shape circleShape = shapeFactory.getShape("circulo");
		
		Color greenColor =  ColorFactory.getColor("verde");
		
		circleShape.draw();
		greenColor.fill();
	}

}
