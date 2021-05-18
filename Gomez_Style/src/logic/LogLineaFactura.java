package logic;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbm.ConexionBD;
import model.Linea_Factura;

//la logica hace las operaciones CRUD
public class LogLineaFactura {
	private static List<Linea_Factura> listarLineaFacturas = new ArrayList<Linea_Factura>();

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS LISTA LAS LINEAS DE FACTURA
	 * 
	 **/

	public static List<Linea_Factura> listarLineaFacturas() throws SQLException {
		listarLineaFacturas = new ArrayList<>();
		ConexionBD c = new ConexionBD();
		String sql = "select * from linea_factura";
		ResultSet resultado = c.getConnection().createStatement().executeQuery(sql);

		while (resultado.next()) {
			listarLineaFacturas.add(new Linea_Factura(resultado.getInt("ID_LINEA_FACTURA"),
					resultado.getInt("CANTIDAD"), resultado.getDouble("PRECIO_LINEA")));
		}
		c.getConnection().close();

		return listarLineaFacturas;
	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MUESTRA LAS LINEAS DE FACTURA
	 * 
	 **/

	public static Linea_Factura getLineaFactura(int index) throws SQLException {
		Linea_Factura r = new Linea_Factura();
		ConexionBD c = new ConexionBD();
		String sql = "select * from linea_factura where ID_LINEA_FACTURA=" + index;
		ResultSet resultado = null;
		ResultSet s = c.getConnection().createStatement().executeQuery(sql);
		while (s.next()) {
			r = new Linea_Factura(s.getInt("ID_LINEA_FACTURA"), s.getInt("CANTIDAD"), s.getDouble("PRECIO_LINEA"));
			c.closeConnection();
		}

		return r;
	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS CREA LAS LINEAS DE FACTURA
	 * 
	 **/

	public static void addLineaFactura(Linea_Factura m) throws SQLException {

		String sql = "{ call PACK_LINEA_FACTURA.CREAR_LINEA_FACTURA(?,?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		Integer cantidad = m.getCantidad();
		Double precio_linea = m.getPrecio_linea();

		orden.setInt(1, cantidad);
		orden.setDouble(2, precio_linea);

		orden.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MUESTRA EL TOTAL DE LAS LINEAS DE FACTURA
	 * 
	 **/

	public static Integer totalLineaFacturas() throws SQLException {
		Integer r = 0;
		// select count(fecha_compra)from linea_factura ;
		ConexionBD c = new ConexionBD();
		String sql = "select count(precio_linea) as total from linea_factura";
		ResultSet resultado = c.getConnection().createStatement().executeQuery(sql);
		if (resultado.next()) {
			r = resultado.getInt("TOTAL");
		}

		c.getConnection().close();
		return r;

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS BORRA LAS LINEAS DE FACTURA
	 * 
	 **/

	public static void deleteLineaFactura(int index) throws SQLException {

		String sql = "{ call PACK_LINEA_FACTURA.BORRAR_LINEA_FACTURA(?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MODIFICA LAS LINEAS DE FACTURA
	 * 
	 **/
	public static void updateLineaFactura(int index, Linea_Factura m) throws SQLException {

		String sql = "{ call PACK_FACTURA.MODIFICAR_FACTURA(?,?,?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.setInt(2, m.getCantidad());
		orden.setDouble(3, m.getPrecio_linea());

		orden.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS LISTA LAS LINEAS DE FACTURA CON FACTURAS
	 * 
	 **/

	public static List<Linea_Factura> lineasDeFactura(Integer id_factura) throws SQLException {
		List<Linea_Factura> res = new ArrayList<>();
		ConexionBD c = new ConexionBD();
		String sql = "select * from linea_factura where id_factura=" + id_factura;
		ResultSet resultado = c.getConnection().createStatement().executeQuery(sql);

		while (resultado.next()) {
			Linea_Factura l = new Linea_Factura();
			l.setCantidad(resultado.getInt("CANTIDAD"));
			l.setId_linea_factura(resultado.getInt("ID_LINEA_FACTURA"));
			l.setPrecio_linea(resultado.getDouble("PRECIO_LINEA"));
			res.add(l);
		}
		c.getConnection().close();

		return res;
	}
}
