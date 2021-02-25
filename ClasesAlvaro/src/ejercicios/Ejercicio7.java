package ejercicios;

import utils.Teclado;

public class Ejercicio7 {

	public static void main(String[] args) {
		int tam = 10;
		int max=0,min=0;
		int posicionMax=0, posicionMin=0;
		double media = 0.0;
		double suma = 0.0;
		int array[] = new int[tam];
		int opcion = -1;
		for (int i = 0; i < array.length; i++) {
			array[i] = Teclado.leerInt("Introduzca un valor");
		}
		// media
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		media = suma/array.length;
		System.out.println("Media = "+media);
		max = array[0];
		min=array[0];
		// max
		for (int i = 0; i < array.length; i++) {
			if(array[i]>max) {
				max = array[i];
				posicionMax=i;
			}
			if(array[i]<min) {
				min=array[i];
				posicionMin=i;
			}
		}
		System.out.println("Maximo = "+max);
		System.out.println("Mínimo = "+min);
		System.out.println("Posicion min = "+posicionMin);
		System.out.println("posicion max = "+posicionMax);
	}

}
