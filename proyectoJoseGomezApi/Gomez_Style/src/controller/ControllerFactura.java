package controller;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

import logic.LogFactura;
import model.Cliente;
import model.Factura;
import model.Linea_Factura;
import model.Producto;
import model.TextosApp;
import utils.Teclado;

public class ControllerFactura {

	/**
	 * ESTE MÉTODO LISTA LAS FACTURAS
	 */

	public static List<Factura> listar(boolean ordenar) {
		List<Factura> ls = null;
		try {
			ls = LogFactura.listarFacturas();
			if (ordenar)
				ls.sort(Comparator.reverseOrder());
			if (ls.size() > 0) {

				for (int i = 0; i < ls.size(); i++) {
					Factura m = ls.get(i);
					System.out.println((i + 1) + ". " + "PRECIO TOTAL:  " + m.getPrecio_total() + ", NOMBRE CLIENTE:  "
							+ m.getCliente().getNombre());
					System.out.println("LINEAS DE FACTURA:");
					for (Linea_Factura lf : m.getLineas()) {
						System.out.println(lf);
					}

				}
			} else {
				System.out.println(TextosApp.NOHAYFACTURAS);
			}
		} catch (SQLException e) {

			System.err.println(TextosApp.ERRORLISTA);
		}

		return ls;
	}

	/**
	 * ESTE MÉTODO BORRA FACTURAS
	 */
	public static void borrar() {
		try {
			if (LogFactura.totalFacturas() > 0) {
				System.out.println(TextosApp.ELEMENTOSBORRAR);
				listar(false);
				int index = Teclado.leerInt(TextosApp.NUMEROPARABORRAR);
				if (index == 0) {
					System.out.println(TextosApp.CANCELADO);
				} else {
					LogFactura.deleteFactura(index);
				}
			} else {
				System.out.println(TextosApp.NOHAYFACTURAS);
			}
		} catch (

		SQLException e) {
			System.err.println(TextosApp.ERRORTOTAL);
		}

	}

	/**
	 * ESTE MÉTODO CREA FACTURAS
	 */

	public static void nuevo() {

		System.out.println(TextosApp.ANIADIRFACTURA);
		String fecha = Teclado.leerString(TextosApp.FECHACOMPRA);
		Double total = Teclado.leerDouble(TextosApp.PRECIOTOTAL);
		List<Cliente> li = ControllerCliente.listar(false);
		int clienteId = Teclado.leerInt(TextosApp.PROCESOOBTENER);
		Cliente c = li.get(clienteId);

		Factura fa = new Factura();

		fa.setFecha_compra(fecha);
		fa.setPrecio_total(total);
		fa.setCliente(c);

		List<Producto> listaProductos = ControllerProducto.listar(false);
		int op = 0;
		while (op != -1) {
			Producto p = new Producto();
			op = Teclado.leerInt(TextosApp.NUMEROPRODUCTO);
			p = listaProductos.get(op);
			Linea_Factura lf = new Linea_Factura();
			lf.setCantidad(Teclado.leerInt(TextosApp.LINEAFACTURACANTIDAD));
			lf.setPrecio_linea(Teclado.leerDouble(TextosApp.PRECIOLINEAFACTURA));
			fa.getLineas().add(lf);

		}

		try {
			LogFactura.addFactura(fa);
		} catch (SQLException e) {

		}
		System.err.println(TextosApp.ERRORFACTURA);
	}

	/**
	 * ESTE MÉTODO MODIFICA FACTURAS
	 */
	public static void modificar() {
		System.out.println(TextosApp.PROCESOEDITARFACTURA);
		List<Factura> ls = listar(false);
		int index;
		index = Teclado.leerInt(TextosApp.SELECCIONE);
		Double precio = Teclado.leerDouble(TextosApp.PRECIOTOTAL);
		String fecha = Teclado.leerString(TextosApp.FECHACOMPRA);
		try {
			LogFactura.updateFactura(index, new Factura(precio, fecha));
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORMODIFICAR);

		}
		System.out.println(TextosApp.MODIFICAR);
	}

	/**
	 * ESTE MÉTODO COGE UNA FACTURAS
	 */
	public static void getFactura() {
		System.out.println(TextosApp.PROCESOOBTENERFAC);
		int index = Teclado.leerInt(TextosApp.SELECCIONE);
		if (index == 0) {
			System.out.println(TextosApp.CANCELADO);
		} else {

			Factura m;
			try {
				m = logic.LogFactura.getFactura(index);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.err.println("404 Mark not found");
				m = null;
			}
			if (m == null || m.getFecha_compra() == null) {
				System.out.println(TextosApp.FECHAERRONEA);
			} else {
				System.out.println(TextosApp.FACTURAOBTENIDO + m);

			}
		}
	}

	/**
	 * ESTE MÉTODO TOTAL DE FACTURAS
	 */
	public static void getTotalFactura() {
		try {
			System.out.println(TextosApp.TOTALFACTURA + LogFactura.totalFacturas());
		} catch (SQLException e) {

			System.err.println(TextosApp.ERROR);
		}
	}

}
