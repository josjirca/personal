
public class SingleObject {
	
	private static SingleObject instancia = new SingleObject();

	public static SingleObject getInstance()
	{
		return instancia;
	}
	
	
	public void mostrarmsg(String m)
	{
		System.out.println("Single --> " + m);
	}
}
