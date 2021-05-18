package controller;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

import logic.LogCliente;
import logic.LogPersonalS;
import model.Cliente;
import model.Personal_Shopper;
import model.TextosApp;
import utils.Teclado;

public class ControllerPersonalS {

	/**
	 * ESTE MÉTODO TE LISTA LOS PERSONAL SHOPPER
	 */

	public static List<Personal_Shopper> listar(boolean ordenar) {
		List<Personal_Shopper> ls = null;
		try {
			ls = (List<Personal_Shopper>) LogPersonalS.listar();
			if (ordenar)
				ls.sort(Comparator.reverseOrder());
			if (ls.size() > 0) {
				for (int i = 0; i < ls.size(); i++) {
					Personal_Shopper p = ls.get(i);
					System.out.println((i + 1) + ", " + p.getNombre() + ", " + p.getApellidos() + ", " + p.getDni()
							+ ", " + p.getEmail() + ", " + p.getTelefono() + ", " + p.getClientes());
				}

			} else {
				System.out.println(TextosApp.NOHAYPERSONALSH);
			}
		} catch (SQLException e) {
			ls = null;
			System.err.println(TextosApp.ERRORLISTA);
		}
		return ls;

	}

	/**
	 * ESTE MÉTODO TE BORRAR PERSONAL SHOPPER
	 */
	public static void borrar() {
		try {
			if (LogPersonalS.totalPersonal_Shopper() > 0) {
				System.out.println(TextosApp.ELEMENTOSBORRAR);
				List<Personal_Shopper> ls = listar(false);
				int index = Teclado.leerInt(TextosApp.NUMEROPARABORRAR);
				if (index == 0) {
					System.out.println(TextosApp.CANCELADO);
				} else {
					// TODO borrar id en cliente y en ranking
					List<Cliente> clientes = LogCliente.listarCliente();
					for (Cliente c : clientes) {
						if (c.getPersonal_shopper().getId_personal_shopper()
								.equals(ls.get(index).getId_personal_shopper())) {
							c.setPersonal_shopper(null);
							LogCliente.borrarPs(c.getId_cliente());
						}
					}
					LogPersonalS.deletePersonal_Shopper(ls.get(index).getId_personal_shopper());
				}
			} else {
				System.out.println(TextosApp.NOHAYPERSONALSH);
			}
		} catch (

		SQLException e) {
			System.err.println(TextosApp.ERRORBORRARPERSONALSH);
		}

	}

	/**
	 * ESTE MÉTODO TE CREA PERSONAL SHOPPER
	 */

	public static void nuevo() {
		System.out.println(TextosApp.ANIADIRPERSONALSH);
		String nombre = Teclado.leerString(TextosApp.NOMBREPS);

		Personal_Shopper m = new Personal_Shopper(nombre);
		m.setApellidos(Teclado.leerString(TextosApp.APELLIDOSPS));
		m.setDni(Teclado.leerString(TextosApp.DNIPS));
		m.setTelefono(Teclado.leerString(TextosApp.TELEFONOPS));
		m.setContrasenia(Teclado.leerString(TextosApp.CONTRASENIAPS));
		m.setEmail(Teclado.leerString(TextosApp.EMAILPS));

		try {
			LogPersonalS.addPersonal_Shopper(m);
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORPERSONALSH);
		}
	}

	/**
	 * ESTE MÉTODO TE MODIFICAR PERSONAL SHOPPER
	 */

	public static void modificar() {
		System.out.println(TextosApp.PROCESOEDITARPS);
		List<Personal_Shopper> ls = listar(true);
		int index;
		index = Teclado.leerInt(TextosApp.SELECCIONE);
		String nombre = Teclado.leerString(TextosApp.NOMBREPS);
		String apellidos = Teclado.leerString(TextosApp.APELLIDOSPS);
		String dni = Teclado.leerString(TextosApp.DNIPS);
		String telefono = Teclado.leerString(TextosApp.TELEFONOPS);
		String email = Teclado.leerString(TextosApp.EMAILPS);
		String contrasenia = Teclado.leerString(TextosApp.CONTRASENIAPS);
		Personal_Shopper p = new Personal_Shopper(nombre, apellidos, dni, telefono, contrasenia, email);
		try {
			LogPersonalS.updatePersonal_Shopper(ls.get(index).getId_personal_shopper(), p);
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORMODIFICAR);

		}
		System.out.println(TextosApp.MODIFICAR);
	}

	/**
	 * ESTE MÉTODO COGE UN PERSONAL SHOPPER
	 */

	public static void getPersonal_Shopper() {
		List<Personal_Shopper> ls = listar(true);
		System.out.println(TextosApp.PROCESOOBTENERPS);
		int index = Teclado.leerInt(TextosApp.SELECCIONE);
		if (index == 0) {
			System.out.println(TextosApp.CANCELADO);
		} else {

			Personal_Shopper m;
			try {
				m = logic.LogPersonalS.getPersonalShopper(ls.get(index).getId_personal_shopper());

				System.out.println(m);

			} catch (SQLException e) {

				System.err.println("404 Mark not found");
				m = null;
			}
			if (m == null || m.getNombre() == null) {
				System.out.println(TextosApp.NOEXISTEPS);
			} else {
				System.out.println(TextosApp.PSOBTENIDO + m);

			}

		}
	}

	/**
	 * ESTE MÉTODO TE DA EL TOTAL DE PERSONAL SHOPPER
	 */

	public static void totalPersonal_Shopper() {
		try {
			System.out.println(TextosApp.TOTALPS + LogPersonalS.totalPersonal_Shopper());
		} catch (SQLException e) {

			System.err.println(TextosApp.ERROR);
		}
	}

	/**
	 * ESTE MÉTODO TE CREA CLIENTE AL PERSONAL SHOPPER
	 */
	public static void nuevoCliente() {

		List<Personal_Shopper> ls = listar(true);
		System.out.println(TextosApp.PROCESOOBTENERPS);
		int indexPs = Teclado.leerInt(TextosApp.SELECCIONE);
		if (indexPs == 0) {
			System.out.println(TextosApp.CANCELADO);
		} else {

			try {
				indexPs--;
				List<Cliente> ls2 = ControllerCliente.listar(true);

				int c = Teclado.leerInt(TextosApp.SELECCIONCLI);
				if (c == 0) {
					System.out.println(TextosApp.CANCELADO);
				} else {
					c--;

					LogPersonalS.addCliente(ls.get(indexPs).getId_personal_shopper(), ls2.get(c).getId_cliente());

				}
			} catch (SQLException e) {
				System.err.println(TextosApp.OBTENERCLIENTES);
			}

		}

	}
}