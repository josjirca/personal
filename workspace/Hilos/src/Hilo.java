
public class Hilo extends Thread{

	public void run(int itipo)
	{
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Ejecutando un hilo: " + i);
			try {
				Thread.sleep(1000);	
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
		}
		
	}
}
