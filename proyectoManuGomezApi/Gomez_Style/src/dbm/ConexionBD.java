package dbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	private  Connection conn;
	
	
	public ConexionBD() {
		String DB_HOST = "localhost";
		String DB_PORT = "1521";
		String DB_BBDD = "XE";

		String DB_USER = "GOMEZ_STYLE";
		String DB_PASS = "GOMEZ_STYLE";

		String DB_URL = "jdbc:oracle:thin:@" + DB_HOST + ":" + DB_PORT + ":" + DB_BBDD;
		
		try {
			/*
			 * DriverManager: this class is used to register driver for a specific database
			 * type (e.g. MySQL in this tutorial) and to establish a database connection
			 * with the server via its getConnection() method.
			 */
			/*
			 * Connection: this interface represents an established database connection
			 * (session) from which we can create statements to execute queries and retrieve
			 * results, get metadata about the database, close connection, etc.
			 */
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			System.out.println("Conexión establecida con éxito !");
			
		} catch (SQLException sqle) {
			System.err.println("No se ha podido establecer la conexión.");
			System.err.println("Motivo: " + sqle.getMessage());
			conn=null;
		}
	}
	
	public Connection getConnection() {
		return conn;
	}
	public void closeConnection() {
		try {
			conn.close();
			System.out.println("Conexión cerrada con éxito");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Conexión cerrada SIN EXITO");
		}
	}
}
