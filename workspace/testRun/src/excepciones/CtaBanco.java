package excepciones;


public class CtaBanco {

	private String nombre;
	private double fondos;
	
	public CtaBanco (String nombre, double fondos) {
		this.nombre = nombre;
		this.fondos = fondos;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getFondos() {
		return fondos;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setFondos(double fondos) {
		this.fondos = fondos;
	}
	
	public void retiro (double cantidad) //throws withdrawex
	{
	
		if (this.fondos < cantidad)
		{
			try {
				throw new withdrawex("Sin fondos suficientes");
			} catch (withdrawex e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else			
		{
			this.fondos = cantidad;
		}
		
	}
}
  

