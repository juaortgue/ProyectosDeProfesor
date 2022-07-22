package principal;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		// variables
		int num = 1;
		Integer num2 = 1;
		double real = 1.1;
		Double real2 = 1.1;
		char caracter = 'a';
		boolean boleano = true;
		Boolean boleano2 = true;
		String cadena = "hola soy pepe";
		final String dni = "12345678A";
		System.out.println(dni);
		System.out.println(20 > 30);
		System.out.println(10 / 2);
		real2 = 50.2 / 3.1;
		System.out.println(real2);
		num = num + 1;
		num += 1;
		num++;
		num--;
		num -= 1;
		String aaaa = "hola" + "\npepe";
		System.out.println(aaaa);
		String nombre = "Felipe";
		System.out.println("Hola " + nombre);
		System.out.println("La longitud del nombre es de: " + nombre.length());
		System.out.println(nombre.charAt(0));
		System.out.println(nombre.charAt(nombre.length() - 1));
		System.out.println(nombre.toLowerCase());
		System.out.println(nombre.toUpperCase());

		// FECHAS
		LocalDate ahora = LocalDate.now();
		final LocalDate ejemplo2 = LocalDate.of(2022, 12, 22);
		System.out.println("Fecha actual ==> " + ahora);
		System.out.println(ahora.getDayOfMonth());
		System.out.println(ahora.getDayOfYear());
		System.out.println(ahora.getDayOfWeek());
		System.out.println(ahora.getMonth());
		System.out.println(ahora.getYear());
		// comparar fechas
		ahora.isBefore(ejemplo2);
		ahora.isAfter(ejemplo2);
		System.out.println(ahora.isBefore(ejemplo2));
		System.out.println(ahora.plusYears(1).getYear());
		ahora.minusYears(1);

		// localtime
		LocalTime tiempo = LocalTime.now();
		System.out.println(tiempo);
		System.out.println(tiempo.getHour());

		LocalTime tiempo2 = LocalTime.of(13, 15);
		System.out.println(tiempo2);

		// condicionales
		int edad = 17;
		String genero = "mujer";
		
		if (edad >= 18) {
			System.out.println("Puede entrar en la discoteca");
		} else if (genero.equalsIgnoreCase("mujer")) {
			System.out.println("Da igual, tu si entras.");
		} else {
			System.out.println("No puede");
		}
		if(1>2 || 0!=2) {
			System.out.println("Entra");
		}
		if(1>2 && 0!=2) {
			System.out.println("entra 2");
		}
		Integer a = 1;
		Integer b = 1;
		if(a.equals(b)) {
			System.out.println("A y B son iguales");
		}
		String y1 = "PEPE";
		String y2 = "pepe";
		if(y1.equals(y2)) {
			System.out.println("ENTRAAA3333");
		}
		if(y1.toLowerCase().equals(y2.toLowerCase())) {
			System.out.println("MISMO NOMBRE");
		}
		if(y1.equalsIgnoreCase(y2)) {
			System.out.println("MISMO NOMBRE2");
		}
		
		

	}

}
