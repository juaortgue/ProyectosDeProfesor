package model;

public class COcasion extends Coche{
	private Integer valoracion;

	public COcasion(String marca, String modelo, String matricula, Integer valoracion) {
		super(marca, modelo, matricula);
		this.valoracion = valoracion;
	}

	public Integer getValoracion() {
		return valoracion;
	}

	public void setValoracion(Integer valoracion) {
		this.valoracion = valoracion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((valoracion == null) ? 0 : valoracion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		COcasion other = (COcasion) obj;
		if (valoracion == null) {
			if (other.valoracion != null)
				return false;
		} else if (!valoracion.equals(other.valoracion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString()+"\nCOcasion [valoracion=" + valoracion + "]";
	}
	

}
