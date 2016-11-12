
public class Cliente {
	
	float balance = 100;
	
	synchronized void deposito (float amount)
	{
		System.out.println("Iniciando deposito..");
		this.balance += amount;
		System.out.println("Deposito completo..");
		System.out.println("Balance.. $" + this.balance);
		notifyAll();
		
	}

	synchronized void retiro (float amount)
	{
		System.out.println("Iniciando retiro..");
		
		do
		{
			//if(this.balance < amount)
			//{
				System.out.println("No tiene suficientes fondos, esperando deposito..");
				try {
					wait();				
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			//}
		} while (this.balance < amount);
		
		this.balance -= amount;
		System.out.println("Retiro completo, nuevo saldo: $" + this.balance);
	}
}
