
package Principal;

import util.Teclado;

public class Main {

	public static void main(String[] args) {
		
		int trenecito2[]= new int[4];
		trenecito2[0]=4;
		System.out.println(trenecito2[0]);
		int nNotas = Teclado.leerInt("numero de notas:");
		int notaPedida = 0;
		int sumaNotas [] = new int[nNotas];
		//Bucle de guardar datos
		for(int i =0;i<nNotas;i++) {
			notaPedida = Teclado.leerInt("Introduzca la nota nº"+(i+1));
			sumaNotas[i]=notaPedida;
		}
		//Bucle de mostrar datos
		System.out.println("Notas obtenidas:");
		for(int i =0;i<nNotas;i++) {
			System.out.print(sumaNotas[i]+", ");
		}
		
		//Calcular la nota media
		int suma =0;
		for(int i =0; i<nNotas;i++) {
			suma+=sumaNotas[i];
		}
		System.out.println("Su media es = "+(suma/nNotas));
		
		

	}

	

}
