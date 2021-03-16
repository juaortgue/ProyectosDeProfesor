package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.OrdenaPorEdad;
import model.Perro;

public class App2 {

	public static void main(String[] args) {
		List<Perro> ls = new ArrayList<Perro>();
		ls.add(new Perro(false, 10.0, "rojo", "yorkshire",4));
		ls.add(new Perro(false, 1.0, "verde", "x",1));
		ls.add(new Perro(true, 100.0, "amarillo", "y",12));
		Collections.sort(ls);
		for(Perro p: ls) {
			System.out.println(p);
		}
		Collections.sort(ls, new OrdenaPorEdad());
		System.out.println("Lista por edad");
		for(Perro p: ls) {
			System.out.println(p);
		}
	}

}
