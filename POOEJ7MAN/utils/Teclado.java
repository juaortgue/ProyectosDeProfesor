package utils;

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
		public static int segun() {
			/*creo una variable resultado int
			 * Leer a preguntando
			 * leer b preguntando
			 * si a<b sumo y guardo la suma en resultado
			 * a>=b multiplico y guardo la suma en resultado
			 * devuelvo variable resultado
			 * a>b  a==b
			 */
			int resultado=0,a=0,b=0;
			a=Teclado.leerInt("introduzca a");
			b=Teclado.leerInt("Introduzca b");
			if(a<b) {
				resultado=a+b;
			}else {
				resultado=a*b;
			}
			return resultado;
		}
		/*
		 * Veces- Realizar un programa en JAVA que lea dos números enteros por teclado.
	El primero nos dirá el número de veces que debe escribirse el segundo
	introducido.
		hacer un bucle que dure a veces
		en cada iteracion añado a la cadena el b

		 */
		public static String veces() {
			String resultado = "";
			int a=0;
			int b=0;
			a=Teclado.leerInt("Introduzca a");
			b=Teclado.leerInt("Introduzca b");
			for (int i = 0; i < a; i++) {
				resultado = resultado+b;
				//resultado="44"
			}
			return resultado;
			
		}
		/*
		 * Suma Función- Realizar un programa en JAVA que lea dos números enteros por
teclado y muestre la suma de ambos mediante una función.
		
		Creo a y b
		inicializo a y b
		leo a y b
		llamo a suma y le paso el a y b leidos, ella por dentro ya me lo sumara e imprimirá
		 */
		
		//suma recibe 2 numeros y muestra la suma
		public static void exponente(int base, int exponente) {
			int resultado = 1;
			//inicializo resultado a 1 porque si fuera un 0, en la primera multipl fallaria
			
			for(int i=0; i<exponente;i++) {
				resultado = resultado*base;
			}
			System.out.println(resultado);
		}
		
		/*
		 * Ordena3números- Realizar un programa en JAVA que lea tres números enteros
y los ordene de mayor a menor.
		 */
		
	
		public static int binarioToDecimal(int n) {
			int r = 0;
			/*
			 * voy cogiendo el ultimo caracter del numero y le sumo al resultado 2^posicion
			 */
			int exponente = 0;
			while(n!=0) {
				if(n%10==1) {
					r = (int) (r+Math.pow(2, exponente));
				}
				n = n/10;
				exponente++;
			}
			return r;
		}
		public static long calcularSumaCuadrados(int n ) {
			long resultado = 0l;
			for (int i = 0; i < n+1; i++) {
				int cuadrado = i*i;
				resultado = resultado+cuadrado;
				
			}
			return resultado;
		}
	
		

}
