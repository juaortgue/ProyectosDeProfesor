package ejercicios;

import utils.Teclado;

public class Ejercicio23 {

	public static void main(String[] args) {
		/*
		 * Binario a Decimal - Realizar un programa en JAVA que lea un número Binario de
		 * 5 cifras por teclado y mediante una función calcule el número decimal a que
		 * equivale.
		 */
		/*
		 * leemos el numero como un string, comprobamos que la longitud es 5,si no lo damos un error
		 * luego vemos que el string solo tiene 1s y 0s
		 */
		String numBinario = "";
		boolean errorDato = false;//evalua una condicion boolean
		while(errorDato==false) {//ten cuidado porque la primera iteracion del while debe hacerse
			//VAMOS A COMPROBAR QUE LA LONGITUD ES DE 5
			numBinario = Teclado.leerString("Introduzca un número binario de 5 cifras: ");
			if(numBinario.length()!=5) {//11a11
				System.out.println("Error, la longitud debe ser 5");
				errorDato=false;
			}else {//11a11
				//comprobamos si alguna posicion es distinta de cero y uno
				//si es distinta errorDato==false y notificar del error
				errorDato=true;
				//vamos a ir comparando de uno en uno la cadena //11a11
				for (int i = 0; i < numBinario.length(); i++) {//la funcion lenght() te dice la longitud del string
					if(numBinario.charAt(i)!='0' && numBinario.charAt(i)!='1') {
						//charAt es una funcion de los string que me permite acceder a la letra contenida
						//en una posicion en concreto de la cadena
						System.out.println("Error, el numero solo debe contener 0s y 1s");
						errorDato=false;
						break;
					}
					
				}
			}
			
		}//si estamos fuera del while significa que el dato es CORRECTO!!!!1
		

	}
	

}
