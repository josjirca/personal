import java.util.ArrayList;

import com.google.gson.Gson;


public class Main {

	public static void main(String[] args)
	{
			Gson gson = new Gson();
			
			Cliente cliente = new Cliente();
			cliente.setNombre("Cliene 1");
			cliente.setTipocliente(TipoCliente.Empresarial);
			ArrayList<Producto> ol = new ArrayList();
			Producto op = new Producto();
			op.setNombre("Cuenta Corriente");
			op.setEstado(Estado.ACTIVO);
			op.setTipo(Tipo.CORRIENTE);
			ol.add(op);			
			Producto op1 = new Producto();
			op1.setNombre("Cuenta Ahorro");
			op1.setEstado(Estado.INACTIVO);
			op1.setTipo(Tipo.AHORRO);
			ol.add(op1);
			cliente.setProductos(ol);
			
			String clientejson = gson.toJson(cliente);
			
			System.out.println(clientejson);
	}
	
}
