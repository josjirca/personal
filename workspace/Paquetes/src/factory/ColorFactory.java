package factory;

import color.factory.Blue;
import color.factory.Color;
import color.factory.Green;
import color.factory.Red;
import shape.factory.Cicrle;
import shape.factory.Rectangle;
import shape.factory.Shape;
import shape.factory.Square;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		
				
		if (color.equalsIgnoreCase("rojo"))
		{
			return new Red();
		} else if (color.equalsIgnoreCase("verde"))
		{
			return new Green();
		} else if (color.equalsIgnoreCase("azul"))
		{
			return new Blue();
		}
		
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}


}
