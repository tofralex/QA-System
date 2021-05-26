import java.util.List;

public class Receta {

	private String nombre;
	
	private List<Ingrediente> ingredientes;
	
	private String nacionalidad;
	
	private String dificultad;
	
	private int minPreparacion;
	
	private String cantidadCalorias;
	
	private boolean esVegetariano;
	
	private List<String> herramientasDeCocina;
	
	private List<String> tipoDePreparacion;
	
	private List<String> instruccionesDeElaboracion;
	
	private int numeroDePersonas;

	
	public Receta(String nombre, List<Ingrediente> ingredientes, String nacionalidad, 
			String dificultad, int minPreparacion, String cantidadCalorias, boolean esVegetariano, 
			List<String> herramientasDeCocina, List<String> tipoDePreparacion, 
			List<String> instruccionesDeElaboracion, int numeroDePersonas) {
		
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.nacionalidad = nacionalidad;
		this.dificultad = dificultad;
		this.minPreparacion = minPreparacion;
		this.cantidadCalorias = cantidadCalorias;
		this.esVegetariano = esVegetariano;
		this.herramientasDeCocina = herramientasDeCocina;
		this.tipoDePreparacion = tipoDePreparacion;
		this.instruccionesDeElaboracion = instruccionesDeElaboracion;
		this.numeroDePersonas = numeroDePersonas;
	}
	
	public Receta() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public int getMinPreparacion() {
		return minPreparacion;
	}

	public void setMinPreparacion(int minPreparacion) {
		this.minPreparacion = minPreparacion;
	}

	public String getCantidadCalorias() {
		return cantidadCalorias;
	}

	public void setCantidadCalorias(String cantidadCalorias) {
		this.cantidadCalorias = cantidadCalorias;
	}

	public boolean isEsVegetariano() {
		return esVegetariano;
	}

	public void setEsVegetariano(boolean esVegetariano) {
		this.esVegetariano = esVegetariano;
	}

	public List<String> getHerramientasDeCocina() {
		return herramientasDeCocina;
	}

	public void setHerramientasDeCocina(List<String> herramientasDeCocina) {
		this.herramientasDeCocina = herramientasDeCocina;
	}

	public List<String> getTipoDePreparacion() {
		return tipoDePreparacion;
	}

	public void setTipoDePreparacion(List<String> tipoDePreparacion) {
		this.tipoDePreparacion = tipoDePreparacion;
	}

	public List<String> getInstruccionesDeElaboracion() {
		return instruccionesDeElaboracion;
	}

	public void setInstruccionesDeElaboracion(List<String> instruccionesDeElaboracion) {
		this.instruccionesDeElaboracion = instruccionesDeElaboracion;
	}

	public int getNumeroDePersonas() {
		return numeroDePersonas;
	}

	public void setNumeroDePersonas(int numeroDePersonas) {
		this.numeroDePersonas = numeroDePersonas;
	}
	
	
}
