
public class Producto {
		private String Nombre;
		private Tipo tipo;
		private Estado estado;
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String nombre) {
			Nombre = nombre;
		}
		public Tipo getTipo() {
			return tipo;
		}
		public void setTipo(Tipo tipo) {
			this.tipo = tipo;
		}
		public Estado getEstado() {
			return estado;
		}
		public void setEstado(Estado estado) {
			this.estado = estado;
		}
}
