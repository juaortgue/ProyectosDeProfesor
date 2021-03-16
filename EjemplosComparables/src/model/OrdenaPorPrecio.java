package model;

import java.util.Comparator;

public class OrdenaPorPrecio implements Comparator<Bigmac> {

	@Override
	public int compare(Bigmac o1, Bigmac o2) {
		
		return -1*o1.getPrecio().compareTo(o2.getPrecio());
	}

}
