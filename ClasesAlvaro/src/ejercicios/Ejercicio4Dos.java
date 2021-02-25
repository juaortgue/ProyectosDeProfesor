package ejercicios;

import utils.Teclado;

public class Ejercicio4Dos {
	public static void main(String[] args) {
		/*
		 * El usuario me dice numero de filas y columnas defino la matriz Con 2 bucles
		 * for la relleno de ceros
		 * 
		 */
		int filas = Teclado.leerInt("Digame las filas:");
		int columnas = Teclado.leerInt("Digame las columnas:");
		int matriz[][] = new int[filas][columnas];
		// recorremos las filas
		/*
		 * 0 0 0 0 0 0 0 0 0
		 */
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = 0;
			}

		}
		System.out.println("MATRIZ 1");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();

		}
		filas = Teclado.leerInt("Digame las filas:");
		columnas = Teclado.leerInt("Digame las columnas:");
		int matriz2[][] = new int[filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = 5;
			}

		}
		System.out.println("MATRIZ 1");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println("Matriz 2");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
			if(matriz[0].length==matriz2.length) {
				System.out.println("Se puede sumar las matrices");
				System.out.println("Matriz suma");
				filas = matriz.length;
				columnas = matriz2[0].length;
				int matrizResultado[][] = new int[filas][columnas];
				for (int a = 0; a < filas; a++) {
					for (int b = 0; b < columnas; b++) {
						matrizResultado[a][b] = matriz[a][b]+matriz2[a][b];
					}

				}
				for (int a = 0; a < filas; a++) {
					for (int b = 0; b < columnas; b++) {
						matrizResultado[a][b] = matriz[a][b]+matriz2[a][b];
						System.out.print(matriz[a][b] + " ");
					}
					System.out.println();
					
				}
			}else {
				System.out.println("No se pueden sumar las matrices");
			}
		}

	}
}
