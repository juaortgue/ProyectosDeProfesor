package model;

public abstract class Vehiculo {
	private String matrica;
	private String marca;
	private String modelo;
	private int numPuertas;
	private Boolean tipoCombustiple;
	public Vehiculo(String matrica, String marca, String modelo, int numPuertas, Boolean tipoCombustiple) {
		super();
		this.matrica = matrica;
		this.marca = marca;
		this.modelo = modelo;
		this.numPuertas = numPuertas;
		this.tipoCombustiple = tipoCombustiple;
	}
	
	public Vehiculo() {
		super();
	}

	public String getMatrica() {
		return matrica;
	}
	public void setMatrica(String matrica) {
		this.matrica = matrica;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	public Boolean getTipoCombustiple() {
		return tipoCombustiple;
	}
	public void setTipoCombustiple(Boolean tipoCombustiple) {
		this.tipoCombustiple = tipoCombustiple;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((matrica == null) ? 0 : matrica.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + numPuertas;
		result = prime * result + ((tipoCombustiple == null) ? 0 : tipoCombustiple.hashCode());
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
		Vehiculo other = (Vehiculo) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (matrica == null) {
			if (other.matrica != null)
				return false;
		} else if (!matrica.equals(other.matrica))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (numPuertas != other.numPuertas)
			return false;
		if (tipoCombustiple == null) {
			if (other.tipoCombustiple != null)
				return false;
		} else if (!tipoCombustiple.equals(other.tipoCombustiple))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Vehiculo [matrica=" + matrica + ", marca=" + marca + ", modelo=" + modelo + ", numPuertas=" + numPuertas
				+ ", tipoCombustiple=" + tipoCombustiple + "]";
	}
	
	
	
}
