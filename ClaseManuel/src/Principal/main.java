package Principal;

import util.Teclado;

public class main {

	public static void main(String[] args) {
		/*
		 * Teclado es una clase
		 */
		// int numIntroducido = Teclado.leerInt("dame un numero");
		/*
		 * final String pre ="Introduzca un número: "; Integer num1 =
		 * Teclado.leerInt(pre); if(num1%2==0) { System.out.println("El numero +"+num1+
		 * "ES PAR."); }else { System.out.println("El numero +"+num1+ "ES impar.");
		 * 
		 * }
		 */
		/*
		 * Ejercicio 4
		 * 
		 */
		/*
		 * Integer numx = Teclado.leerInt("Introduzca el primer numero:"); Integer numy
		 * = Teclado.leerInt("Introduzca el segundo número:"); numx=numx+1;
		 * while(numx<numy) {
		 * 
		 * if(numx%2==0) { System.out.println(numx); } numx++; }
		 */
		/*
		 * Ejercicio 5
		 * 
		 */
		/*
		 * Integer suma = 0; Integer producto = 1; for(int i=0;i<20;i++) { if(i%2==0) {
		 * suma = i+suma; }else { producto=i*producto; } } System.out.print(suma+"\n");
		 * System.out.print(producto+"\n");
		 */
		/*
		 * ejercicio 6 Integer resultado = dividir(20,10);
		 * System.out.println(resultado);
		 */

		// CONCATENAR STRING
		String saludar = "";
		System.out.println(saludar);
		saludar = saludar + "hola ";
		System.out.println(saludar);
		saludar = saludar + "mundo.";
		System.out.println(saludar);

		// ejercicio 10
		Integer n1 = 3;
		Integer n2 = 5;
		Integer i = 0;
		String concatenacion = "";
		while (i < n1) {
			concatenacion = concatenacion + n2;
			i++;
		}
		System.out.println(concatenacion);
		System.out.println("Ejercicio 11");
		System.out.println("ejercicio 13");
		Integer n = 2;
		Integer resultado = 0;
		String concatenacion2 = "";
		System.out.println("Tabla de multiplicar del " + n);
		for (int j = 0; j < 11; j++) {
			resultado = n * j;
			concatenacion2 = n + " X " + j + " = " + resultado;
			System.out.println(concatenacion2);
		}

		System.out.println("Ejercicio 14 potencia 2");
		Integer n14 = 5;
		Integer r14 = n14 * n14;
		System.out.println(r14);

		Integer potenciaConMath = (int) Math.pow(n14, 2);
		System.out.println(potenciaConMath);
		System.out.println("Ejercicio 17");
		Double r17 = ej17(0.0, 2.0, 7.0);
		System.out.println(r17);
	}

	public static Integer dividir(Integer x, Integer y) {
		Integer div = 0;
		div = x / y;
		return div;
	}

	public static Double ej17(Double a, Double b, Double c) {
		Double divisor = 0.0, dividendo = 0.0, resultado = 0.0;
		if(a==0) {
			resultado=0.0;
			System.out.println("El resultado en verdad es infinito.");
		}else {
			divisor = b*b-4*a*c;
			dividendo = 2*a;
			resultado = divisor/dividendo;
		}
		
		return resultado;
	}
	

}
