package app;

import model.Disco;
import model.Libro;
import model.Revista;

public class Start {

	public static void main(String[] args) {

		iniciarAplicacion();

		
	}
	public static void iniciarAplicacion() {
		Revista r = new Revista("123", "pepe MOLINA", "Mi burrito sabanero", 1984);
		System.out.println(r);
		Libro l = new Libro("333", "Laura Gallego", "El valle de los lobos", 2000);
		Disco d = new Disco("888", "David", "Mi inspiracion 2.0", 1999);
		System.out.println(l.estaPrestado());
		l.prestar();
		System.out.println(l.estaPrestado());
		l.devolver();
		System.out.println(l.estaPrestado());
		System.out.println("Probar prestamos y consultas");
		Libro l2 = new Libro("1", "1", "Platón", 1);
		l2.prestar();
		l2.retirar();
		l2.devolver();
		l2.retirar();
		l2.prestar();
	}
}
