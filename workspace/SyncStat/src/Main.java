
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread () {
			public void run ()
			{
				Table.printTable(5);
			}
		}.start();
		
		
		new Thread () {
			public void run ()
			{
				Table.printTable(10);
			}
		}.start();
		
		
	}

}
