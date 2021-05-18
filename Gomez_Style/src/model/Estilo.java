package model;

public class Estilo implements Comparable<Estilo> {

	// ATRIBUTOS

	private Integer id_estilo;
	private String nombre;

	// CONSTRUCTOR VACIO
	public Estilo() {
		super();
	}

	// CONSTRUCTOR PASANDO POR PARAMETROS STRING

	public Estilo(String e) {
		setNombre(e);
	}

	// CONSTRUCTOR CON TODOS SUS ATRIBUTOS

	public Estilo(Integer id_estilo, String nombre) {
		super();
		setId_estilo(id_estilo);
		setNombre(nombre);
	}

	// LOS GETTER AND SETTER

	public Integer getId_estilo() {
		return id_estilo;
	}

	public void setId_estilo(Integer id_estilo) {
		this.id_estilo = id_estilo;
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
		Estilo other = (Estilo) obj;
		if (id_estilo == null) {
			if (other.id_estilo != null)
				return false;
		} else if (!id_estilo.equals(other.id_estilo))
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
		return "Estilo ID: " + id_estilo + ", NOMBRE: " + nombre;
	}

	// COMPARAR ESTILO POR NOMBRE

	@Override
	public int compareTo(Estilo o) {

		return this.nombre.compareTo(o.getNombre());
	}

}
