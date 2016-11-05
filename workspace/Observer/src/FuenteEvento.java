import java.util.Observable;
import java.util.Scanner;

public class FuenteEvento extends Observable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true)
		{
			String respuesta = new Scanner(System.in).next();
			setChanged();
			notifyObservers(respuesta);
		}
		
	}

}
