package dominio;

public class Afa {

	private Equipo[] equipo;
	private Integer equiposMax;
	private boolean queEmpieze;

	public Afa() {
		this.equipo = new Equipo[25];
		this.equiposMax = 2;
	}

	public boolean agregarEquipo(Equipo nuevoTeam) {
		boolean retorno = false;

		for (int i = 0; i < equipo.length; i++) {
			if (equipo[i] == null) {
				equipo[i] = nuevoTeam;
				retorno = true;
				break;

			}
		}
		return retorno;
	}

	public Boolean jugarPartidoo(Equipo local, Equipo visitante) {
		boolean empiezaElPartido = false;

		for (int i = 0; i < equipo.length; i++) {
			if (equipo[i] != null) {
				if (local != null && visitante != null) {
					empiezaElPartido = true;
				}
			}

		}

		return empiezaElPartido;

	}

}
