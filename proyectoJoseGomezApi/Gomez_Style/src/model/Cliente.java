package model;

import java.util.List;

public class Cliente implements Comparable<Cliente> {

	// ATRIBUTOS
	private Integer id_cliente;
	private String nombre;
	private String apellidos;
	private String dni;
	private String telefono;
	private String contrasenia;
	private String email;
	private String sexo;
	private Integer edad;
	private Double presupuesto_maximo;
	private Double peso;
	private Double altura;
	private String color_piel;

	// RELACIONES
	private List<Estilo> estilos;
	private Personal_Shopper personal_shopper;
	private List<Factura> facturas;
	private List<Tienda> tiendas;

	//CONSTRUCTOR VACIO
	public Cliente() {
		super();
	}

	// CONSTRUCTOR CON TODOS SUS ATRIBUTOS

	public Cliente(Integer id_cliente, String nombre, String apellidos, String dni, String telefono, String contrasenia,
			String email, String sexo, Integer edad, Double presupuesto_maximo, Double peso, Double altura,
			String color_piel, List<Estilo> estilos, Personal_Shopper personal_shopper, List<Factura> facturas,
			List<Tienda> tiendas) {
		super();
		setId_cliente(id_cliente);
		setNombre(nombre);
		setApellidos(apellidos);
		setDni(dni);
		setTelefono(telefono);
		setContrasenia(contrasenia);
		setEmail(email);
		setSexo(sexo);
		setEdad(edad);
		setPresupuesto_maximo(presupuesto_maximo);
		setPeso(peso);
		setAltura(altura);
		setColor_piel(color_piel);
		setEstilos(estilos);
		setPersonal_shopper(personal_shopper);
		setFacturas(facturas);
		setTiendas(tiendas);
	}

	// CONSTRUCTOR CON LOS DATOS DEL CLIENTE

	public Cliente(String nombre, String apellidos, String dni, String telefono, String contrasenia, String email,
			String sexo, Integer edad, Double presupuesto_maximo, Double peso, Double altura, String color_piel) {
		super();
		setNombre(nombre);
		setApellidos(apellidos);
		setDni(dni);
		setTelefono(telefono);
		setContrasenia(contrasenia);
		setEmail(email);
		setSexo(sexo);
		setEdad(edad);
		setPresupuesto_maximo(presupuesto_maximo);
		setPeso(peso);
		setAltura(altura);
		setColor_piel(color_piel);

	}

	// CONSTRUCTOR PASANDO POR PARAMETROS STRING

	public Cliente(String cliente) {
		setNombre(cliente);
	}

	// LOS GETTER AND SETTER

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Double getPresupuesto_maximo() {
		return presupuesto_maximo;
	}

	public void setPresupuesto_maximo(Double presupuesto_maximo) {
		this.presupuesto_maximo = presupuesto_maximo;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getColor_piel() {
		return color_piel;
	}

	public void setColor_piel(String color_piel) {
		this.color_piel = color_piel;
	}

	public List<Estilo> getEstilos() {
		return estilos;
	}

	public void setEstilos(List<Estilo> estilos) {
		this.estilos = estilos;
	}

	public Personal_Shopper getPersonal_shopper() {
		return personal_shopper;
	}

	public void setPersonal_shopper(Personal_Shopper personal_shopper) {
		this.personal_shopper = personal_shopper;
	}

	public List<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	public List<Tienda> getTiendas() {
		return tiendas;
	}

	public void setTiendas(List<Tienda> tiendas) {
		this.tiendas = tiendas;
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
		Cliente other = (Cliente) obj;
		if (altura == null) {
			if (other.altura != null)
				return false;
		} else if (!altura.equals(other.altura))
			return false;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (color_piel == null) {
			if (other.color_piel != null)
				return false;
		} else if (!color_piel.equals(other.color_piel))
			return false;
		if (contrasenia == null) {
			if (other.contrasenia != null)
				return false;
		} else if (!contrasenia.equals(other.contrasenia))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (edad == null) {
			if (other.edad != null)
				return false;
		} else if (!edad.equals(other.edad))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (estilos == null) {
			if (other.estilos != null)
				return false;
		} else if (!estilos.equals(other.estilos))
			return false;
		if (facturas == null) {
			if (other.facturas != null)
				return false;
		} else if (!facturas.equals(other.facturas))
			return false;
		if (id_cliente == null) {
			if (other.id_cliente != null)
				return false;
		} else if (!id_cliente.equals(other.id_cliente))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (personal_shopper == null) {
			if (other.personal_shopper != null)
				return false;
		} else if (!personal_shopper.equals(other.personal_shopper))
			return false;
		if (peso == null) {
			if (other.peso != null)
				return false;
		} else if (!peso.equals(other.peso))
			return false;
		if (presupuesto_maximo == null) {
			if (other.presupuesto_maximo != null)
				return false;
		} else if (!presupuesto_maximo.equals(other.presupuesto_maximo))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (tiendas == null) {
			if (other.tiendas != null)
				return false;
		} else if (!tiendas.equals(other.tiendas))
			return false;
		return true;
	}

	// TOSTRING

	@Override
	public String toString() {
		return "NOMBRE: " + nombre + ", APELLIDOS: " + apellidos + ", DNI: " + dni
				+ ", TELÉFONO: " + telefono + ", CONTRASEÑA: " + contrasenia + ", EMAIL: " + email + ", SEXO: " + sexo
				+ ", EDAD: " + edad + ", PRESUPUESTO: " + presupuesto_maximo + ", PESO: " + peso + ", ALTURA: " + altura
				+ ", COLOR DE PIEL: " + color_piel ;
			
	}

	// COMPARAR CLIENTE POR NOMBRE

	@Override
	public int compareTo(Cliente o) {

		return this.nombre.compareTo(o.getNombre());
	}

}
