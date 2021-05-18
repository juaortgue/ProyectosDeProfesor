package controller;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

import logic.LogMarca;
import logic.LogRanking;
import model.Ranking;
import model.TextosApp;
import utils.Teclado;

public class ControllerRanking {

	/**
	 * ESTE MÉTODO LISTA LOS RANKING
	 */

	public static List<Ranking> listar(boolean ordenar) {
		List<Ranking> ls = null;
		try {
			ls = LogRanking.listarRanking();
			if (ordenar)
				ls.sort(Comparator.reverseOrder());
			if (ls.size() > 0) {
				for (int i = 0;i<ls.size();i++) {
					Ranking m = ls.get(i);
					System.out.println((i+1)+", "+
							"FECHA: " + m.getFecha() + ", DINERO FACTURADO " + m.getDinero_facturado() + ", COMISIÓN ");
				}
			} else {
				System.out.println(TextosApp.NOHAYRANKING);
			}
		} catch (SQLException e) {

			System.err.println(TextosApp.ERRORLISTA);
		}
		
		return ls;

	}

	/**
	 * ESTE MÉTODO BORRA LOS RANKING
	 */
	public static void borrar() {
		try {
			if (LogRanking.totalRanking() > 0) {
				System.out.println(TextosApp.ELEMENTOSBORRAR);
				List<Ranking> ls = listar(false);
				int index = Teclado.leerInt(TextosApp.NUMEROPARABORRAR);
				if (index == 0) {
					System.out.println(TextosApp.CANCELADO);
				} else {
					LogRanking.deleteRanking(ls.get(index-1).getId_ranking());
				}
			} else {
				System.out.println(TextosApp.NOHAYRANKING);
			}
		} catch (

		SQLException e) {
			System.err.println(TextosApp.ERRORTOTAL);
		}

	}

	/**
	 * ESTE MÉTODO TE CREA LOS RANKING
	 */

	public static void nuevo() {
		System.out.println(TextosApp.ANIADIRRANKING);
		String fecha = Teclado.leerString(TextosApp.FECHARANKING);
		Double dinero_facturado = Teclado.leerDouble(TextosApp.DINERORANKING);
		Double comision = Teclado.leerDouble(TextosApp.COMISIONRANKING);
		Ranking m = new Ranking(fecha, dinero_facturado, comision);
		try {
			LogRanking.addRanking(m);
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORRANKING);
		}
	}

	/**
	 * ESTE MÉTODO TE MODIFICA LOS RANKING
	 */

	public static void modificar() {
		System.out.println(TextosApp.EDITARRRANKING);
		List<Ranking> ls = listar(false);
		int index;
		index = Teclado.leerInt(TextosApp.SELECCIONE);
		String fecha = Teclado.leerString(TextosApp.FECHARANKING);
		Double dinero_facturado = Teclado.leerDouble(TextosApp.DINERORANKING);
		Double comision = Teclado.leerDouble(TextosApp.COMISIONRANKING);
		
		try {
			LogRanking.updateRanking(ls.get(index-1).getId_ranking(), new Ranking(fecha, dinero_facturado, comision));
		} catch (SQLException e) {
			System.err.println(TextosApp.ERRORMODIFICAR);

		}
		System.out.println(TextosApp.MODIFICAR);
	}

	
	/*
	 * ESTE METODO TE MUESTRA EL TOTAL DE RANKING
	 * 
	 **/
	public static void getTotalRanking() {
		try {
			System.out.println(TextosApp.TOTALRANKING + LogRanking.totalRanking());
		} catch (SQLException e) {

			System.err.println(TextosApp.ERROR);
		}
	}

}
