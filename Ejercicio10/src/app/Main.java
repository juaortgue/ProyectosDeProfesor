package app;

import model.Calculadora;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ejercicio 10 - " + "Calculadora casting y reescritura de m�todos");
		Calculadora c1 = new Calculadora(10.0);
		Double r = c1.dividir(3.0);
		System.out.println(r);
	}

}
