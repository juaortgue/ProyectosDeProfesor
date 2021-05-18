package controller;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

import logic.LogTienda;
import model.TextosApp;
import model.Tienda;
import utils.Teclado;

public class ControllerTienda {

	/**
	 * ESTE MÉTODO LISTA LAS TIENDA
	 */

	public static List<Tienda> listar(boolean ordenar) {
		List<Tienda> ls = null;

		try {
			ls = LogTienda.listarTienda();
			if (ordenar)
				ls.sort(Comparator.reverseOrder());
			if (ls.size() > 0) {
				for (Tienda m : ls) {
					System.out.println(m.getNombre());
				}
			} else {
				System.out.println(TextosApp.NOHAYTIENDA);
			}

		} catch (SQLException e) {

			System.out.println(TextosApp.ERRORLISTA);
		}
		return ls;
	}

	/**
	 * ESTE MÉTODO BORRAR TIENDA
	 */

	public static void borrar() {
		try {
			if (LogTienda.totalTienda() > 0) {
				System.out.println(TextosApp.ELEMENTOSBORRAR);
				listar(false);
				int index = Teclado.leerInt(TextosApp.NUMEROPARABORRAR);
				if (index == 0) {
					System.out.println(TextosApp.CANCELADO);
				} else {
					LogTienda.deleteTienda(index);
				}
			} else {
				System.out.println(TextosApp.NOHAYTIENDA);
			}
		} catch (

		SQLException e) {
			System.err.println(TextosApp.ERRORTOTAL);
		}

	}

	/**
	 * ESTE MÉTODO CREAR TIENDA
	 */

	public static void nuevo() {
		System.out.println(TextosApp.ANIADIRTIENDA);
		String nombre = Teclado.leerString(TextosApp.NOMBRETIENDA);
		Tienda m = new Tienda(nombre);
		try {
			LogTienda.addTienda(m);
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORTIENDA);
		}
	}

	/**
	 * ESTE MÉTODO MODIFICAR TIENDA
	 */

	public static void modificar() {
		System.out.println(TextosApp.PROCESOEDITARTIENDA);
		List<Tienda> ls = listar(false);
		int index;
		index = Teclado.leerInt(TextosApp.SELECCIONE);
		String tienda = Teclado.leerString(TextosApp.NOMBRETIENDA);
		try {
			LogTienda.updateTienda(index, new Tienda(tienda));
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORMODIFICAR);

		}
		System.out.println(TextosApp.MODIFICAR);
	}

	/**
	 * ESTE MÉTODO COGER UNA TIENDA
	 */

	public static void getTotalTienda() {
		try {
			System.out.println(TextosApp.TOTALTIENDA + LogTienda.totalTienda());
		} catch (SQLException e) {
			System.err.println(TextosApp.ERROR);
		}
	}
}
