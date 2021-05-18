package model;

import java.util.List;

public class Personal_Shopper implements Comparable<Personal_Shopper> {

	// ATRIBUTOS
	private Integer id_personal_shopper;
	private String nombre;
	private String apellidos;
	private String dni;
	private String telefono;
	private String contrasenia;
	private String email;
	private List<Cliente> clientes;

	// CONSTRUCTOR VACIO
	public Personal_Shopper() {
		super();
	}

	// CONSTRUCTOR COMPLETO
	public Personal_Shopper(Integer id_personal_shopper, String nombre, String apellidos, String dni, String telefono,
			String contrasenia, String email, List<Cliente> clientes) {
		super();
		setId_personal_shopper(id_personal_shopper);
		setNombre(nombre);
		setApellidos(apellidos);
		setDni(dni);
		setTelefono(telefono);
		setContrasenia(contrasenia);
		setEmail(email);
		setClientes(clientes);
	}

	// CONSTRUCTOR CON LOS DATOS PERSONALES DEL PERSONAL SHOPPER

	public Personal_Shopper(String nombre, String apellidos, String dni, String telefono, String contrasenia,
			String email) {
		super();

		setNombre(nombre);
		setApellidos(apellidos);
		setDni(dni);
		setTelefono(telefono);
		setContrasenia(contrasenia);
		setEmail(email);

	}

	// CONSTRUCTOR PASANDO POR PARAMETROS STRING PS

	public Personal_Shopper(String ps) {
		setNombre(ps);
	}

	// LOS GETTER AND SETTER

	public Integer getId_personal_shopper() {
		return id_personal_shopper;
	}

	public void setId_personal_shopper(Integer id_personal_shopper) {
		this.id_personal_shopper = id_personal_shopper;
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

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
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
		Personal_Shopper other = (Personal_Shopper) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (clientes == null) {
			if (other.clientes != null)
				return false;
		} else if (!clientes.equals(other.clientes))
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
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id_personal_shopper == null) {
			if (other.id_personal_shopper != null)
				return false;
		} else if (!id_personal_shopper.equals(other.id_personal_shopper))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}

	// TOSTRING

	@Override
	public String toString() {
		return "Personal Shopper--> ID: " + id_personal_shopper + ", NOMBRE: " + nombre + ", APELLIDOS: "
				+ apellidos + ", DNI: " + dni + ", TELÉFONO: " + telefono + ", CONTRASEÑA: " + contrasenia + ", email="
				+ email + ", CLIENTES: " + clientes;
	}

	// COMPARAR PERSONAL SHOPPER POR NOMBRE

	@Override
	public int compareTo(Personal_Shopper o) {

		return this.nombre.compareTo(o.getNombre());

	}

}
