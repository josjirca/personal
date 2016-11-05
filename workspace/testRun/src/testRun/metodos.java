package testRun;

public class metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona oPersona = new Persona(25, 1);
				
		System.out.println(oPersona.getEdad());
		System.out.println(oPersona.getGenero());
	}
	
	
	
public static class Persona
{
	private int edad;
	private int genero;
	
	public Persona (int iEdad, int iGenero)
	{
		this.setEdad(iEdad);
		this.setGenero(iGenero);
	}

	int getGenero() {
		return genero;
	}

	void setGenero(int genero) {
		this.genero = genero;
	}

	int getEdad() {
		return edad;
	}

	void setEdad(int edad) {
		this.edad = edad;
	}
	
		
}

}
