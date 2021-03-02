package model;

public abstract class AparatoElectrico {

	private int consumeElectrico;
	private Boolean encendido;

	
	public AparatoElectrico() {
		super();
		this.consumeElectrico=0;
		this.encendido = false;
	}

	public int getConsumeElectrico() {
		return consumeElectrico;
	}

	public void setConsumeElectrico(int consumeElectrico) {
		this.consumeElectrico = consumeElectrico;
	}

	public Boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(Boolean encendido) {
		this.encendido = encendido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + consumeElectrico;
		result = prime * result + ((encendido == null) ? 0 : encendido.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AparatoElectrico other = (AparatoElectrico) obj;
		if (consumeElectrico != other.consumeElectrico)
			return false;
		if (encendido == null) {
			if (other.encendido != null)
				return false;
		} else if (!encendido.equals(other.encendido))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AparatoElectrico [consumeElectrico=" + consumeElectrico + ", isEncendido=" + encendido + "]";
	}

	/*
	 * Cada aparato se decrementara su consumo en base a una constante
	 */
	public void decrementarConsumo() {
		System.out.println("Decrementando consumo....");
	}

	public void apagar() {
		System.out.println("Me estoy apagando....");
		this.setEncendido(false);
	}

}
