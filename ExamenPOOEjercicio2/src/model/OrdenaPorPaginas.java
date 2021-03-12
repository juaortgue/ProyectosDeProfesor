package model;

import java.util.Comparator;

public class OrdenaPorPaginas implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		
		return o1.getPaginas().compareTo(o2.getPaginas());
	}

}
