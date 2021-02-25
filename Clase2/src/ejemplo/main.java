package ejemplo;

import util.Teclado;

public class main {

	public static void main(String[] args) {
		
		/*
		 * A mi me dan un numero
		 * Miro si es par con su modulo, si da 0 es que es par, si no es impar
		 * 
		 */
		
		//Evalua dentro de los parentesis una condicion que da verdad o falso, eje 2==2 2>3
		//si es verdadero se hace lo de dentro del if
		//si es falso no
		int n;
		
		/*n=Teclado.leerInt("deme un num");
		if(n%2==0) {
			System.out.println("El número ");
		}else {
			System.out.println("No es par");
		}*/
		//paso de parametros con return
		n= Teclado.sumarDosNumerosDevolviendolo(13, 26);
		System.out.println("El numero de la operacion es -->"+n);
		//paso de parametros sin return
		Teclado.sumarDosNumerosSinDevolver(10, 5);
		
		//El while "mientras" recibe una condicion que es booleana y mientras sea cierta
		//va a seguir repitiendose todo el codigo que tiene entre llaves
		boolean comparacion = 5%2==0;
		System.out.println(comparacion);
		int contador = 0;
		/*while(contador<5) {
			contador++;
			System.out.println(contador);
		}*/
		Teclado.paresEntreDosNumeros(2, 6);
		
	}

}
