package logic;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbm.ConexionBD;
import model.Tipo_Producto;

//la logica hace las operaciones CRUD
public class LogGesTipro {
	private static List<Tipo_Producto> listarGesTipros = new ArrayList<Tipo_Producto>();

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS LISTA LOS TIPO DE PRODUCTOS
	 * 
	 **/

	public static List<Tipo_Producto> listarGesTipros() throws SQLException {
		listarGesTipros = new ArrayList<>();
		ConexionBD c = new ConexionBD();
		String sql = "select * from tipo_producto";
		ResultSet resultado = null;

		resultado = c.getConnection().createStatement().executeQuery(sql);

		while (resultado.next()) {
			listarGesTipros.add(new Tipo_Producto(resultado.getInt("ID_TIPO_PRODUCTO"), resultado.getString("NOMBRE")));
		}
		c.getConnection().close();

		return listarGesTipros;
	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MUESTRA LOS TIPO DE PRODUCTOS
	 * 
	 **/

	public static Tipo_Producto getTipo_Producto(int index) throws SQLException {
		Tipo_Producto r = new Tipo_Producto();
		ConexionBD c = new ConexionBD();
		String sql = "select * from tipo_producto where ID_TIPO_PRODUCTO=" + index;
		ResultSet resultado = null;
		ResultSet s = c.getConnection().createStatement().executeQuery(sql);
		while (s.next()) {
			r = new Tipo_Producto(s.getInt("ID_TIPO_PRODUCTO"), s.getString("NOMBRE"));
			c.closeConnection();
		}

		return r;
	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS CREA LOS TIPO DE PRODUCTOS
	 * 
	 **/

	public static void addTipo_Producto(Tipo_Producto m) throws SQLException {

		String nombre = m.getNombre().toUpperCase();
		String sql = "{ call PACK_TIPO_PRODUCTO.CREAR_TIPO_PRODUCTO(?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setString(1, nombre);
		orden.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS DA EL TOTAL TIPO DE PRODUCTOS
	 * 
	 **/

	public static Integer totalTipo_Producto() throws SQLException {
		Integer r = 0;
		// select count(nombre)from tipo_producto ;
		ConexionBD c = new ConexionBD();
		String sql = "select count(nombre) as total from tipo_producto";
		ResultSet resultado = c.getConnection().createStatement().executeQuery(sql);
		if (resultado.next()) {
			r = resultado.getInt("TOTAL");
		}

		c.getConnection().close();
		return r;
	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS BORRA TIPO DE PRODUCTOS
	 * 
	 **/
	public static void deleteTipo_Producto(int index) throws SQLException {

		String sql = "{ call PACK_TIPO_PRODUCTO.BORRAR_TIPO_PRODUCTO(?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MODIFICA TIPO DE PRODUCTOS
	 * 
	 **/

	public static void updateTipo_Producto(int index, Tipo_Producto m) throws SQLException {
		String sql = "{ call PACK_TIPO_PRODUCTO.MODIFICAR_TIPO_PRODUCTO(?,?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.setString(2, m.getNombre());
		orden.execute();

	}

}
