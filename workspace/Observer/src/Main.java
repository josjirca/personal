import java.util.Observable;
import java.util.Observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introducir texto:");
		FuenteEvento fuentevento = new FuenteEvento();
		
		fuentevento.addObserver( new Observer() {			
			
			@Override
			public void update (Observable o, Object arg)
			{
				System.out.println("\nRespuesta recibida: "+arg);
			}
		} );

		new Thread(fuentevento).start();
	}

}
