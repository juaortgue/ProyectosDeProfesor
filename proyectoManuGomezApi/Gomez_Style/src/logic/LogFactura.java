package logic;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbm.ConexionBD;
import model.Cliente;
import model.Factura;
import model.Linea_Factura;

public class LogFactura {
	private static List<Factura> listaFacturas = new ArrayList<Factura>();

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS LISTA LAS FACTURAS
	 * 
	 **/

	public static List<Factura> listarFacturas() throws SQLException {
		listaFacturas = new ArrayList<>();
		ConexionBD c = new ConexionBD();
		String sql = "select factura.id_factura,factura.precio_total,factura.fecha_compra,factura.id_cliente,cliente.nombre as NOMBRE_CLIENTE \r\n"
				+ "from factura,linea_factura ,cliente\r\n" + "where factura.id_factura=linea_factura.id_factura \r\n"
				+ "and factura.id_cliente=cliente.id_cliente";

		ResultSet resultado = c.getConnection().createStatement().executeQuery(sql);

		while (resultado.next()) {
			Factura f = new Factura();
			f.setId_factura(resultado.getInt("ID_FACTURA"));
			f.setPrecio_total(resultado.getDouble("PRECIO_TOTAL"));
			f.setFecha_compra(resultado.getString("FECHA_COMPRA"));
			Cliente cl = new Cliente();
			cl.setId_cliente(resultado.getInt("ID_CLIENTE"));
			cl.setNombre(resultado.getString("NOMBRE_CLIENTE"));
			f.setCliente(cl);
			List<Linea_Factura> ls = LogLineaFactura.lineasDeFactura(f.getId_factura());
			f.setLineas(ls);
			listaFacturas.add(f);
		}
		c.getConnection().close();

		return listaFacturas;
	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MUESTRA FACTURA
	 * 
	 **/

	public static Factura getFactura(int index) throws SQLException {
		Factura r = new Factura();
		ConexionBD c = new ConexionBD();
		String sql = "select * from factura where ID_FACTURA=" + index;
		ResultSet resultado = null;
		ResultSet s = c.getConnection().createStatement().executeQuery(sql);
		while (s.next()) {
			r = new Factura(s.getInt("ID_FACTURA"), s.getDouble("PRECIO_TOTAL"), s.getString("FECHA_COMPRA"));
			c.closeConnection();
		}

		return r;
	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS CREA FACTURAS
	 * 
	 **/
	public static void addFactura(Factura m) throws SQLException {
		String sql = "{ call PACK_FACTURA.CREAR_FACTURA(?,?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setDouble(1, m.getPrecio_total());
		orden.setString(2, m.getFecha_compra());

		orden.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS DA EL TOTAL FACTURAS
	 * 
	 **/
	public static Integer totalFacturas() throws SQLException {
		Integer r = 0;
		// select count(fecha_compra)from factura ;
		ConexionBD c = new ConexionBD();
		String sql = "select count(fecha_compra) as total from factura";
		ResultSet resultado = c.getConnection().createStatement().executeQuery(sql);
		if (resultado.next()) {
			r = resultado.getInt("TOTAL");
		}

		c.getConnection().close();
		return r;

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS BORRA FACTURAS
	 * 
	 **/

	public static void deleteFactura(int index) throws SQLException {

		String sql = "{ call PACK_FACTURA.BORRAR_FACTURA(?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MODIFICA FACTURAS
	 * 
	 **/

	public static void updateFactura(int index, Factura m) throws SQLException {

		String sql = "{ call PACK_FACTURA.MODIFICAR_FACTURA(?,?,?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.setDouble(2, m.getPrecio_total());
		orden.setString(3, m.getFecha_compra());

		orden.execute();

	}

}