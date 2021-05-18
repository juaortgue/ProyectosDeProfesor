package controller;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

import logic.LogMarca;
import model.Marca;
import model.TextosApp;
import utils.Teclado;

public class ControllerMarca {

	/**
	 * ESTE MÉTODO LISTA MARCA
	 */

	public static List<Marca> listar(boolean ordenar) {
		List<Marca> ls = null;
		try {
			ls = LogMarca.listarMarcas();
		} catch (SQLException e) {

			System.err.println(TextosApp.ERRORLISTA);
		}
		if (ordenar)
			ls.sort(Comparator.reverseOrder());
		if (ls.size() > 0) {
			for (Marca m : ls) {
				System.out.println(m.getId_marca() + " " + m.getNombre());
			}
		} else {
			System.out.println(TextosApp.NOHAYMARCAS);
		}
		return ls;
	}

	/**
	 * ESTE MÉTODO BORRA MARCA
	 */

	public static void borrar() {
		try {
			if (LogMarca.totalMarcas() > 0) {
				System.out.println(TextosApp.ELEMENTOSBORRAR);
				listar(false);
				int index = Teclado.leerInt(TextosApp.NUMEROPARABORRAR);
				if (index == 0) {
					System.out.println(TextosApp.CANCELADO);
				} else {
					LogMarca.deleteMarca(index);
				}
			} else {
				System.out.println(TextosApp.NOHAYMARCAS);
			}
		} catch (

		SQLException e) {
			System.err.println(TextosApp.ERRORTOTAL);
		}

	}

	/**
	 * ESTE MÉTODO TE CREA MARCA
	 */
	public static void nuevo() {
		System.out.println(TextosApp.ANIADIRMARCA);
		String nombre = Teclado.leerString(TextosApp.NOMBREMARCA);
		Marca m = new Marca(nombre);
		try {
			LogMarca.addMarca(m);
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORMARCA);
		}
	}

	/**
	 * ESTE MÉTODO TE MODIFICAMARCA
	 */
	public static void modificar() {
		System.out.println(TextosApp.PROCESOEDITARMARCA);
		List<Marca> ls = listar(false);
		int index;
		index = Teclado.leerInt(TextosApp.SELECCIONE);
		String marca = Teclado.leerString(TextosApp.NOMBREMARCA);
		try {
			LogMarca.updateMarca(index, new Marca(marca));
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORMODIFICAR);

		}
		System.out.println(TextosApp.MODIFICAR);
	}

	/**
	 * ESTE MÉTODO TE SELECCIONA UNA MARCA
	 */
	public static void getMarca() {
		System.out.println(TextosApp.PROCESOOBTENERMARCA);
		int index = Teclado.leerInt(TextosApp.SELECCIONE);
		if (index == 0) {
			System.out.println(TextosApp.CANCELADO);
		} else {

			Marca m;
			try {
				m = logic.LogMarca.getMarca(index);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.err.println("404 Mark not found");
				m = null;
			}
			if (m == null || m.getNombre() == null) {
				System.out.println(TextosApp.NOEXISTEMARCA);
			} else {
				System.out.println(TextosApp.MARCAOBTENIDO + m);

			}
		}
	}

	/**
	 * ESTE MÉTODO TE MUESTRA EL TOTAL MARCA
	 */

	public static void getTotalMarca() {
		try {
			System.out.println(TextosApp.TOTALMARCA + LogMarca.totalMarcas());
		} catch (SQLException e) {

			System.err.println(TextosApp.ERROR);
		}
	}

}
