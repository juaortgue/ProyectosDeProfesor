package logic;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbm.ConexionBD;
import model.Marca;

//la logica hace las operaciones CRUD
public class LogMarca {
	private static List<Marca> listaMarcas = new ArrayList<Marca>();

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS LISTA LAS MARCAS
	 * 
	 **/

	public static List<Marca> listarMarcas() throws SQLException {
		listaMarcas = new ArrayList<>();
		ConexionBD c = new ConexionBD();
		String sql = "select * from marca";
		ResultSet resultado = c.getConnection().createStatement().executeQuery(sql);

		while (resultado.next()) {
			listaMarcas.add(new Marca(resultado.getInt("ID_MARCA"), resultado.getString("NOMBRE")));
		}
		c.getConnection().close();

		return listaMarcas;
	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MUESTRA LAS MARCAS
	 * 
	 **/
	public static Marca getMarca(int index) throws SQLException {
		Marca r = new Marca();
		ConexionBD c = new ConexionBD();
		String sql = "select * from marca where ID_MARCA=" + index;
		ResultSet resultado = null;
		ResultSet s = c.getConnection().createStatement().executeQuery(sql);
		while (s.next()) {
			r = new Marca(s.getInt("ID_MARCA"), s.getString("NOMBRE"));
			c.closeConnection();
		}

		return r;
	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS CREA LAS MARCAS
	 * 
	 **/

	public static void addMarca(Marca m) throws SQLException {

		String nombre = m.getNombre().toUpperCase();
		String sql = "{ call PACK_MARCA.CREAR_MARCA(?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setString(1, nombre);
		orden.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MUESTRA EL TOTAL DE LAS MARCAS
	 * 
	 **/
	public static Integer totalMarcas() throws SQLException {
		Integer r = 0;
		// select count(nombre)from marca ;
		ConexionBD c = new ConexionBD();
		String sql = "select count(nombre) as total from marca";
		ResultSet resultado = c.getConnection().createStatement().executeQuery(sql);
		if (resultado.next()) {
			r = resultado.getInt("TOTAL");
		}

		c.getConnection().close();
		return r;

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS BORRA LAS MARCAS
	 * 
	 **/

	public static void deleteMarca(int index) throws SQLException {

		String sql = "{ call PACK_MARCA.BORRAR_MARCA(?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MODIFICA LAS MARCAS
	 * 
	 **/

	public static void updateMarca(int index, Marca m) throws SQLException {

		String sql = "{ call PACK_MARCA.MODIFICAR_MARCA(?,?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.setString(2, m.getNombre());
		orden.execute();

	}

}
