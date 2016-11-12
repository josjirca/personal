
public class Table {

	synchronized static void printTable (int n)
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
