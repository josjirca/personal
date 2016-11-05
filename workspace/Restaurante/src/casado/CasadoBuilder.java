package casado;

import productos.*;

public class CasadoBuilder {

	public Casado ComboVegetariano()
	{
		Casado casado = new Casado();
		casado.agregarItem(new Pepsi());
		casado.agregarItem(new HamburgesaSoya());
		return casado;
	}
	
	public Casado ComboNormal(CocaCola cc, HamburgesaPollo hp)
	{
		Casado casado = new Casado();
		casado.agregarItem(cc);
		casado.agregarItem(hp);
		return casado;
	}
	
}
