package ejercicios;

import utils.Teclado;

public class Arrays2 {

	public static void main(String[] args) {
		//ejercicio 3
		int array[] = new int[4];
		int numLeido = 0;
		//rellenamos
		for(int i=0;i<array.length;i++) {
			numLeido = Teclado.leerInt("Introduzca un numero");
			array[i]=numLeido;
		}
		for(int i= array.length-1;i>=0;i--) {
			System.out.println("POSICION "+i);
			System.out.println("Valor-->"+array[i]);
		}
		

	}

}
