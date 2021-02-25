package ejercicios;

import java.time.Year;

import utils.Teclado;

public class Clase0312 {

	public static void main(String[] args) {
		
		int opcion;
		do {
			menu();
			opcion = Teclado.leerInt("");
			switch (opcion) {
			case 0:
				salir();
				break;
			case 1:
				sumar();
				break;
			case 2:
				resta();
				break;
			case 3:
				multiplicar();
				break;
			case 4:
				dividir();
				break;
			case 5:
				resto();
				break;
			case 6:
				esPrimo();
				break;
			case 7:
				esPerfecto();
			case 8:
				leerMuchosNumeros();
				break;
			case 9:
				triangulo();
				break;
			case 10:
				calcularAnyoCorrecto();
				break;

			default:
				error();
			}

		} while (opcion != 0);

	}

	private static void calcularAnyoCorrecto() {
		/*P9. Realizar un programa que lea una fecha en forma numérica (día: 23, mes: 10,
año: 1998), y diga si es correcta o no. Por ejemplo: 30 2 1992 no es correcta*/
		int dia = Teclado.leerInt("Introduzca dia");
		int mes = Teclado.leerInt("Introduzca mes");
		int anyo = Teclado.leerInt("Introduzca anyo");
		//comprobamos si el año es incorrecto
		int anyoActual = 2020;
		if(anyo>0 && anyo<anyoActual) {
			System.out.println("Año correcto");
		}else {
			System.out.println("Año incorrecto");
		}
		if(mes>0 && mes<12) {
			System.out.println("Mes correcto");
		}else {
			System.out.println("Mes incorrecto");
		}
		//mes de 31 dias
		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			if(!(dia>0 && dia<=31)) {
				System.out.println("EL DIA DEBE ESTAR ENTRE 0 Y 31");
			}
		}
		if(mes==4 || mes==6 || mes==9 || mes==11) {
			if(!(dia>0 && dia<=30)) {
				System.out.println("El dia debe estar entre 0 y 30");
			}	
		}
		if(mes==2) {
			if(!(dia>0 && dia<=28)) {
				System.out.println("El dia debe estar entre 0 y 28");
			}
		}
		
	}

	private static void triangulo() {
		/*
		 * P8. Realizar un programa que lea la longitud de los lados de un triángulo, A B y C, y
que devuelva de qué tipo es, sabiendo que:
 si A2 = B2 + C2 es rectángulo (tiene un ángulo recto)
 si A2 < B2 + C2 es acutángulo (todos sus ángulos son agudos)
 si A2 > B2 + C2 es obtusángulo (tiene un ángulo obtuso)

		 */
		int a=Teclado.leerInt("Introduzca A");
		int b=Teclado.leerInt("Introduzca B");
		int c=Teclado.leerInt("Introduzca C");
		if(a==(b+c)) {
			System.out.println("Es rectangulo");
		}else if(a<b+c) {
			System.out.println("Acutangulo");
		}else {
			System.out.println("Obtusangulo");
		}
		
	}

	private static void leerMuchosNumeros() {
		/*
		 * P6. Realizar un programa que lea una serie de números distintos de cero,
devolviendo su suma y el número de sumandos (el valor cero señalará el final de la
serie).
		 */
		int num=0;
		int suma = 0;
		int cantidadNumeros=0;
		do {
			num=Teclado.leerInt("Introduzca un numero o el 0 para salir:");
			if(num!=0) {
				cantidadNumeros=cantidadNumeros+1;
			}
			
			suma = suma+num;
		}while(num!=0);
		System.out.println("La suma de los numeros es = "+suma);
		System.out.println("La cantidad de sumandos es = "+cantidadNumeros);
	}
	

	private static void error() {
		// TODO Auto-generated method stub
		System.out.println("Opción erronea.");

	}

	private static void salir() {
		System.out.println("Has salido del menu.");

	}

	private static void sumar() {
		int a = Teclado.leerInt("Introduzca primer numero:");
		int b = Teclado.leerInt("Introduzca el segundo numero:");
		System.out.println("La suma de " + a + " + " + b + " = " + (a + b));
	}

	private static void resta() {
		int a = Teclado.leerInt("Introduzca primer numero:");
		int b = Teclado.leerInt("Introduzca el segundo numero:");
		System.out.println("La resta de " + a + " - " + b + " = " + (a - b));

	}

	private static void multiplicar() {
		int a = Teclado.leerInt("Introduzca primer numero:");
		int b = Teclado.leerInt("Introduzca el segundo numero:");
		System.out.println("La resta de " + a + " * " + b + " = " + (a * b));

	}

	private static void dividir() {
		int a = Teclado.leerInt("Introduzca primer numero:");
		int b = Teclado.leerInt("Introduzca el segundo numero:");
		if (b == 0) {
			System.out.println("El dividendo no puede ser 0");

		} else {
			System.out.println("La division de " + a + " / " + b + " = " + (a / b));

		}

	}

	private static void resto() {
		int a = Teclado.leerInt("Introduzca primer numero:");
		int b = Teclado.leerInt("Introduzca el segundo numero:");
		if (b == 0) {
			System.out.println("El resto no puede ser 0");

		} else {
			System.out.println("La division de " + a + " % " + b + " = " + (a % b));

		}

	}

	public static void menu() {
		System.out.println("0.Salir");
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5.Resto");
		System.out.println("6. EsPrimo");
		System.out.println("7. EsPerfecto");
		System.out.println("8. Introducir muchos numeros");
		System.out.println("9.Angulos de un triangulo");
		System.out.println("10. Calcular año correcto");
	}
	/*
	 * P3. Escriba un programa que pida dos números por teclado y muestre el
	 * siguiente menú por pantalla: 1. Suma. 2. Resta. 3. Multiplicación. 4.
	 * División. 5. Resto. Elija opción: Cuando se pulse una de las opciones el
	 * programa deberá hacer la operación indicada con los dos números leídos.
	 * Restricciones del programa: Si se elige una opción no contemplada, se deberá
	 * mostrar un mensaje de error. La salida por pantalla debe cumplir el siguiente
	 * formato: numero1 operador numero2 = resultado. Es decir, si se han leído por
	 * teclado un 8 y un 5 y se ha elegido la opción 3, la salida por pantalla debe
	 * ser: 8 * 5 = 40. Del mismo modo también deberá controlar los posibles errores
	 * en las operaciones, mostrando un mensaje de error en dicho caso. Por ejemplo,
	 * si se produce un error en la división, el programa deberá mostrar un mensaje
	 * de error y finalizar.
	 */

	public static void esPerfecto() {
		int num = Teclado.leerInt("Introduzca numero");
		int suma = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				suma = suma + i;
			}
		}
		if (suma == num) {
			System.out.println("Es perfecto");
		} else {
			System.out.println("No es perfecto");
		}
	}

	public static void esPrimo() {
		int num = Teclado.leerInt("Introduzca numero");
		boolean esPrimo = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				esPrimo = false;
			}
		}
		System.out.println("¿Es primo?" + esPrimo);

	}

}
