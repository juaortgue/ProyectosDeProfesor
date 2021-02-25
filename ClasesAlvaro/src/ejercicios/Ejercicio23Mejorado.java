package ejercicios;

import utils.Teclado;

public class Ejercicio23Mejorado {

	public static void main(String[] args) {
		
		boolean errorDato=false;
		int numero = 0;
		//ES UN TIPO DE BUCLE DISEÑADO PARA LEER DATOS Y REPETIRSE SI Y SOLO SI HAY UN ERROR EN ELLOS
		numero = Teclado.leerInt("Introduzca un numero binario");
		int resultado = Teclado.binarioToDecimal(numero);
		System.out.println("EL NUMERO EN BINARIO ES "+numero+"\nEL NUMERO DECIMAL ES "+resultado);
	}

}
