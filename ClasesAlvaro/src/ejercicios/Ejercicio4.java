package ejercicios;

import utils.Teclado;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * El usuario me dice numero de filas y columnas
		 * defino la matriz
		 * Con 2 bucles for la relleno de ceros
		 * 
		 */
		int filas = Teclado.leerInt("Digame las filas:" );
		int columnas = Teclado.leerInt("Digame las columnas:" );
		int matriz[][] = new int[filas][columnas];
		//recorremos las filas
		/*0 0 0
		 *0 0 0
		 *0 0 0
		 */
		for(int i = 0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				matriz[i][j]=0;
			}
			
		}
		for(int i = 0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
			
		}

	}

}
