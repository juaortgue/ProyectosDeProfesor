package ejercicios;

import utils.Teclado;

public class Arrays {

	public static void main(String[] args) {
		// Para crear un array le tienes que decir la cantidad de cajones
		// osea la dimension
		int arrayEnteros[] = new int[4];
		// asignamos a cada cajon un numero
		arrayEnteros[0] = 1;
		arrayEnteros[1] = 2;
		arrayEnteros[2] = 3;
		arrayEnteros[3] = 4;
		System.out.println("cajon 0 del array-> " + arrayEnteros[0]);
		System.out.println("cajon 1 del array-> " + arrayEnteros[1]);
		System.out.println("cajon 2 del array-> " + arrayEnteros[2]);
		System.out.println("cajon 3 del array-> " + arrayEnteros[3]);
		// no te puedes pasar del indice, da error
		// System.out.println("Cajon que no existe --> "+arrayEnteros[4]);
		String p = "hola";
		String arrayPalabras[] = new String[2];
		arrayPalabras[0] = "Primera";
		arrayPalabras[1] = "segunda";
		System.out.println("Primera palabra es: " + arrayPalabras[0]);
		arrayPalabras[0] = "palabra cambiada";
		System.out.println("Primera palabra es: " + arrayPalabras[0]);

		// Rellenar un array con los numeros del 1 al 10
		int nums[] = new int[15];

		for (int i = 0; i < 10; i++) {
			nums[i] = i;
			System.out.print(nums[i] + ", ");
		}
		/*
		 * ¿Cómo se hasta que vagón tengo que rellenar? Los arrays tienen una propiedad
		 * llamada lenght que indica su dimension
		 */
		System.out.println("\nLongitud del array nums = " + nums.length);
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
			System.out.print(nums[i] + ", ");
		}

		// Ejercicio 1 rellenar los 20 vagones del tren con los numeros pares
		// del 1 al 20
		int numPares[] = new int[20];
		// bucle para rellenar
		for (int i = 0; i < numPares.length; i++) {
			numPares[i] = i * 2;

		}
		// bucle para leer
		for (int i = 0; i < numPares.length; i++) {
			System.out.println("Posicion " + i + " = " + numPares[i]);
		}
		// ejercicio 2: pedir al usuario 4 numeros para meterlos en 4 vagones
		double arrayEjercicio2[] = new double[4];
		double nLeido = 0;
		for (int i = 0; i < arrayEjercicio2.length; i++) {
			nLeido = Teclado.leerDouble("Introduzca el numero ");
			arrayEjercicio2[i] = nLeido;
		}
		//mostrar informacion
		//for
		for (int i = 0; i < arrayEjercicio2.length; i++) {
			System.out.println(arrayEjercicio2[i]);
		}
	}

}
