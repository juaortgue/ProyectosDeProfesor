package controller;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

import logic.LogEstilo;
import model.Estilo;
import model.TextosApp;
import utils.Teclado;

public class ControllerEstilo {

	/*
	 * 
	 * ESTE MÉTODO TE LISTA LOS ESTILOS
	 * 
	 **/

	public static List<Estilo> listar(boolean ordenar) {
		List<Estilo> ls = null;
		try {
			ls = LogEstilo.listaEstilos();
		} catch (SQLException e) {

			System.err.println(TextosApp.ERRORLISTA);
		}
		if (ordenar)
			ls.sort(Comparator.reverseOrder());
		if (ls.size() > 0) {
			for (Estilo m : ls) {
				System.out.println(m);

			}
		} else {
			System.out.println(TextosApp.NOHAYESTILOS);
		}
		return ls;
	}

	/*
	 * 
	 * ESTE MÉTODO TE BORRAR LOS ESTILOS
	 * 
	 **/

	public static void borrar() {
		try {
			if (LogEstilo.totalEstilos() > 0) {
				System.out.println(TextosApp.ELEMENTOSBORRAR);
				listar(false);
				int index = Teclado.leerInt(TextosApp.NUMEROPARABORRAR);
				if (index == 0) {
					System.out.println(TextosApp.CANCELADO);
				} else {
					LogEstilo.deleteEstilo(index);
				}
			} else {
				System.out.println(TextosApp.NOHAYESTILO);
			}
		} catch (

		SQLException e) {
			System.err.println(TextosApp.ERRORTOTAL);
		}

	}

	/*
	 * 
	 * ESTE MÉTODO TE CREA LOS ESTILOS
	 * 
	 **/

	public static void nuevo() {
		System.out.println(TextosApp.ANIADIRESTILO);
		String nombre = Teclado.leerString(TextosApp.NOMBREESTILO);
		Estilo m = new Estilo(nombre);
		try {
			LogEstilo.addEstilo(m);
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORESTILO);
		}
	}

	/*
	 * 
	 * ESTE MÉTODO TE MODIFICA LOS ESTILOS
	 * 
	 **/
	public static void modificar() {
		System.out.println(TextosApp.PROCESOEDITARESTILO);
		List<Estilo> ls = listar(false);
		int index;
		index = Teclado.leerInt(TextosApp.SELECCIONE);
		String estilo = Teclado.leerString(TextosApp.NOMBREESTILO);
		try {
			LogEstilo.updateEstilo(index, new Estilo(estilo));
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORMODIFICAR);

		}
		System.out.println(TextosApp.MODIFICAR);
	}

	/*
	 * 
	 * ESTE MÉTODO TE COGE UN ESTILO
	 * 
	 **/

	public static void getEstilo() {
		System.out.println(TextosApp.PROCESOOBTENERESTILO);
		int index = Teclado.leerInt(TextosApp.SELECCIONE);
		if (index == 0) {
			System.out.println(TextosApp.CANCELADO);
		} else {

			Estilo m;
			try {
				m = logic.LogEstilo.getEstilo(index);
			} catch (SQLException e) {
				System.err.println("404 Mark not found");
				m = null;
			}
			if (m == null || m.getNombre() == null) {
				System.out.println(TextosApp.NOEXISTEESTILO);
			} else {
				System.out.println(TextosApp.ESTILOOBTENIDO + m);

			}

		}
	}

}
