package ejercicios;

import utils.Teclado;

public class Ejercicio5Arrays {

	public static void main(String[] args) {
		int array [] = new int[10];
		int nLeido = Teclado.leerInt("Introduzca numero: ");
		for(int i=0; i<array.length;i++) {
			array[i] = nLeido*nLeido;
			nLeido=nLeido+1;
			System.out.print(array[i]+", ");
		}

	}

}
