package logic;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbm.ConexionBD;
import model.Ranking;

//la logica hace las operaciones CRUD
public class LogRanking {
	private static List<Ranking> listaRanking = new ArrayList<Ranking>();

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS LISTA DE RANKING
	 * 
	 **/

	public static List<Ranking> listarRanking() throws SQLException {
		listaRanking = new ArrayList<>();
		ConexionBD c = new ConexionBD();
		String sql = "select * from ranking";
		ResultSet resultado = c.getConnection().createStatement().executeQuery(sql);

		while (resultado.next()) {
			listaRanking.add(new Ranking(resultado.getInt("ID_RANKING"), resultado.getString("FECHA"),
					resultado.getDouble("DINERO_FACTURADO"), resultado.getDouble("COMISION")));
		}
		c.getConnection().close();

		return listaRanking;
	}

	

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS CREA RANKING
	 * 
	 **/

	public static void addRanking(Ranking m) throws SQLException {

		String fecha = m.getFecha();
		Double precio = m.getDinero_facturado();
		Double comision = m.getComision();
		String sql = "{ call PACK_RANKING.CREAR_RANKING(?,?,?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setString(1, fecha);
		orden.setDouble(2, precio);
		orden.setDouble(3, comision);
		orden.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS TOTAL DE RANKING
	 * 
	 **/

	public static Integer totalRanking() throws SQLException {
		Integer r = 0;
		// select count(fecha)from ranking ;
		ConexionBD c = new ConexionBD();
		String sql = "select count(fecha) as total from ranking";
		ResultSet resultado = c.getConnection().createStatement().executeQuery(sql);
		if (resultado.next()) {
			r = resultado.getInt("TOTAL");
		}

		c.getConnection().close();
		return r;

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS BORRAR RANKING
	 * 
	 **/
	public static void deleteRanking(int index) throws SQLException {

		String sql = "{ call PACK_RANKING.BORRAR_RANKING(?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.execute();

	}

	/*
	 * ESTE PETICION DE BASE DE DATOS NOS MODIFICA RANKING
	 * 
	 **/
	public static void updateRanking(int index, Ranking m) throws SQLException {

		String sql = "{ call PACK_RANKING.MODIFICAR_RANKING(?,?,?,?) }";
		ConexionBD c = new ConexionBD();
		CallableStatement orden = c.getConnection().prepareCall(sql);

		orden.setInt(1, index);
		orden.setString(2, m.getFecha());
		orden.setDouble(3, m.getDinero_facturado());
		orden.setDouble(4, m.getComision());
		orden.execute();

	}

}