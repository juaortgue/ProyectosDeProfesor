package model;

import java.util.Comparator;

public class OrdenaPorTitulo implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		// TODO Auto-generated method stub
		return o1.getTitulo().compareTo(o2.getTitulo());
	}

}
