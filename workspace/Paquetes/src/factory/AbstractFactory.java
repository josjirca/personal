package factory;

import color.factory.Color;
import shape.factory.Shape;

public abstract class AbstractFactory {

		public abstract Color getColor(String color);
		
		public abstract Shape getShape(String shape); 
}
