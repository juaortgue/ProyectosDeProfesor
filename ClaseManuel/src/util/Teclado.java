package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Teclado {
	
	//recibe la pregunta a realizar por pantalla
	//para mostrartela, que tu le introduzcas un dato y el te lo devuelva casteado de string a double
	public static double leerDouble(String pregunta) {
		double respuesta = 0.0;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(pregunta);
		try {
			//readline() te pide que introduzcas un dato por teclado
			//Double.parseDouble() castea
			respuesta = Double.parseDouble(teclado.readLine());
		} catch (Exception e) {
			System.out.println("Error introduciendo valor.");
			e.printStackTrace();
		} 
		
		return respuesta;
	}
	public static int leerInt(String pregunta) {
		int respuesta = 0;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(pregunta);
		try {
			//readline() te pide que introduzcas un dato por teclado
			//Double.parseDouble() castea
			respuesta = Integer.parseInt((teclado.readLine()));
		} catch (Exception e) {
			System.out.println("Error introduciendo valor.");
			e.printStackTrace();
		} 
		
		return respuesta;
	}
	public static long leerLong(String pregunta) {
		long respuesta = 0;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(pregunta);
		try {
			//readline() te pide que introduzcas un dato por teclado
			//Double.parseDouble() castea
			respuesta = Long.parseLong((teclado.readLine()));
		} catch (Exception e) {
			System.out.println("Error introduciendo valor.");
			e.printStackTrace();
		} 
		
		return respuesta;
	}
	
	public static String leerString(String pregunta) {
		String respuesta = "";
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(pregunta);
		try {
			//readline() te pide que introduzcas un dato por teclado
			//Double.parseDouble() castea
			respuesta =(teclado.readLine());
		} catch (Exception e) {
			System.out.println("Error introduciendo valor.");
			e.printStackTrace();
		} 
		
		return respuesta;
	}
	
	//FUNCIONES
	/*
	 * Estructura --> visibilidad (public o private) -static o no poner nada- tipo de 
	 * dato que devuelve-nombre funcion - parametros dentro de ()
	 */
	/*FUNCIONES CON RETURN Y VOID*/
	public static int devolverNum() {
		int num =5;
		return num;
	}
	//void--> no voy a devolver nada
	public static void imprimirNumero() {
		int num =5;
		System.out.println(num);
	}
	//funcion con parametros devolviendo datos
	public static int sumarDosNumerosDevolviendolo(int a, int b) {
		int resultado = a+b;
		return resultado;
	}
	//funcion con parametros pero sin devolver nada
		public static void sumarDosNumerosSinDevolver(int a, int b) {
			int resultado = a+b;
			System.out.println("El resultado de la suma de "+a+" y "+b+" es "+resultado);
		}
		
	//NOMBRE DE FUNCIONES: empiezan en minuscula siendo un verbo y la siguiente
	//palabra que le precede empieza en mayusculas (Camel case)
		
		/*
		 * Pares- Realizar un programa en JAVA que lea dos números y me indique los
		 * números pares que hay entre ellos
		 */
		public static void paresEntreDosNumeros(int a, int b) {
			//ver los numeros pares entre 2 numeros dados e imprimirlos
			//a=5    y    b=6
			while(a<b) {//a<b=true
				a++;
				if(a%2==0) {//true
					System.out.println("El numero "+a+" es par");
				}else {
					System.out.println("El numero "+a+" es IMPAR");
				}
			}
			
		}
		

}
