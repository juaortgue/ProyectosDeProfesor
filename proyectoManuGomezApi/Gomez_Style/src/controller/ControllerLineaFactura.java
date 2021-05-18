package controller;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

import logic.LogLineaFactura;
import model.Factura;
import model.Linea_Factura;
import model.TextosApp;
import utils.Teclado;

public class ControllerLineaFactura {

	/**
	 * ESTE MÉTODO LISTA LAS LINEAS DE FACTURAS
	 */

	public static List<Linea_Factura> listar(boolean ordenar) {
		List<Linea_Factura> ls = null;
		try {
			ls = LogLineaFactura.listarLineaFacturas();
		} catch (SQLException e) {

			System.err.println(TextosApp.ERRORLISTA);
		}
		if (ordenar)
			ls.sort(Comparator.reverseOrder());
		if (ls.size() > 0) {
			for (Linea_Factura m : ls) {
				System.out.println("CANTIDAD: " + m.getCantidad() + ", PRECIO LINEA: " + m.getPrecio_linea());
			}
		} else {
			System.out.println(TextosApp.NOHAYLINEAFACTURA);
		}
		return ls;
	}
	

	/**
	 * ESTE MÉTODO BORRA LINEAS DE FACTURAS
	 */
	public static void borrar() {
		try {
			if (LogLineaFactura.totalLineaFacturas() > 0) {
				System.out.println(TextosApp.ELEMENTOSBORRAR);
				listar(false);
				int index = Teclado.leerInt(TextosApp.NUMEROPARABORRAR);
				if (index == 0) {
					System.out.println(TextosApp.CANCELADO);
				} else {
					LogLineaFactura.deleteLineaFactura(index);
				}
			} else {
				System.out.println(TextosApp.NOHAYLINEAFACTURA);
			}
		} catch (

		SQLException e) {
			System.err.println(TextosApp.ERRORTOTAL);
		}

	}

	/**
	 * ESTE MÉTODO TE CREA LINEAS DE FACTURAS
	 */

	public static void nuevo() {
		System.out.println(TextosApp.ANIADIRLINEAFACTURA);
		Integer cantidad = Teclado.leerInt(TextosApp.CANTIDADLINEAFACTURA);
		Double precio_linea = Teclado.leerDouble(TextosApp.PRECIOLINEAFACTURA);
		Linea_Factura m = new Linea_Factura(cantidad, precio_linea);
		try {
			LogLineaFactura.addLineaFactura(m);
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORLINEAFACTURA);
		}
	}

	/**
	 * ESTE MÉTODO MODIFICA LINEAS DE FACTURAS
	 */

	public static void modificar() {
		System.out.println(TextosApp.PROCESOEDITARLINEAFACTURA);
		List<Linea_Factura> ls = listar(false);
		int index;
		index = Teclado.leerInt(TextosApp.SELECCIONE);
		Integer cantidad = Teclado.leerInt(TextosApp.CANTIDADLINEAFACTURA);
		Double precio_linea = Teclado.leerDouble(TextosApp.PRECIOLINEAFACTURA);

		Linea_Factura p = new Linea_Factura(cantidad, precio_linea);

		try {
			LogLineaFactura.updateLineaFactura(index, p);
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORMODIFICAR);

		}
		System.out.println(TextosApp.MODIFICAR);
	}

	/**
	 * ESTE MÉTODO SELECCIONA LINEAS DE FACTURAS
	 */

	public static void getLinea_Factura() {
		System.out.println(TextosApp.PROCESOOBTENERLINEAFACTURA);
		int index = Teclado.leerInt(TextosApp.SELECCIONAOPCION);
		if (index == 0) {
			System.out.println(TextosApp.CANCELADO);
		} else {

			Linea_Factura m;
			try {
				m = logic.LogLineaFactura.getLineaFactura(index);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.err.println("404 Mark not found");
				m = null;
			}
			if (m == null || m.getCantidad() == null) {
				System.out.println(TextosApp.NOEXISTELINEAFACT);
			} else {
				System.out.println(TextosApp.LINEAFACTURAOBTENIDO + m);

			}
		}
	}

	/**
	 * ESTE MÉTODO TE MUESTRA EL TOTAL LINEAS DE FACTURAS
	 */

	public static void getTotalLineaFactura() {
		try {
			System.out.println(TextosApp.TOTALLINEAFACTURA + LogLineaFactura.totalLineaFacturas());
		} catch (SQLException e) {

			System.err.println(TextosApp.ERROR);
		}
	}

}