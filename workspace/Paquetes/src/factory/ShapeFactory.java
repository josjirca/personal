package factory;

import color.factory.Color;
import shape.factory.Shape;
import shape.factory.Square;
import shape.factory.Cicrle;
import shape.factory.Rectangle;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		
		if (shape.equalsIgnoreCase("cuadrado"))
		{
			return new Square();
		} else if (shape.equalsIgnoreCase("circulo"))
		{
			return new Cicrle();
		} else if (shape.equalsIgnoreCase("rectangulo"))
		{
			return new Rectangle();
		}
		
		return null;
	}

}
