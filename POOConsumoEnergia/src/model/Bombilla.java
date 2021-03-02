package model;

public class Bombilla extends AparatoElectrico{
	private Integer decremento;

	

	public Bombilla() {
		super();
		this.decremento = 10;
	}

	public Integer getDecremento() {
		return decremento;
	}

	public void setDecremento(Integer decremento) {
		this.decremento = decremento;
	}

	@Override
	public void decrementarConsumo() {
		if(this.getConsumeElectrico()-this.getDecremento()>0) {
			super.decrementarConsumo();
			this.setConsumeElectrico(this.getConsumeElectrico()-this.getDecremento());
		}else {
			this.setConsumeElectrico(0);
		}
		
	}

	@Override
	public String toString() {
		return super.toString()+"\nBombilla [decremento=" + decremento + "]\n"
				+ "---------------------------------------------";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((decremento == null) ? 0 : decremento.hashCode());
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
		Bombilla other = (Bombilla) obj;
		if (decremento == null) {
			if (other.decremento != null)
				return false;
		} else if (!decremento.equals(other.decremento))
			return false;
		return true;
	}
	
	
	
}
