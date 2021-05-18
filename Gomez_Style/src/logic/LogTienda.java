package logic;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbm.ConexionBD;
import model.Tienda;

public class LogTienda {

	private static List<Tienda> listaTienda = new ArrayList<Tienda>();

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS LISTA DE TIENDA
	 * 
	 **/

	public static List<Tienda> listarTienda() throws SQLException {
		listaTienda = new ArrayList<>();
		ConexionBD c = new ConexionBD();
		String sql = "select * from tienda";
		ResultSet resultado = resultado = c.getConnection().createStatement().executeQuery(sql);

		while (resultado.next()) {
			listaTienda.add(new Tienda(resultado.getInt("ID_TIENDA"), resultado.getString("NOMBRE")));
		}
		c.getConnection().close();

		return listaTienda;
	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS TOTAL TIENDA
	 * 
	 **/

	public static int totalTienda() throws SQLException {
		Integer r = 0;
		// select count(nombre)from tienda ;
		ConexionBD c = new ConexionBD();
		String sql = "select count(nombre) as total from tienda";
		ResultSet resultado = c.getConnection().createStatement().executeQuery(sql);
		if (resultado.next()) {
			r = resultado.getInt("TOTAL");
		}

		c.getConnection().close();
		return r;
	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS BORRAR TIENDA
	 * 
	 **/
	public static void deleteTienda(int index) throws SQLException {
		String sql = "{ call PACK_TIENDA.BORRAR_TIENDA(?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.execute();
	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS CREA TIENDA
	 * 
	 **/

	public static void addTienda(Tienda t) throws SQLException {
		String nombre = t.getNombre().toUpperCase();
		String sql = "{ call PACK_TIENDA.CREAR_TIENDA(?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setString(1, nombre);
		orden.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MODIFICA TIENDA
	 * 
	 **/
	public static void updateTienda(int index, Tienda t) throws SQLException {
		String sql = "{ call PACK_TIENDA.MODIFICAR_TIENDA(?,?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.setString(2, t.getNombre());
		orden.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MUESTRA TIENDA
	 * 
	 **/

	public static Tienda getTienda(int index) throws SQLException {
		Tienda r = new Tienda();
		ConexionBD c = new ConexionBD();
		String sql = "select * from tienda where ID_TIENDA=" + index;
		ResultSet resultado = null;
		ResultSet s = c.getConnection().createStatement().executeQuery(sql);
		while (s.next()) {
			r = new Tienda(s.getInt("ID_TIENDA"), s.getString("NOMBRE"));
			c.closeConnection();
		}

		return r;
	}
}
