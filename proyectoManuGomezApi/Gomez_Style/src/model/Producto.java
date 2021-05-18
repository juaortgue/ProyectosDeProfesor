package model;

public class Producto implements Comparable<Producto> {

	// ATRIBUTOS

	private Integer id_producto;
	private String nombre;
	private Double precio;
	private String talla;
	private String sexo;
	private Double iva;
	private Double descuento;
	private Marca marca;
	private Tipo_Producto tipo_producto;

	// CONSTRUCTOR POR VACIO
	public Producto() {
		super();
	}

	// CONSTRUCTOR PASANDO TODOS LOS ATRIBUTOS

	public Producto(Integer id_producto, String nombre, Double precio, String talla, String sexo, Double iva,
			Double descuento, Marca marca, Tipo_Producto tipo_producto) {
		super();
		setId_producto(id_producto);
		setNombre(nombre);
		setPrecio(precio);
		setTalla(talla);
		setSexo(sexo);
		setIva(iva);
		setDescuento(descuento);
		setMarca(marca);
		setTipo_producto(tipo_producto);
	}

	// CONSTRUTOR CON LOS DATOS DEL PRODUCTO
	public Producto(String nombre, Double precio, String talla, String sexo, Double iva, Double descuento) {
		super();

		setNombre(nombre);
		setPrecio(precio);
		setTalla(talla);
		setSexo(sexo);
		setIva(iva);
		setDescuento(descuento);
	}

	// CONSTRUCTOR PASANDO UN STRING

	public Producto(String producto) {
		setNombre(producto);
	}

	// GETTER AND SETTER

	public Integer getId_producto() {
		return id_producto;
	}

	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Tipo_Producto getTipo_producto() {
		return tipo_producto;
	}

	public void setTipo_producto(Tipo_Producto tipo_producto) {
		this.tipo_producto = tipo_producto;
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
		Producto other = (Producto) obj;
		if (descuento == null) {
			if (other.descuento != null)
				return false;
		} else if (!descuento.equals(other.descuento))
			return false;
		if (id_producto == null) {
			if (other.id_producto != null)
				return false;
		} else if (!id_producto.equals(other.id_producto))
			return false;
		if (iva == null) {
			if (other.iva != null)
				return false;
		} else if (!iva.equals(other.iva))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (precio == null) {
			if (other.precio != null)
				return false;
		} else if (!precio.equals(other.precio))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (talla == null) {
			if (other.talla != null)
				return false;
		} else if (!talla.equals(other.talla))
			return false;
		if (tipo_producto == null) {
			if (other.tipo_producto != null)
				return false;
		} else if (!tipo_producto.equals(other.tipo_producto))
			return false;
		return true;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "Producto--> ID: " + id_producto + ", NOMBRE: " + nombre + ", PRECIO: " + precio + ", TALLA: " + talla
				+ ", SEXO: " + sexo + ", IVA: " + iva + ", DESCUENTO: " + descuento + ", MARCA: " + marca
				+ ", TIPO DE PRODUCTO: " + tipo_producto;
	}

	// COMPARETO CON EL NOMBRE
	@Override
	public int compareTo(Producto o) {

		return this.nombre.compareTo(o.getNombre());
	}

}