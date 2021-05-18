package model;

public class Tipo_Producto implements Comparable<Tipo_Producto> {

	// ATRIBUTOS

	private Integer id_tipo_producto;
	private String nombre;

	// CONSTRUCTOR POR VACIO

	public Tipo_Producto() {
		super();
	}

	// CONSTRUCTOR CON TODOS SUS ATRIBUTOS

	public Tipo_Producto(Integer id_tipo_producto, String nombre) {
		super();
		setId_tipo_producto(id_tipo_producto);
		setNombre(nombre);
	}

	// CONSTRUCTOR PASANDO POR PARAMETROS UN STRING

	public Tipo_Producto(String t) {
		setNombre(t);
	}

	// LOS GETTER AND SETTER

	public Integer getId_tipo_producto() {
		return id_tipo_producto;
	}

	public void setId_tipo_producto(Integer id_tipo_producto) {
		this.id_tipo_producto = id_tipo_producto;
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
		Tipo_Producto other = (Tipo_Producto) obj;
		if (id_tipo_producto == null) {
			if (other.id_tipo_producto != null)
				return false;
		} else if (!id_tipo_producto.equals(other.id_tipo_producto))
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
		return "Tipo de Producto--> Nombre = " + nombre;
	}

	// COMPARAR TIPO DE PRODUCTO POR NOMBRE

	@Override
	public int compareTo(Tipo_Producto o) {

		return this.nombre.compareTo(o.getNombre());
	}

}
