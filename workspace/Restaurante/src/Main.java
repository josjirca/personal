import java.util.ArrayList;
import java.util.List;

import casado.Casado;
import casado.CasadoBuilder;
import productos.CocaCola;
import productos.HamburgesaPollo;
import productos.HamburgesaSoya;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Casado oCasado = new Casado();
		oCasado.agregarItem(new CocaCola());
		oCasado.agregarItem(new HamburgesaSoya());
		System.out.println("=======DETALLE========");
		oCasado.mostrarproductos();		
		System.out.println("=======PRECIO FINAL========");
		System.out.println("Total: $" + oCasado.getCosto());		
		*/
		
		CasadoBuilder ocb = new CasadoBuilder();
		
		/*

		System.out.println("=======DETALLE========");
		oCasado1.mostrarproductos();		
		System.out.println("=======PRECIO FINAL========");
		System.out.println("Total: $" + oCasado1.getCosto());
		
		*/
		
		List<Casado> ol = new ArrayList<>();
		CocaCola cc = new CocaCola();
		HamburgesaPollo hp = new HamburgesaPollo();
		
		for (int i = 0; i < 1000000; i++) {			
			ol.add(ocb.ComboNormal(cc,hp));
		}
		
		float precioTotalFieston = 0f;
		
		for(Casado c : ol)
		{
			precioTotalFieston += c.getCosto();
		}
		
		System.out.println("Total: $" + precioTotalFieston);
				
	}

}
