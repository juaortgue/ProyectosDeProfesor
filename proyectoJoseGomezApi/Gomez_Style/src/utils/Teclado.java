package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Teclado {
	
	public static double leerDouble (String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		double respuesta = 0.0;
		
		System.out.print(pregunta);
		
		try {
			respuesta = Double.parseDouble( teclado.readLine() );
		} catch (Exception e) {
			System.err.println("Error introduciendo valor.");
		}
				
		return respuesta;
	}
	
	public static int leerInt (String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		int respuesta = 0;
		
		System.out.print(pregunta);
		
		try {
			respuesta = Integer.parseInt( teclado.readLine() );
		} catch (Exception e) {
			System.err.println("Error introduciendo valor.");
		}
				
		return respuesta;
	}
	
	public static String leerString (String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = "";
		
		System.out.print(pregunta);
		
		try {
			respuesta = teclado.readLine();
		} catch (Exception e) {
			System.err.println("Error introduciendo valor.");
		}
				
		return respuesta;
	}

}
