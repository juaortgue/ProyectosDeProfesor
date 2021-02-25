package model;

import java.util.List;

public class ProgramaBombillas {

	private List<Bombilla> lista;

	public ProgramaBombillas(List<Bombilla> lista) {
		super();
		this.lista = lista;
	}

	public List<Bombilla> getLista() {
		return lista;
	}

	public void setLista(List<Bombilla> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "ProgramaBombillas [lista=" + lista + "]";
	}
	
}
