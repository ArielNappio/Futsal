package dominio;

public class Equipo {

	private String nombre;
	private Jugador[] jugador;
	private int jugadoresmax = 5;

	public Equipo(String nombre) {
		this.nombre = nombre;
		this.jugador = new Jugador[5];
		this.jugadoresmax = 5;
	}

	public boolean agregarJugador(Jugador nuevoJugador) {

		boolean retorno = false;
		for (int i = 0; i < jugador.length; i++) {
			if (jugador[i] == null && jugadoresmax <= 5) {
				jugador[i] = nuevoJugador;
				retorno = true;
				break;

			}
		}

		return retorno;
	}

	public Double calcularValor() {
		double variable = 0.0;

		for (int i = 0; i < jugador.length; i++) {
			if (jugador[i] != null) {
				variable += jugador[i].getPrecio();
			}
		}
		return variable;

	}

	public Integer calcularPorcentajeDeEdad() {
		Integer valorTotalDeEdades = 0;
		Integer edadesLongitud = 0;
		Integer porcentajeDeEdades = 0;

		for (int i = 0; i < jugador.length; i++) {
			if (jugador[i] != null) {
				valorTotalDeEdades += jugador[i].getEdad();
				edadesLongitud++;
				porcentajeDeEdades = valorTotalDeEdades / edadesLongitud;
			}
		}
		return porcentajeDeEdades;
	}

	

}
