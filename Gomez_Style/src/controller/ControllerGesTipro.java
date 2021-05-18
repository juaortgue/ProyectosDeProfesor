package controller;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

import logic.LogGesTipro;
import model.TextosApp;
import model.Tipo_Producto;
import utils.Teclado;

public class ControllerGesTipro {

	/**
	 * ESTE MÉTODO LISTA LOS TIPOS DE PRODUCTO
	 */

	public static List<Tipo_Producto> listar(boolean ordenar) {
		List<Tipo_Producto> ls = null;
		try {
			ls = LogGesTipro.listarGesTipros();
		} catch (SQLException e) {

			System.err.println(TextosApp.ERRORLISTA);
		}
		if (ordenar)
			ls.sort(Comparator.reverseOrder());
		if (ls.size() > 0) {

			for (Tipo_Producto m : ls) {
				System.out.println(m.getId_tipo_producto() + " " + m.getNombre());

			}
		} else {
			System.out.println(TextosApp.NOHAYTIPOPRODUCTO);
		}
		return ls;
	}

	/**
	 * ESTE MÉTODO BORRA TIPOS DE PRODUCTO
	 */

	public static void borrar() {
		try {
			if (LogGesTipro.totalTipo_Producto() > 0) {
				System.out.println(TextosApp.ELEMENTOSBORRAR);
				listar(false);
				int index = Teclado.leerInt(TextosApp.NUMEROPARABORRAR);
				if (index == 0) {
					System.out.println(TextosApp.CANCELADO);
				} else {
					LogGesTipro.deleteTipo_Producto(index);
				}
			} else {
				System.out.println(TextosApp.NOHAYTIPOPRODUCTO);
			}
		} catch (

		SQLException e) {
			System.err.println(TextosApp.ERRORTOTAL);
		}

	}

	/**
	 * ESTE MÉTODO CREA TIPOS DE PRODUCTO
	 */

	public static void nuevo() {
		System.out.println(TextosApp.ANIADIRTIPOPRO);
		String nombre = Teclado.leerString(TextosApp.NOMBRETIPOPRODUCTO);
		Tipo_Producto m = new Tipo_Producto(nombre);
		try {
			LogGesTipro.addTipo_Producto(m);
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORTIPOPRODUCTO);
		}
	}

	/**
	 * ESTE MÉTODO MODIFICA TIPOS DE PRODUCTO
	 */

	public static void modificar() {
		System.out.println(TextosApp.PROCESOEDITARTIPOPRODUCTO);
		List<Tipo_Producto> ls = listar(false);
		int index;
		index = Teclado.leerInt(TextosApp.SELECCIONE);
		String tipoProducto = Teclado.leerString(TextosApp.NOMBRETIPOPRODUCTO);
		try {
			LogGesTipro.updateTipo_Producto(index, new Tipo_Producto(tipoProducto));
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORMODIFICAR);

		}
		System.out.println(TextosApp.MODIFICAR);

	}

	/**
	 * ESTE MÉTODO TE SELECCIONA TIPOS DE PRODUCTO
	 */

	public static void getTipo_Producto() {
		System.out.println(TextosApp.PROCESOOBTENERTIPOPRODUCTO);
		int index = Teclado.leerInt(TextosApp.SELECCIONE);
		if (index == 0) {
			System.out.println(TextosApp.CANCELADO);
		} else {

			Tipo_Producto m;
			try {
				m = logic.LogGesTipro.getTipo_Producto(index);
			} catch (SQLException e) {

				System.err.println("404 Mark not found");
				m = null;
			}
			if (m == null || m.getNombre() == null) {
				System.out.println(TextosApp.NOEXISTETIPO);
			} else {
				System.out.println(TextosApp.TIPOPRODUCTOOBTENIDO + m);

			}

		}
	}

	/**
	 * ESTE MÉTODO TOTAL DE LOS TIPOS DE PRODUCTO
	 */

	public static void getTotalTipo_Producto() {
		try {
			System.out.println(TextosApp.TOTALTIPOPRODUCTO + LogGesTipro.totalTipo_Producto());
		} catch (SQLException e) {

			System.err.println(TextosApp.ERROR);
		}
	}

}
