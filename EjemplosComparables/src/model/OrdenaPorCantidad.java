package model;

import java.util.Comparator;

public class OrdenaPorCantidad implements Comparator<Bigmac> {

	@Override
	public int compare(Bigmac b1, Bigmac b2) {
		// TODO Auto-generated method stub
		return Integer.valueOf(b1.getCantidad()).compareTo(Integer.valueOf(b2.getCantidad()));
	}

}
