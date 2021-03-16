package model;

import java.util.Comparator;

public class OrdenaPorPreparado implements Comparator<Bigmac> {

	@Override
	public int compare(Bigmac o1, Bigmac o2) {
		// TODO Auto-generated method stub
		return o1.getPreparado().compareTo(o2.getPreparado());
	}

}
