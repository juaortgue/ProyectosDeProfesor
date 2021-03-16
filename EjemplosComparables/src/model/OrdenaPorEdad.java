package model;

import java.util.Comparator;

public class OrdenaPorEdad implements Comparator<Perro> {

	@Override
	public int compare(Perro o1, Perro o2) {
		// TODO Auto-generated method stub
		return -1*Integer.valueOf(o1.getEdad()).compareTo(Integer.valueOf(o2.getEdad()));
	}

}
