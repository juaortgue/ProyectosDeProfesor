package Principal;

import util.Teclado;

public class Ejercicio42 {

	public static void main(String[] args) {
		
		Integer opcion=0;
		Integer salida = 3;
		do {
			mostrarMenu();
			opcion=Teclado.leerInt("Introduzca un numero:");
			switch(opcion) {
			case 1:
				Double cent = Teclado.leerDouble("Introduzca Centigrados:");
				Double result = gradosFa(cent);
				System.out.println(result);
				break;
			case 2:
				Double fa = Teclado.leerDouble("Introduzca Far:");
				Double result2 = faGrados(fa);
				System.out.println(result2);
				break;
			case 3:
				salir();
				break;
			default:
				opcionErronea();
				
			}
			
		}while(opcion!=salida);

	}
	public static void mostrarMenu() {
		final String pregunta = "Menú\n1.Pasar de centigrados a F"
				+"\n2. Pasar de F a centigrados\n3.Salir";
		System.out.println(pregunta);
	}
	public static void salir() {
		System.out.println("Hasta luego veuvla pronto!!");
	}
	public static void opcionErronea() {
		System.out.println("Elija otra opción miarma.");
	}
	public static Double gradosFa(Double cent) {
		return (9/5)*cent+32;
	}
	public static Double faGrados(Double fa) {
		
		return (5.0/9.0)*(fa-32);
	}

	
}
