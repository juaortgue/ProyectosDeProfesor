package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Libro;
import model.OrdenaPorAutor;
import model.OrdenaPorGenero;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// * b) En un método main, añada a una lista 10 libros de forma manual.
		// Imprímala
		// * utilizando un for normal, luego utilizando un for extendido.
		// *
		testEjercicio2();
		
	

	}
	private static void testEjercicio2() {
		Libro l1 = new Libro("titulo1", "1", 100, "comedia");
		Libro l2 = new Libro("titulo2", "2", 1, "terror");
		Libro l3 = new Libro("titulo3", "3", 10, "fitness");
		Libro l4 = new Libro("titulo4", "3", 111, "psicologia");
		Libro l5 = new Libro("titulo5", "3", 1011, "gaming");
		Libro l6 = new Libro("titulo6", "1", 100111, "manuErMaquina");
		Libro l7 = new Libro("titulo7", "5", 100111213, "gaming");
		Libro l8 = new Libro("titulo8", "5", 100444444, "fitness");
		Libro l9 = new Libro("titulo9", "5", 100, "terror");
		Libro l10 = new Libro("titulo10", "5", 100, "terror");
		List<Libro> ls = new ArrayList<Libro>();
		ls.add(l1);
		ls.add(l2);
		ls.add(l3);
		ls.add(l4);
		ls.add(l5);
		ls.add(l6);
		ls.add(l7);
		ls.add(l8);
		ls.add(l9);
		ls.add(l10);
	
		
		//AHORA RECORREMOS CON FOR NORMAL
		System.out.println("For normal");
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(i+": "+ls.get(i));
		}
		System.out.println("For extendido");
		for (Libro l : ls) {
			System.out.println(l);
		}
		
		System.out.println("LISTA ORDEN NATURAL");
        Collections.sort(ls, Comparator.naturalOrder());
        
        for (Libro p : ls) {
            System.out.println(p);
        }
		System.out.println("LISTA ORDEN por GENERO");

        Collections.sort(ls, new OrdenaPorGenero());
        //Collections.sort(ls, Comparator.comparing(x->x.getAutor()));
        for (Libro p : ls) {
            System.out.println(p);
        }
        Collections.sort(ls, new OrdenaPorAutor());
		System.out.println("LISTA ORDEN por autor");

        for (Libro p : ls) {
            System.out.println(p);
        }
        List<Libro> auxiliar = ls;
        System.out.println("-------------------------------------");
        System.out.println("Lista aux");
        System.out.println(auxiliar);
        System.out.println("---------------------------------");
        for (int i = auxiliar.size()-1; i >=0; i--) {
        	System.out.println("Eliminando.....");
			System.out.println(auxiliar.get(i));
			ls.remove(i);
		}
        System.out.println(ls);
        System.out.println("¿He conseguido borrar la lista?-->"+ls.isEmpty());
        
		
		
	}

}
