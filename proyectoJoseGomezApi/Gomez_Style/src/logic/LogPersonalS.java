package logic;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbm.ConexionBD;
import model.Cliente;
import model.Personal_Shopper;

public class LogPersonalS {
	private static Personal_Shopper personal_shopper = new Personal_Shopper();

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS LISTA LOS PERSONAL SHOPPER
	 * 
	 **/

	public static Personal_Shopper getPersonalShopper(int id) throws SQLException {
		Personal_Shopper p = new Personal_Shopper();
		List<Cliente> clientes = new ArrayList<Cliente>();
		ConexionBD c = new ConexionBD();
		String sql = "SELECT personal_shopper.id_personal_shopper,PERSONAL_SHOPPER.NOMBRE AS NOMBRE_PERSONAL_SHOPPER,personal_shopper.apellidos,\r\n"
				+ "				personal_shopper.dni,personal_shopper.telefono,personal_shopper.contrasenia,personal_shopper.email FROM PERSONAL_SHOPPER\r\n"
				+ "				WHERE personal_shopper.id_personal_shopper = " + id;
		ResultSet r = c.getConnection().createStatement().executeQuery(sql);
		if (r.next()) {

			p = new Personal_Shopper(r.getInt("ID_PERSONAL_SHOPPER"), r.getString("NOMBRE_PERSONAL_SHOPPER"),
					r.getString("APELLIDOS"), r.getString("DNI"), r.getString("TELEFONO"), r.getString("CONTRASENIA"),
					r.getString("EMAIL"), new ArrayList<Cliente>());

		}
		sql = "select * from cliente where id_personal_shopper = " + id;

		r = c.getConnection().createStatement().executeQuery(sql);
		while (r.next()) {
			Cliente cl = new Cliente();

			cl.setId_cliente(r.getInt("ID_CLIENTE"));
			cl.setNombre(r.getString("NOMBRE"));
			cl.setApellidos(r.getString("APELLIDOS"));
			cl.setDni(r.getString("DNI"));
			cl.setTelefono(r.getString("TELEFONO"));
			cl.setContrasenia(r.getString("CONTRASENIA"));
			cl.setEmail(r.getString("EMAIL"));
			cl.setSexo(r.getString("SEXO"));
			cl.setEdad(r.getInt("EDAD"));
			cl.setPresupuesto_maximo(r.getDouble("PRESUPUESTO_MAXIMO"));
			cl.setPeso(r.getDouble("PESO"));
			cl.setAltura(r.getDouble("ALTURA"));
			cl.setColor_piel(r.getString("COLOR_PIEL"));

			clientes.add(cl);

		}
		p.setClientes(clientes);
		c.getConnection().close();
		return p;

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS LISTA LOS PERSONAL SHOPPER
	 * 
	 **/
	public static ArrayList<Personal_Shopper> listar() throws SQLException {
		ArrayList<Personal_Shopper> ls = new ArrayList<Personal_Shopper>();
		String nombre, apellidos, dni, telefono, contrasenia, email;
		List<Cliente> clientes;
		ConexionBD c = new ConexionBD();
		String sql = "SELECT personal_shopper.id_personal_shopper,PERSONAL_SHOPPER.NOMBRE AS NOMBRE_PERSONAL_SHOPPER,personal_shopper.apellidos,\r\n"
				+ "personal_shopper.dni,personal_shopper.telefono,personal_shopper.contrasenia,personal_shopper.email FROM PERSONAL_SHOPPER";
		ResultSet r = c.getConnection().createStatement().executeQuery(sql);
		Integer id = 0;
		while (r.next()) {
			Personal_Shopper p = new Personal_Shopper();
			ls.add(new Personal_Shopper(r.getInt("ID_PERSONAL_SHOPPER"), r.getString("NOMBRE_PERSONAL_SHOPPER"),
					r.getString("APELLIDOS"), r.getString("DNI"), r.getString("TELEFONO"), r.getString("CONTRASENIA"),
					r.getString("EMAIL"), new ArrayList<Cliente>()));

		}
		c.getConnection().close();
		return ls;
	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS DA EL TOTAL DE LOS PERSONAL SHOPPER
	 * 
	 **/
	public static int totalPersonal_Shopper() throws SQLException {
		Integer r = 0;
		// select count(nombre)from personal_shopper ;
		ConexionBD c = new ConexionBD();
		String sql = "select count(nombre) as total from personal_shopper";
		ResultSet resultado = c.getConnection().createStatement().executeQuery(sql);
		if (resultado.next()) {
			r = resultado.getInt("TOTAL");
		}

		c.getConnection().close();
		return r;

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS BORRA LOS PERSONAL SHOPPER
	 * 
	 **/
	public static void deletePersonal_Shopper(int index) throws SQLException {
		String sql = "{ call PACK_PERSONAL_SHOPPER.BORRAR_PERSONAL_SHOPPER(?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.execute();
	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS CREA LOS PERSONAL SHOPPER
	 * 
	 **/

	public static void addPersonal_Shopper(Personal_Shopper m) throws SQLException {
		String nombre = m.getNombre().toUpperCase();
		String sql = "{ call PACK_PERSONAL_SHOPPER.CREAR_PERSONAL_SHOPPER(?,?,?,?,?,?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setString(1, m.getNombre().toUpperCase());
		orden.setString(2, m.getApellidos().toUpperCase());
		orden.setString(3, m.getDni().toUpperCase());
		orden.setString(4, m.getTelefono().toUpperCase());
		orden.setString(5, m.getContrasenia().toUpperCase());
		orden.setString(6, m.getEmail().toUpperCase());
		orden.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MODIFICA LOS PERSONAL SHOPPER
	 * 
	 **/

	public static void updatePersonal_Shopper(int index, Personal_Shopper personalS) throws SQLException {
		String sql = "{ call PACK_PERSONAL_SHOPPER.MODIFICAR_PERSONAL_SHOPPER(?,?,?,?,?,?,?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.setString(2, personalS.getNombre());
		orden.setString(3, personalS.getApellidos().toUpperCase());
		orden.setString(4, personalS.getDni().toUpperCase());
		orden.setString(5, personalS.getTelefono().toUpperCase());
		orden.setString(6, personalS.getContrasenia().toUpperCase());
		orden.setString(7, personalS.getEmail().toUpperCase());
		orden.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MODIFICA LOS CLIENTES DE LOS PERSONAL
	 * SHOPPER
	 * 
	 **/

	public static void addCliente(int index, int cl) throws SQLException {

		String sql = "{ call PACK_PERSONAL_SHOPPER.MODIFICAR_ADDCLIENTE_PERSONAL_SHOPPER(?,?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.setInt(2, cl);

		orden.execute();

	}

}
