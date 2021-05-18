package model;

public class Marca implements Comparable<Marca> {

	// ATRIBUTOS
	private Integer id_marca;
	private String nombre;

	// CONSTRUCTOR POR VACIO

	public Marca() {
		super();
	}

	// CONSTRUCTOR PASANDO EL NOMBRE SOLAMENTE
	public Marca(String marca) {
		setNombre(marca);
	}

	// CONSTRUCTOR CON TODOS SUS ATRIBUTOS
	public Marca(Integer id_marca, String nombre) {
		super();
		setId_marca(id_marca);
		setNombre(nombre);
	}

	// LOS GETTER AND SETTER

	public Integer getId_marca() {
		return id_marca;
	}

	public void setId_marca(Integer id_marca) {
		this.id_marca = id_marca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// EQUALS POR DEFECTO

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marca other = (Marca) obj;
		if (id_marca == null) {
			if (other.id_marca != null)
				return false;
		} else if (!id_marca.equals(other.id_marca))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	// TOSTRING

	@Override
	public String toString() {
		return "Marca: Nombre = " + nombre;
	}

	// COMPARAR MARCA POR NOMBRE

	@Override
	public int compareTo(Marca o) {

		return this.nombre.compareTo(o.getNombre());
	}

}
