
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c = new Cliente();
		
		/*new Thread()
		{
			@Override
			public void run(){
				c.retiro(1000);
			}
		}.start();
		
		new Thread()
		{
			@Override
			public void run(){
				c.deposito(800);
			}
		}.start();
		
		new Thread()
		{
			@Override
			public void run(){
				c.retiro(1000);
			}
		}.start();
		
		
		new Thread()
		{
			@Override
			public void run(){
				c.deposito(200);
			}
		}.start();*/
		
		
		Contador c1 = new Contador();
		c1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

}
