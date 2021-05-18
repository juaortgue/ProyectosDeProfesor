package model;

public class Linea_Factura implements Comparable<Linea_Factura> {

	// ATRIBUTOS

	private Integer id_linea_factura;
	private Integer cantidad;
	private Double precio_linea;

	// CONSTRUCTOR VACIO
	public Linea_Factura() {
		super();
	}

	// CONSTRUCTOR CON TODOS SUS ATRIBUTOS

	public Linea_Factura(Integer id_linea_factura, Integer cantidad, Double precio_linea) {
		super();
		setId_linea_factura(id_linea_factura);
		setCantidad(cantidad);
		setPrecio_linea(precio_linea);
	}

	// CONSTRUCTOR PASANDO DOS ATRIBUTOS

	public Linea_Factura(Integer cantidad, Double precio_linea) {
		super();

		setCantidad(cantidad);
		setPrecio_linea(precio_linea);
	}

	// LOS GETTER AND SETTER

	public Integer getId_linea_factura() {
		return id_linea_factura;
	}

	public void setId_linea_factura(Integer id_linea_factura) {
		this.id_linea_factura = id_linea_factura;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio_linea() {
		return precio_linea;
	}

	public void setPrecio_linea(Double precio_linea) {
		this.precio_linea = precio_linea;
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
		Linea_Factura other = (Linea_Factura) obj;
		if (cantidad == null) {
			if (other.cantidad != null)
				return false;
		} else if (!cantidad.equals(other.cantidad))
			return false;
		if (id_linea_factura == null) {
			if (other.id_linea_factura != null)
				return false;
		} else if (!id_linea_factura.equals(other.id_linea_factura))
			return false;
		if (precio_linea == null) {
			if (other.precio_linea != null)
				return false;
		} else if (!precio_linea.equals(other.precio_linea))
			return false;
		return true;
	}

	// TOSTRING

	@Override
	public String toString() {
		return "Linea Factura--> CANTIDAD: " + cantidad + ", PRECIO LINEA: " + precio_linea;
	}

	// COMPARAR ID DE LINEA FACTURA

	@Override
	public int compareTo(Linea_Factura o) {
		return this.id_linea_factura.compareTo(o.getId_linea_factura());

	}

}
