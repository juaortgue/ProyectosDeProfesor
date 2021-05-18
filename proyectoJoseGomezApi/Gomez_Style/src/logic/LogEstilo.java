package logic;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbm.ConexionBD;
import model.Estilo;

//la logica hace las operaciones CRUD
public class LogEstilo {
	private static List<Estilo> listaEstilos = new ArrayList<Estilo>();
	
	/*
	 * ESTE PETICION DE BASE DE DATOS NOS LISTA A LOS ESTILOS
	 * 
	 **/

	public static List<Estilo> listaEstilos() throws SQLException {
		listaEstilos = new ArrayList<>();
		ConexionBD c = new ConexionBD();
		String sql = "select * from estilo";
		ResultSet resultado = null;

		resultado = c.getConnection().createStatement().executeQuery(sql);

		while (resultado.next()) {
			listaEstilos.add(new Estilo(resultado.getInt("ID_ESTILO"), resultado.getString("NOMBRE")));
		}
		c.getConnection().close();

		return listaEstilos;
	}

	
	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MUESTRA ESTILOS
	 * 
	 **/
	
	public static Estilo getEstilo(int index) throws SQLException {
		Estilo r = new Estilo();
		ConexionBD c = new ConexionBD();
		String sql = "select * from estilo where ID_ESTILO=" + index;
		ResultSet resultado = null;
		ResultSet s = c.getConnection().createStatement().executeQuery(sql);
		while (s.next()) {
			r = new Estilo(s.getInt("ID_ESTILO"), s.getString("NOMBRE"));
			c.closeConnection();
		}

		return r;
	}
	/*
	 * ESTE PETICION DE BASE DE DATOS NOS CREA LOS ESTILOS
	 * 
	 **/
	public static void addEstilo(Estilo m) throws SQLException {

		String nombre = m.getNombre().toUpperCase();
		String sql = "{ call PACK_ESTILO.CREAR_ESTILO(?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setString(1, nombre);
		orden.execute();

	}
	
	/*
	 * ESTE PETICION DE BASE DE DATOS NOS DA EL TOTAL ESTILOS
	 * 
	 **/

	public static Integer totalEstilos() throws SQLException {
		Integer r = 0;
		// select count(nombre)from estilo ;
		ConexionBD c = new ConexionBD();
		String sql = "select count(nombre) as total from estilo";
		ResultSet resultado = c.getConnection().createStatement().executeQuery(sql);
		if (resultado.next()) {
			r = resultado.getInt("TOTAL");
		}

		c.getConnection().close();
		return r;

	}
	
	/*
	 * ESTE PETICION DE BASE DE DATOS NOS BORRA ESTILOS
	 * 
	 **/

	public static void deleteEstilo(int index) throws SQLException {

		String sql = "{ call PACK_ESTILO.BORRAR_ESTILO(?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.execute();

	}
	
	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MODIFICA LOS ESTILOS
	 * 
	 **/

	public static void updateEstilo(int index, Estilo m) throws SQLException {

		String sql = "{ call PACK_ESTILO.MODIFICAR_ESTILO(?,?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.setString(2, m.getNombre());
		orden.execute();

	}

}
