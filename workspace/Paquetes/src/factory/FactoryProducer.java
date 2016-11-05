package factory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String f)
	{
	  if (f.equalsIgnoreCase("ShapeFactory")) {
		  return new ShapeFactory();
	  } else if (f.equalsIgnoreCase("ColorFactory"))
	  {
		  return new ColorFactory();
	  } else
		  return null;
	  
	}
}
