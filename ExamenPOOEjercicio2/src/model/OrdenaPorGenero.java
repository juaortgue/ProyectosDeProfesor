package model;

import java.util.Comparator;

public class OrdenaPorGenero implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getGeneros().compareTo(o2.getGeneros());
	}

}
