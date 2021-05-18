package controller;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

import logic.LogCliente;
import model.Cliente;
import model.Personal_Shopper;
import model.TextosApp;
import utils.Teclado;

public class ControllerCliente {

	/*
	 * 
	 * ESTE MÉTODO TE LISTA LOS CLIENTES
	 * 
	 **/

	public static List<Cliente> listar(boolean ordenar) {
		List<Cliente> ls = null;
		try {
			ls = LogCliente.listarCliente();
			if (ordenar)
				ls.sort(Comparator.reverseOrder());
			if (ls.size() > 0) {

				for (int i = 0; i < ls.size(); i++) {
					Cliente m = ls.get(i);
					System.out.println((i + 1) + ", " + m);
				}

			} else {
				System.out.println(TextosApp.NOHAYCLIENTES);
			}
		} catch (SQLException e) {

			System.out.println(TextosApp.ERRORLISTA);
		}
		return ls;
	}

	/*
	 * 
	 * ESTE MÉTODO TE BORRA LOS CLIENTES
	 * 
	 **/

	public static void borrar() {
		try {
			if (LogCliente.totalCliente() > 0) {
				System.out.println(TextosApp.ELEMENTOSBORRAR);
				List<Cliente> ls = listar(false);
				int index = Teclado.leerInt(TextosApp.NUMEROPARABORRAR);
				if (index == 0) {
					System.out.println(TextosApp.CANCELADO);
				} else {
					index--;
					LogCliente.deleteCliente(ls.get(index).getId_cliente());
				}
			} else {
				System.out.println(TextosApp.NOHAYCLIENTES);
			}
		} catch (

		SQLException e) {
			System.err.println(TextosApp.ERRORBORRARCLIENTES);
		}

	}

	/*
	 * 
	 * ESTE MÉTODO TE CREA LOS CLIENTES
	 * 
	 **/

	public static void nuevo() {

		Cliente m = new Cliente();

		System.out.println(TextosApp.ANIADIRCLIENTE);
		m.setNombre(Teclado.leerString(TextosApp.NOMBRE));
		m.setApellidos(Teclado.leerString(TextosApp.APELLIDOS));
		m.setDni(Teclado.leerString(TextosApp.DNI));
		m.setTelefono(Teclado.leerString(TextosApp.TELEFONO));
		m.setContrasenia(Teclado.leerString(TextosApp.CONTRASENIA));
		m.setEmail(Teclado.leerString(TextosApp.EMAIL));
		m.setSexo(Teclado.leerString(TextosApp.SEXO));
		m.setEdad(Teclado.leerInt(TextosApp.EDAD));
		m.setPresupuesto_maximo(Teclado.leerDouble(TextosApp.PRESUMAX));
		m.setPeso(Teclado.leerDouble(TextosApp.PESO));
		m.setAltura(Teclado.leerDouble(TextosApp.ALTURA));
		m.setColor_piel(Teclado.leerString(TextosApp.PIEL));
		List<Personal_Shopper> ps;
		ps = ControllerPersonalS.listar(false);
		System.out.println("===============================================================");
		int index = Teclado.leerInt("Seleccione un Personal Shopper: ");
		System.out.println("===============================================================");

		Personal_Shopper p1 = new Personal_Shopper();
		p1 = ps.get(index - 1);
		m.setPersonal_shopper(p1);

		try {
			LogCliente.addCliente(m);
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORCLIENTES);

		}
	}

	/*
	 * 
	 * ESTE MÉTODO TE MODIFICA LOS CLIENTES
	 * 
	 **/

	public static void modificar() {
		System.out.println(TextosApp.PROCESOEDITARCLIENTE);
		List<Cliente> ls = listar(true);
		int index;
		index = Teclado.leerInt(TextosApp.SELECCIONE) - 1;
		int id = ls.get(index).getId_cliente();
		String nombre = Teclado.leerString(TextosApp.NOMBRE);
		String apellidos = Teclado.leerString(TextosApp.APELLIDOS);
		String dni = Teclado.leerString(TextosApp.DNI);
		String telefono = Teclado.leerString(TextosApp.TELEFONO);
		String contrasenia = Teclado.leerString(TextosApp.CONTRASENIA);
		String email = Teclado.leerString(TextosApp.EMAIL);
		String sexo = Teclado.leerString(TextosApp.SEXO);
		Integer edad = Teclado.leerInt(TextosApp.EDAD);
		Double presupuesto_maximo = Teclado.leerDouble(TextosApp.PRESUMAX);
		Double peso = Teclado.leerDouble(TextosApp.PESO);
		Double altura = Teclado.leerDouble(TextosApp.ALTURA);
		String color_piel = Teclado.leerString(TextosApp.PIEL);
		List<Personal_Shopper> ps;
		ps = ControllerPersonalS.listar(false);
		System.out.println("===============================================================");
		int indexPs = Teclado.leerInt("Seleccione un Personal Shopper: ") - 1;
		System.out.println("===============================================================");

		Personal_Shopper p1 = new Personal_Shopper();

		p1 = ps.get(indexPs);
		Cliente p = new Cliente(nombre, apellidos, dni, telefono, contrasenia, email, sexo, edad, presupuesto_maximo,
				peso, altura, color_piel);
		p.setPersonal_shopper(p1);

		try {
			LogCliente.updateCliente(id, p);
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORMODIFICAR);

		}
		System.out.println(TextosApp.MODIFICAR);
	}

	/*
	 * 
	 * ESTE MÉTODO TE MUESTRA EL TOTAL DE CLIENTES
	 * 
	 **/

	public static void getTotalCliente() {
		try {
			System.out.println(TextosApp.TOTAL + LogCliente.totalCliente());
		} catch (SQLException e) {

			System.err.println(TextosApp.ERROR);
		}
	}

}