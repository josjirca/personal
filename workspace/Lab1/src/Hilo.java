
public class Hilo extends Thread{

	private String tipo;
	
	
	
	public void setTipo(String string) {
		this.tipo = string;
	}
	
	
	public void run()
	{
		if (tipo.equals("1"))
		{
			String s = "";
			for (int i = 0; i <10000; i++) {
				s = s + "A";				
			}
						
			System.out.println(s);
			
		} else
		{
			for (int i = 0; i <10000; i++) {				
				System.out.println(i);			
			}
		}
		
				
	}
}
