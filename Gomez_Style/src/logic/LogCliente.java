package logic;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbm.ConexionBD;
import model.Cliente;
import model.Factura;
import model.Personal_Shopper;

public class LogCliente {

	private static List<Cliente> listaCliente = new ArrayList<Cliente>();

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS LISTA A LOS CLIENTES
	 * 
	 **/

	public static List<Cliente> listarCliente() throws SQLException {
		listaCliente = new ArrayList<>();
		ConexionBD c = new ConexionBD();
		String sql = " select c.id_cliente,c.nombre,c.apellidos,c.dni,c.telefono,c.contrasenia,c.email,c.sexo,c.edad,c.presupuesto_maximo,c.peso,c.altura,c.color_piel,ps.id_personal_shopper as ID_PS, ps.nombre as N_PS from cliente c,personal_shopper ps\r\n"
				+ "where c.id_personal_shopper = ps.id_personal_shopper";
		ResultSet resultado = c.getConnection().createStatement().executeQuery(sql);

		while (resultado.next()) {
			Cliente nuevo = new Cliente();
			Personal_Shopper ps = new Personal_Shopper();
			nuevo.setId_cliente(resultado.getInt("ID_CLIENTE"));
			nuevo.setNombre(resultado.getString("NOMBRE"));
			nuevo.setApellidos(resultado.getString("APELLIDOS"));
			nuevo.setDni(resultado.getString("DNI"));
			nuevo.setTelefono(resultado.getString("TELEFONO"));
			nuevo.setContrasenia(resultado.getString("CONTRASENIA"));
			nuevo.setEmail(resultado.getString("EMAIL"));
			nuevo.setSexo(resultado.getString("SEXO"));
			nuevo.setEdad(resultado.getInt("EDAD"));
			nuevo.setPresupuesto_maximo(resultado.getDouble("PRESUPUESTO_MAXIMO"));
			nuevo.setPeso(resultado.getDouble("PESO"));
			nuevo.setAltura(resultado.getDouble("ALTURA"));
			nuevo.setColor_piel(resultado.getString("COLOR_PIEL"));
			ps.setId_personal_shopper(resultado.getInt("id_PS"));
			ps.setNombre(resultado.getString("N_PS"));
			nuevo.setPersonal_shopper(ps);

			listaCliente.add(nuevo);
		}
		c.getConnection().close();

		return listaCliente;
	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS DA LOS CLIENTES Y LAS FACTURAS
	 * 
	 **/
	public static Cliente ClienteFacturas(int id) throws SQLException {
		Cliente cl = new Cliente();
		ConexionBD c = new ConexionBD();
		String sql = "SELECT cliente.id_cliente,cliente.nombre,cliente.apellidos,cliente.dni,"
				+ "cliente.telefono,factura.fecha_compra,factura.precio_total FROM cliente,factura\r\n"
				+ "where cliente.id_cliente = factura.id_cliente";
		ResultSet resultado = c.getConnection().createStatement().executeQuery(sql);
		if (resultado.next()) {
			cl.setId_cliente(resultado.getInt("ID_CLIENTE"));
			cl.setNombre(resultado.getString("NOMBRE"));
			cl.setApellidos(resultado.getString("APELLIDOS"));
			cl.setDni(resultado.getString("DNI"));
			cl.setTelefono(resultado.getString("TELEFONO"));
			cl.setEmail(resultado.getString("EMAIL"));
			Factura f = new Factura();
			f.setFecha_compra(resultado.getString("FECHA_COMPRA"));
			f.setPrecio_total(resultado.getDouble("PRECIO_TOTAL"));

		}
		c.getConnection().close();

		return cl;

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS DA EL TOTAL DE LOS CLIENTES
	 * 
	 **/

	public static Integer totalCliente() throws SQLException {
		Integer r = 0;
		// select count(nombre)from cliente ;
		ConexionBD c = new ConexionBD();
		String sql = "select count(nombre) as total from cliente";
		ResultSet resultado = c.getConnection().createStatement().executeQuery(sql);
		if (resultado.next()) {
			r = resultado.getInt("TOTAL");
		}

		c.getConnection().close();
		return r;

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS BORRA CLIENTES
	 * 
	 **/

	public static void deleteCliente(int index) throws SQLException {
		String sql = "{ call PACK_CLIENTE.BORRAR_CLIENTE(?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS CREA A LOS CLIENTES
	 * 
	 **/

	public static void addCliente(Cliente m) throws SQLException {
		String sql = "{ call PACK_CLIENTE.CREAR_CLIENTE(?,?,?,?,?,?,?,?,?,?,?,?,?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setString(1, m.getNombre().toUpperCase());
		orden.setString(2, m.getApellidos().toUpperCase());
		orden.setString(3, m.getDni());
		orden.setString(4, m.getTelefono());
		orden.setString(5, m.getContrasenia());
		orden.setString(6, m.getEmail());
		orden.setString(7, m.getSexo().toUpperCase());
		orden.setInt(8, m.getEdad());
		Integer pm = m.getPresupuesto_maximo().intValue();
		orden.setInt(9, pm);
		orden.setDouble(10, m.getPeso());
		orden.setDouble(11, m.getAltura());
		orden.setString(12, m.getColor_piel().toUpperCase());
		orden.setInt(13, m.getPersonal_shopper().getId_personal_shopper());
		orden.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MODIFICA A LOS CLIENTES
	 * 
	 **/
	public static void updateCliente(int index, Cliente m) throws SQLException {

		String sql = "{ call PACK_CLIENTE.MODIFICAR_CLIENTE(?,?,?,?,?,?,?,?,?,?,?,?,?, ?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement statement = c.getConnection().prepareCall(sql);

		statement.setInt(1, index);
		statement.setString(2, m.getNombre().toUpperCase());
		statement.setString(3, m.getApellidos().toUpperCase());
		statement.setString(4, m.getDni().toUpperCase());
		statement.setString(5, m.getTelefono().toUpperCase());
		statement.setString(6, m.getContrasenia().toUpperCase());
		statement.setString(7, m.getEmail().toUpperCase());
		statement.setString(8, m.getSexo().toUpperCase());
		statement.setInt(9, m.getEdad());
		statement.setDouble(10, m.getPresupuesto_maximo());
		statement.setDouble(11, m.getPeso());
		statement.setDouble(12, m.getAltura());
		statement.setString(13, m.getColor_piel().toUpperCase());
		statement.setInt(14, m.getPersonal_shopper().getId_personal_shopper());

		statement.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS BORRA A LOS PERSONAL SHOPPER DE CLIENTES
	 * 
	 **/
	
	public static void borrarPs(Integer id_cliente) throws SQLException {
		String sql = "{ call PACK_CLIENTE.BORRAR_PS(?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, id_cliente);
		orden.execute();

	}

}
