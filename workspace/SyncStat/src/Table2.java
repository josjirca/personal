
public class Table2 {

	public void printTable (int n)
	{
		
		synchronized(this)
		{
		for (int i = 0; i < 10; i++) {
			System.out.println(n*i);
			
			try {
				Thread.sleep(500);	
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}		
			
		}
		}
	}
}
