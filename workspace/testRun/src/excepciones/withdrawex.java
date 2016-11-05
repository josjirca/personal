package excepciones;

public class withdrawex extends Exception {

	
	
	private static final long serialVersionUID = 1;
	
	public withdrawex ()
	{
		super();
	}
	
	public withdrawex (String mensaje)
	{
		super(mensaje);
	}
}
