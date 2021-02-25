package modelos;

import interfaces.FiguraInterfaz;

public abstract class Figura implements FiguraInterfaz{

	/*
	 * hay propiedades derivadas de otras
	 * por lo tanto el area no se le puede dar en el constructor, si no que
	 * vamos a tener que utilizar un metodo auxiliar para hacerlo
	 */
	private String color;
	private Double area;
	public Figura(String color) {
		super();
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Figura [color=" + color + ", area=" + area + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
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
		Figura other = (Figura) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}
	@Override
	public abstract Double calcularArea();

	
}
