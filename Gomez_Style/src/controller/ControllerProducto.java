package controller;

import java.lang.ModuleLayer.Controller;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

import logic.LogCliente;
import logic.LogMarca;
import logic.LogPersonalS;
import logic.LogProducto;
import model.Cliente;
import model.Marca;
import model.Personal_Shopper;
import model.Producto;
import model.TextosApp;
import model.Tipo_Producto;
import utils.Teclado;

public class ControllerProducto {

	/*
	 * ESTE METODO TE LISTA LOS PRODUCTOS
	 * 
	 **/

	public static List<Producto> listar(boolean ordenar) {
		List<Producto> ls = null;
		try {
			ls = LogProducto.listarProductos();
			if (ordenar)
				ls.sort(Comparator.reverseOrder());
			if (ls.size() > 0) {
				for (int i = 0; i < ls.size(); i++) {
					Producto m = ls.get(i);
					System.out.println((i + 1) + " " + m.getNombre() + " " + m.getPrecio() + " " + m.getTalla() + " "
							+ m.getSexo() + " " + m.getIva() + " " + m.getDescuento());
				}

			} else {
				System.out.println(TextosApp.NOHAYPRODUCTO);

			}
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORLISTA);
		}

		return ls;
	}

	/*
	 * ESTE METODO TE BORRA LOS PRODUCTOS
	 * 
	 **/

	public static void borrar() {
		try {
			if (LogProducto.totalProductos() > 0) {
				System.out.println(TextosApp.ELEMENTOSBORRAR);
				List<Producto> ls = listar(false);
				int index = Teclado.leerInt(TextosApp.NUMEROPARABORRAR);
				if (index == 0) {
					System.out.println(TextosApp.CANCELADO);
				} else {
					index--;
					LogProducto.deleteProducto(ls.get(index).getId_producto());
				}
			} else {
				System.out.println(TextosApp.NOHAYPRODUCTO);
			}
		} catch (

		SQLException e) {
			System.err.println(TextosApp.ERRORTOTAL);
		}

	}

	/*
	 * ESTE METODO TE CREA PRODUCTOS
	 * 
	 **/

	public static void nuevo() {
		System.out.println(TextosApp.ANIADIRPRO);
		String nombre = Teclado.leerString(TextosApp.NOMBREPRODUCTO);

		Producto m = new Producto();
		m.setNombre(nombre);
		m.setPrecio(Teclado.leerDouble(TextosApp.PRECIOPRODUCTO));
		m.setTalla(Teclado.leerString(TextosApp.TALLAPRODUCTO));
		m.setSexo(Teclado.leerString(TextosApp.SEXOPRODUCTO));
		m.setIva(Teclado.leerDouble(TextosApp.IVAPRODUCTO));
		m.setDescuento(Teclado.leerDouble(TextosApp.DESCPRODUCTO));
		List<Marca> lsMarca;
		lsMarca = ControllerMarca.listar(false);
		int index = Teclado.leerInt("Seleccione una marca: ");
		Marca m1 = lsMarca.get(index);
		m.setMarca(m1);
		List<Tipo_Producto> ls;
		ls = ControllerGesTipro.listar(false);
		int index2 = Teclado.leerInt("Seleccione una tipo producto: ");
		Tipo_Producto m2 = ls.get(index2);
		m.setTipo_producto(m2);

		try {
			LogProducto.addProducto(m);
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORPRODUCTO);
		}
	}

	/*
	 * ESTE METODO TE MODIFICA PRODUCTOS
	 * 
	 **/

	public static void modificar() {
		System.out.println(TextosApp.PROCESOEDITARTIPOPRODUCTO);
		List<Producto> ls = listar(true);
		int index;
		index = Teclado.leerInt(TextosApp.SELECCIONE) - 1;
		String nombre = Teclado.leerString(TextosApp.NOMBREPRODUCTO);
		Double precio = Teclado.leerDouble(TextosApp.PRECIOPRODUCTO);
		String talla = Teclado.leerString(TextosApp.TALLAPRODUCTO);
		String sexo = Teclado.leerString(TextosApp.SEXOPRODUCTO);
		Double iva = Teclado.leerDouble(TextosApp.IVAPRODUCTO);
		Double descuento = Teclado.leerDouble(TextosApp.DESCPRODUCTO);
		int id = ls.get(index).getId_producto();
		Producto p = new Producto(nombre, precio, talla, sexo, iva, descuento);
		try {
			LogProducto.updateProducto(id, p);
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORMODIFICAR);

		}
		System.out.println(TextosApp.MODIFICAR);
	}

	/*
	 * ESTE METODO TE SELECCIONA UN PRODUCTOS
	 * 
	 **/

	public static void getProducto() {
		System.out.println(TextosApp.PROCESOOBTENERPRODUCTO);
		int index = Teclado.leerInt(TextosApp.SELECCIONE);
		if (index == 0) {
			System.out.println(TextosApp.CANCELADO);
		} else {

			Producto m;
			try {
				m = logic.LogProducto.getProducto(index);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.err.println("404 Mark not found");
				m = null;
			}
			if (m == null || m.getNombre() == null) {
				System.out.println(TextosApp.NOEXISTEPROD);
			} else {
				System.out.println(TextosApp.PRODUCTOOBTENIDO + m);

			}

		}
	}

	/*
	 * ESTE METODO TE MUESTRA EL TOTAL DE PRODUCTOS
	 * 
	 **/

	public static void getTotalProducto() {
		try {
			System.out.println(TextosApp.TOTALPRODUCTO + LogProducto.totalProductos());
		} catch (SQLException e) {
			System.err.println(TextosApp.ERROR);
		}
	}

}