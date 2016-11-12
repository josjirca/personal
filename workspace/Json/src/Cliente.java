import java.util.List;



public class Cliente {
	private String nombre;
	private int edad;
	private TipoCliente tipocliente;
	private List<Producto> productos;
	private String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public TipoCliente getTipocliente() {
		return tipocliente;
	}
	public void setTipocliente(TipoCliente tipocliente) {
		this.tipocliente = tipocliente;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	

	
	
}
