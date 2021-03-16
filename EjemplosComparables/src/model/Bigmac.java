package model;

import java.util.Date;

public class Bigmac implements Comparable<Bigmac> {
	private Double precio;
	private Date caducidad;
	private Boolean preparado;
	private int cantidad;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caducidad == null) ? 0 : caducidad.hashCode());
		result = prime * result + cantidad;
		result = prime * result + ((precio == null) ? 0 : precio.hashCode());
		result = prime * result + ((preparado == null) ? 0 : preparado.hashCode());
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
		Bigmac other = (Bigmac) obj;
		if (caducidad == null) {
			if (other.caducidad != null)
				return false;
		} else if (!caducidad.equals(other.caducidad))
			return false;
		if (cantidad != other.cantidad)
			return false;
		if (precio == null) {
			if (other.precio != null)
				return false;
		} else if (!precio.equals(other.precio))
			return false;
		if (preparado == null) {
			if (other.preparado != null)
				return false;
		} else if (!preparado.equals(other.preparado))
			return false;
		return true;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Date getCaducidad() {
		return caducidad;
	}

	@Override
	public String toString() {
		return "Bigmac [precio=" + precio + ", caducidad=" + caducidad + ", preparado=" + preparado + ", cantidad="
				+ cantidad + "]";
	}

	public void setCaducidad(Date caducidad) {
		this.caducidad = caducidad;
	}

	public Boolean getPreparado() {
		return preparado;
	}

	public void setPreparado(Boolean preparado) {
		this.preparado = preparado;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Bigmac(Double precio, Date caducidad, Boolean preparado, int cantidad) {
		super();
		this.precio = precio;
		this.caducidad = caducidad;
		this.preparado = preparado;
		this.cantidad = cantidad;
	}

	/*
	 * private Double precio; private Date caducidad; private Boolean preparado;
	 * private int cantidad
	 */
	@Override
	public int compareTo(Bigmac o) {
		int salida = 0;

		if (this.getPrecio().compareTo(o.getPrecio()) == 0) {
			if (this.getCaducidad().compareTo(o.getCaducidad()) == 0) {
				if (this.getPreparado().compareTo(o.getPreparado()) == 0) {
					// transformarmos el int a integer, para que sea un objeto con su metodo
					// compareTo
					salida = Integer.valueOf(this.getCantidad()).compareTo(Integer.valueOf(o.getCantidad()));
				} else {
					salida = this.getPreparado().compareTo(o.getPreparado());
				}
			} else {
				salida = this.getCaducidad().compareTo(o.getCaducidad());

			}
		} else {
			salida = this.getPrecio().compareTo(o.getPrecio());
		}

		return salida;
	}

}
