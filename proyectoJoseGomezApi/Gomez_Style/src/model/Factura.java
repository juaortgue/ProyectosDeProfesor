package model;

import java.util.List;

public class Factura implements Comparable<Factura> {

	// ATRIBUTOS

	private Integer id_factura;
	private Double precio_total;
	private String fecha_compra;

	// RELACIONES

	private Cliente cliente;
	private List<Linea_Factura> lineas;

	// CONSTRUCTOR VACIO

	public Factura() {
		super();
	}

	// CONSTRUCTOR PASANDO POR PARAMETROS DOS ATRIBUTOS

	public Factura(Double precio_total, String fecha_compra) {
		super();

		setPrecio_total(precio_total);
		setFecha_compra(fecha_compra);

	}

	// CONSTRUCTOR DATOS DE FACTURA

	public Factura(Integer id_factura, Double precio_total, String fecha_compra) {
		super();
		setId_factura(id_factura);
		setPrecio_total(precio_total);
		setFecha_compra(fecha_compra);

	}

	// CONSTRUCTOR CON TODOS SUS ATRIBUTOS

	public Factura(Integer id_factura, Double precio_total, String fecha_compra, Cliente cliente,
			List<Linea_Factura> lineas) {
		super();
		setId_factura(id_factura);
		setPrecio_total(precio_total);
		setFecha_compra(fecha_compra);
		setCliente(cliente);
		setLineas(lineas);
	}

	// LOS GETTER AND SETTER

	public Integer getId_factura() {
		return id_factura;
	}

	public void setId_factura(Integer id_factura) {
		this.id_factura = id_factura;
	}

	public Double getPrecio_total() {
		return precio_total;
	}

	public void setPrecio_total(Double precio_total) {
		this.precio_total = precio_total;
	}

	public String getFecha_compra() {
		return fecha_compra;
	}

	public void setFecha_compra(String fecha_compra) {
		this.fecha_compra = fecha_compra;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Linea_Factura> getLineas() {
		return lineas;
	}

	public void setLineas(List<Linea_Factura> lineas) {
		this.lineas = lineas;
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
		Factura other = (Factura) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (fecha_compra == null) {
			if (other.fecha_compra != null)
				return false;
		} else if (!fecha_compra.equals(other.fecha_compra))
			return false;
		if (id_factura == null) {
			if (other.id_factura != null)
				return false;
		} else if (!id_factura.equals(other.id_factura))
			return false;
		if (lineas == null) {
			if (other.lineas != null)
				return false;
		} else if (!lineas.equals(other.lineas))
			return false;
		if (precio_total == null) {
			if (other.precio_total != null)
				return false;
		} else if (!precio_total.equals(other.precio_total))
			return false;
		return true;
	}

	// TOSTRING

	@Override
	public String toString() {
		return "Factura--> ID: " + id_factura + ", PRECIO TOTAL: " + precio_total + ", FECHA: " + fecha_compra
				+ ", CLIENTE: " + cliente + ", LINEAS: " + lineas;
	}

	// COMPARAR FACTURA POR EL ID

	@Override
	public int compareTo(Factura o) {
		return this.id_factura.compareTo(o.getId_factura());
	}

}
