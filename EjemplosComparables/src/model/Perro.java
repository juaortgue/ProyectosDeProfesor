package model;

public class Perro implements Comparable<Perro>{
	private Boolean tieneCollar;
	private Double frecuenciaLadrido;
	private String color;
	private String raza;
	private int edad;
	public Perro() {
		super();
	}
	public Perro(Boolean tieneCollar, Double frecuenciaLadrido, String color, String raza, int edad) {
		super();
		this.tieneCollar = tieneCollar;
		this.frecuenciaLadrido = frecuenciaLadrido;
		this.color = color;
		this.raza = raza;
		this.edad = edad;
	}
	public Boolean getTieneCollar() {
		return tieneCollar;
	}
	public void setTieneCollar(Boolean tieneCollar) {
		this.tieneCollar = tieneCollar;
	}
	public Double getFrecuenciaLadrido() {
		return frecuenciaLadrido;
	}
	public void setFrecuenciaLadrido(Double frecuenciaLadrido) {
		this.frecuenciaLadrido = frecuenciaLadrido;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + edad;
		result = prime * result + ((frecuenciaLadrido == null) ? 0 : frecuenciaLadrido.hashCode());
		result = prime * result + ((raza == null) ? 0 : raza.hashCode());
		result = prime * result + ((tieneCollar == null) ? 0 : tieneCollar.hashCode());
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
		Perro other = (Perro) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (edad != other.edad)
			return false;
		if (frecuenciaLadrido == null) {
			if (other.frecuenciaLadrido != null)
				return false;
		} else if (!frecuenciaLadrido.equals(other.frecuenciaLadrido))
			return false;
		if (raza == null) {
			if (other.raza != null)
				return false;
		} else if (!raza.equals(other.raza))
			return false;
		if (tieneCollar == null) {
			if (other.tieneCollar != null)
				return false;
		} else if (!tieneCollar.equals(other.tieneCollar))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Perro [tieneCollar=" + tieneCollar + ", frecuenciaLadrido=" + frecuenciaLadrido + ", color=" + color
				+ ", raza=" + raza + ", edad=" + edad + "]";
	}
	/*private Boolean tieneCollar;
	private Double frecuenciaLadrido;
	private String color;*/
	@Override
	public int compareTo(Perro o) {
		int salida = 0;
		if(this.getTieneCollar().compareTo(o.getTieneCollar())==0) {
			if(this.getFrecuenciaLadrido().compareTo(o.getFrecuenciaLadrido())==0) {
				salida  = this.getColor().compareTo(o.getColor());
			}else {
				salida= this.getFrecuenciaLadrido().compareTo(o.getFrecuenciaLadrido());
			}
		}else {
			salida = this.getTieneCollar().compareTo(o.getTieneCollar());
		}
		return salida;
	}
	

}
