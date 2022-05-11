package dominio;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void CrearClub_AFA() {

		boolean resultadoEsperado = true;
		boolean resultadoObtenido;

		Afa afa = new Afa();
		Equipo river = new Equipo("river");

		resultadoObtenido = afa.agregarEquipo(river);

		assertEquals(resultadoEsperado, resultadoObtenido);

	}

	@org.junit.Test
	public void agregarJugadorAlClub() {

		boolean resultadoEsperado = true;
		boolean resultadoObtenido;

		Afa afa = new Afa();
		Equipo river = new Equipo("river");
		Jugador alfaro = new Jugador("alfaro", 32, 10.000);

		afa.agregarEquipo(river);

		resultadoObtenido = river.agregarJugador(alfaro);

		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@org.junit.Test
	public void calcularPrecioDelEquipo() {

		double resultadoEsperado = 50.000;
		double resultadoObtenido = 0.0;

		Afa afa = new Afa();
		Equipo river = new Equipo("river");
		Jugador alfaro = new Jugador("alfaro", 32, 10.000);
		Jugador gallardo = new Jugador("marcelo", 54, 30.000);
		Jugador pity = new Jugador("martinez", 25, 10.000);

		afa.agregarEquipo(river);
		river.agregarJugador(alfaro);
		river.agregarJugador(gallardo);
		river.agregarJugador(pity);

		resultadoObtenido = river.calcularValor();
		assertEquals(resultadoEsperado, resultadoObtenido, 0.001);

	}

	@org.junit.Test
	public void calcularLaEdadPromedioDelEquipo() {

		Integer resultadoEsperado = 37;
		Integer resultadoObtenido;

		Afa afa = new Afa();
		Equipo river = new Equipo("river");
		Jugador alfaro = new Jugador("alfaro", 32, 10.000);
		Jugador gallardo = new Jugador("marcelo", 54, 30.000);
		Jugador pity = new Jugador("martinez", 25, 10.000);

		afa.agregarEquipo(river);
		river.agregarJugador(alfaro);
		river.agregarJugador(gallardo);
		river.agregarJugador(pity);

		resultadoObtenido = river.calcularPorcentajeDeEdad();
		assertEquals(resultadoEsperado, resultadoObtenido);

	}

	@org.junit.Test
	public void queSePuedaJugarElPartido() {

		Boolean resultadoEsperado =true;
		Boolean resultadoObtenido;

		Afa afa = new Afa();
		Equipo river = new Equipo("river");
		Equipo voca = new Equipo("boca");
		
		Jugador alfaro = new Jugador("alfaro", 32, 10.000);
		Jugador gallardo = new Jugador("marcelo", 54, 30.000);
		Jugador pity = new Jugador("martinez", 25, 10.000);

		//afa.agregarEquipo(river);
		//afa.agregarEquipo(voca);
		
		
		river.agregarJugador(alfaro);
		river.agregarJugador(gallardo);
		river.agregarJugador(pity);
		
		
		resultadoObtenido = afa.jugarPartidoo(river, voca);
		
		assertEquals(resultadoEsperado, resultadoObtenido);

	}
	
	
	
}
