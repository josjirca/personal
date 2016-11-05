package casado;

import java.util.ArrayList;
import java.util.List;

import base.items.Item;

public class Casado {

	private List<Item> items = new ArrayList<Item>();
	
	public void agregarItem(Item valor)
	{
		items.add(valor);
	}
	
	public float getCosto()
	{
		float oCosto = 0;
		
		for (Item items : items) {
			oCosto = oCosto + items.precio();
		}
		
		return oCosto;
	}
	
	public void mostrarproductos()
	{
		for (Item items : items) {
			System.out.println(items.nombre());
		}
	}
	
}
