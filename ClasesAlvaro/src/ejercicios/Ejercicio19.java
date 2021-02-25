package ejercicios;

import utils.Teclado;

public class Ejercicio19 {

	public static void main(String[] args) {
		/*
		 * Operaciones - Realizar un programa en JAVA que lea dos números enteros por
teclado y calcule su suma, su resta, su producto y su cociente cuando fuera
posible.
		 */
		int suma=0, division=0, resta=0, cociente=0;
		int a = Teclado.leerInt("Introduzca primer numero: ");
		int b = Teclado.leerInt("Introduzca segundo numero: ");
		//¿en la suma hay alguna restriccion?
		//0+0, 0+1
		suma=a+b;
		//resta
		//0-0, (-4) - (-5) 
		resta = a-b;
		
		//multiplicacion
		//0*2=0
		//0*0 = 0
		cociente= a*b;
		//division
		//si a/b si b es 0 da error si a es 0 0 tartas entre 10 personas a 0 tartas x persona
		System.out.println("Primer número = "+a);
		System.out.println("Segundo número = "+b);

		if(b!=0) { // if(!(a==0))
			division = a/b;
			System.out.println("suma="+suma);
			System.out.println("resta="+resta);
			System.out.println("division="+division);
			System.out.println("cociente="+cociente);
		}else {
			System.out.println("suma="+suma);
			System.out.println("resta="+resta);
			System.out.println("division= No se puede debido al cociente.");
			System.out.println("cociente="+cociente);
		}
		
		
		

	}

}
