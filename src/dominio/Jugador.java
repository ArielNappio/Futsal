package dominio;

public class Jugador {

	private String nombre;
	private Integer edad;
	private Double precio;

	public Jugador(String nombre, int edad, double precio) {
		this.nombre = nombre;
		this.edad = edad;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
