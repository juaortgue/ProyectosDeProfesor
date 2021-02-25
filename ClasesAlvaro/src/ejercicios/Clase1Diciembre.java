package ejercicios;

import utils.Teclado;

public class Clase1Diciembre {

	public static void main(String[] args) {
int opcion = 0;
		

		do {
			mostrarMenu();
			opcion = Teclado.leerInt("Introduzca el numero: ");
			switch (opcion) {
			case 0:
				System.out.println("adios");
				break;
			case 1:
				esPrimo();
				break;
			case 2:
				campanadas();
				break;
			case 3:
				calcularMedia();
				break;
			case 4:
				
				break;
			default:
				System.out.println("Error");
			}
		} while (opcion != 0);

	}
	public static void mostrarMenu() {
		System.out.println("MENU");
		System.out.println("0. Salir");
		System.out.println("1. Es primo");
		System.out.println("2 campanadas ");
		System.out.println("3. MEDIAS");
		
	
	}
	public static void esPrimo() {
		boolean esP = true;
		int a = Teclado.leerInt("Introduzca numero para saber si es primo:");
		for(int i=2;i<a;i++) {
			if(a%i==0) {//SI ES DIVISIBLE ENTRE CUALQUIER NUMERO ANTERIOR AL INTRODUCIDO QUE NO SEA EL 1 Y EL MISMO
				//SIGNIFICA QUE NO ES PRIMO
				esP=false;
				break;//HACE QUE EL BUCLE SE CORTE
			}
		}
		if(esP) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
	}
	public static void campanadas() {
		int horaIntroducida = 0;
		do {
			horaIntroducida = Teclado.leerInt("Introduzca hora entre las 1 y las 12");

		}while(horaIntroducida<1 || horaIntroducida>12 );
		int totalCampanadas=0;
		//CALCULAR TOTAL DE CAMPANADAS SIN MEDIAS HORAS
		for(int hora =1; hora<=horaIntroducida;hora++) {
			if(hora==horaIntroducida) {
				totalCampanadas=totalCampanadas+hora;
			}else {
				totalCampanadas=totalCampanadas+hora+1;
			}
		}
		System.out.println("Total de campanadas="+totalCampanadas);
	}
	/*
	 * Pedir numeros para sumarlos y hacerle la media
	 * 
	 */
	public static void calcularMedia() {
		double numero;
		int numerosIntroducidos = 0;
		double suma = 0.0;
		do {
			numero = Teclado.leerDouble("1.Introduzca numero\n2.Introduzca negativo para hacer la media");
			if(numero>0) {
				suma=suma+numero;
				numerosIntroducidos++;
			}
		}while(numero>=0);
		double media = suma/numerosIntroducidos;
		System.out.println("La media es ="+media);
		
	}

	/*
	 * EJ2. Escriba un programa que pida al usuario una hora determinada, que
denominaremos h1, (pidiendo primero las horas expresadas en formado de 0 a 24
horas, y a continuación los minutos). Posteriormente se pedirá al usuario otra hora
h2. El programa deberá indicar si h1 es posterior o anterior a h2. En el caso de ser
posterior se mostrará por pantalla un mensaje y se indicará cuantas horas y minutos
han pasado, en caso de ser anterior se mostrará un mensaje similar y se indicará las
horas y minutos que faltan.
	 */
	public static void ej2Horas() {
		int h1 = Teclado.leerInt("Introduzca h1: ");
		int m1 = Teclado.leerInt("Introduzca minutos: ");
		int h2 = Teclado.leerInt("Introduzca h2:" );
		if(h1>h2) {
			int horas = h1-h2;
			System.out.println("horas="+horas+", minutos="+m1);
		}else {
			//pista: guardar las horas como minutos
		}
		
	}
}


