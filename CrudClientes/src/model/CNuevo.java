package model;

public class CNuevo extends Coche {

	private Integer anio;

	public CNuevo(String marca, String modelo, String matricula, Integer anio) {
		super(marca, modelo, matricula);
		this.anio = anio;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return super.toString() + "Como coche--> año:" + this.getAnio();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((anio == null) ? 0 : anio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean r = super.equals(obj);
		if (r) {
			if (this == obj)
				r = true;
			if (!super.equals(obj))
				r = false;
			if (getClass() != obj.getClass())
				r = false;
			CNuevo other = (CNuevo) obj;
			if (anio == null) {
				if (other.anio != null)
					r = false;
			} else if (!anio.equals(other.anio))
				r = false;

		}
		return r;
	}

}
