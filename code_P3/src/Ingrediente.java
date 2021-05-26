
public class Ingrediente {

	private String nombre;
	private int cantidad;
	private String unidadDeMedida;
	
	public Ingrediente(String nombre, int cantidad, String unidadDeMedida) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.unidadDeMedida = unidadDeMedida;
	}
	
	public Ingrediente() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getUnidadDeMedida() {
		return unidadDeMedida;
	}
	
	public void setUnidadDeMedida(String unidadDeMedida) {
		this.unidadDeMedida = unidadDeMedida;
	}
	
}
