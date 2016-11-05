

public abstract class Shape implements Cloneable {
	abstract void draw();
	
	public Object clone()
	{
		Object clone = null;
		
		try {
			clone = super.clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return clone;
	}
}
