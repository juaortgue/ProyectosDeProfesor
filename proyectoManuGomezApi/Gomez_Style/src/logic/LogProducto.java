package logic;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbm.ConexionBD;
import model.Marca;
import model.Producto;
import model.Tipo_Producto;

//la logica hace las operaciones CRUD
public class LogProducto {
	private static List<Producto> listaProductos = new ArrayList<Producto>();

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS LISTA LOS PRODUCTOS
	 * 
	 **/

	public static List<Producto> listarProductos() throws SQLException {
		listaProductos = new ArrayList<>();
		ConexionBD c = new ConexionBD();
		String sql = "SELECT ID_PRODUCTO,PRODUCTO.NOMBRE,PRECIO,TALLA,SEXO,IVA,DESCUENTO,PRODUCTO.ID_TIPO_PRODUCTO,\r\n"
				+ "PRODUCTO.ID_MARCA,MARCA.NOMBRE AS MARCA_NOMBRE,TIPO_PRODUCTO.NOMBRE AS NOMBRE_TIPO\r\n"
				+ "FROM producto,marca,tipo_producto\r\n" + "where producto.id_marca = marca.id_marca";
		ResultSet resultado = c.getConnection().createStatement().executeQuery(sql);

		while (resultado.next()) {

			Producto nuevo = new Producto();
			nuevo.setId_producto(resultado.getInt("ID_PRODUCTO"));
			nuevo.setNombre(resultado.getString("NOMBRE"));
			nuevo.setPrecio(resultado.getDouble("PRECIO"));
			nuevo.setTalla(resultado.getString("TALLA"));
			nuevo.setSexo(resultado.getString("SEXO"));
			nuevo.setIva(resultado.getDouble("IVA"));
			nuevo.setDescuento(resultado.getDouble("DESCUENTO"));
			Marca m = new Marca();
			m.setId_marca(resultado.getInt("ID_MARCA"));
			m.setNombre(resultado.getString("MARCA_NOMBRE"));
			nuevo.setMarca(m);
			Tipo_Producto tp = new Tipo_Producto();
			tp.setId_tipo_producto(resultado.getInt("ID_TIPO_PRODUCTO"));
			tp.setNombre(resultado.getString("NOMBRE_TIPO"));
			nuevo.setTipo_producto(tp);
			listaProductos.add(nuevo);
		}
		c.getConnection().close();

		return listaProductos;
	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MUESTRA LOS PRODUCTOS
	 * 
	 **/
	public static Producto getProducto(int index) throws SQLException {
		Producto r = new Producto();
		ConexionBD c = new ConexionBD();
		String sql = "select * from producto where ID_PRODUCTO=" + index;
		ResultSet resultado = null;
		ResultSet s = c.getConnection().createStatement().executeQuery(sql);
		while (s.next()) {
			r.setId_producto(resultado.getInt("ID_PRODUCTO"));
			r.setNombre(resultado.getString("NOMBRE"));
			r.setPrecio(resultado.getDouble("PRECIO"));
			r.setTalla(resultado.getString("TALLA"));
			r.setSexo(resultado.getString("SEXO"));
			r.setIva(resultado.getDouble("IVA"));
			r.setDescuento(resultado.getDouble("DESCUENTO"));
			// r.setMarca(resultado.getString("ID_MARCA"));
			// r.setTipo_producto(resultado.getString("TIPO_PRODUCTO"));

			c.closeConnection();
		}

		return r;
	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS CREA LOS PRODUCTOS
	 * 
	 **/
	public static void addProducto(Producto producto) throws SQLException {
		String nombre = producto.getNombre().toUpperCase();
		String sql = "{ call PACK_PRODUCTO.CREAR_PRODUCTO(?,?,?,?,?,?,?,?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setString(1, producto.getNombre().toUpperCase());
		orden.setDouble(2, producto.getPrecio());
		orden.setString(3, producto.getTalla().toUpperCase());
		orden.setString(4, producto.getSexo().toUpperCase());
		orden.setDouble(5, producto.getIva());
		orden.setDouble(6, producto.getDescuento());
		orden.setInt(7, producto.getMarca().getId_marca());
		orden.setInt(8, producto.getTipo_producto().getId_tipo_producto());
		orden.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MUESTRA EL TOTAL DE LOS PRODUCTOS
	 * 
	 **/
	public static Integer totalProductos() throws SQLException {
		Integer r = 0;
		// select count(nombre)from producto ;
		ConexionBD c = new ConexionBD();
		String sql = "select count(nombre) as total from producto";
		ResultSet resultado = c.getConnection().createStatement().executeQuery(sql);
		if (resultado.next()) {
			r = resultado.getInt("TOTAL");
		}

		c.getConnection().close();
		return r;

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS BORRA LOS PRODUCTOS
	 * 
	 **/

	public static void deleteProducto(int index) throws SQLException {

		String sql = "{ call PACK_PRODUCTO.BORRAR_PRODUCTO(?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.execute();
	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MODIFICA LOS PRODUCTOS
	 * 
	 **/

	public static void updateProducto(int index, Producto m) throws SQLException {

		String sql = "{ call PACK_PRODUCTO.MODIFICAR_PRODUCTO(?,?,?,?,?,?,?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement statement = c.getConnection().prepareCall(sql);

		statement.setInt(1, index);
		statement.setString(2, m.getNombre().toUpperCase());
		statement.setDouble(3, m.getPrecio());
		statement.setString(4, m.getTalla().toUpperCase());
		statement.setString(5, m.getSexo().toUpperCase());
		statement.setDouble(6, m.getIva());
		statement.setDouble(7, m.getDescuento());
		statement.execute();

	}
}
