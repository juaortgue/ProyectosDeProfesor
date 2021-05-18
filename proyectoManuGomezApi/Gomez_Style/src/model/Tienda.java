package model;

public class Tienda implements Comparable<Tienda> {

	// ATRIBUTOS

	private Integer id_tienda;
	private String nombre;

	// CONSTRUCTOR POR VACIO

	public Tienda() {
		super();
	}
	// CONSTRUCTOR CON TODOS SUS ATRIBUTOS

	public Tienda(Integer id_tienda, String nombre) {
		super();
		setId_tienda(id_tienda);
		setNombre(nombre);
	}
	// CONSTRUCTOR PASANDO EL NOMBRE SOLAMENTE

	public Tienda(String nombre) {
		setNombre(nombre);

	}
	// LOS GETTER AND SETTER

	public Integer getId_tienda() {
		return id_tienda;
	}

	public void setId_tienda(Integer id_tienda) {
		this.id_tienda = id_tienda;
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
		Tienda other = (Tienda) obj;
		if (id_tienda == null) {
			if (other.id_tienda != null)
				return false;
		} else if (!id_tienda.equals(other.id_tienda))
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
		return "Tienda--> ID: " + id_tienda + ", NOMBRE: " + nombre;
	}

	// COMPARAR TIENDA POR NOMBRE

	@Override
	public int compareTo(Tienda o) {

		return this.nombre.compareTo(o.getNombre());
	}

}
