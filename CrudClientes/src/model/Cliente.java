package model;

import java.util.Set;

public class Cliente extends Persona {
	
	private String email;
	private Set<Coche> flota;

	public Cliente(String nombre, String apellidos, String email, Set<Coche> flota) {
		super(nombre, apellidos);
		setEmail(email);
		setFlota(flota);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Coche> getFlota() {
		return flota;
	}

	public void setFlota(Set<Coche> flota) {
		this.flota = flota;
	}

	@Override
	public String toString() {
		return "Cliente [eMail=" + getEmail() + ", Flota=" + getFlota() + ", Nombre=" + getNombre()
				+ ", Apellidos=" + getApellidos() + "]";
	}
	public void saludar() {
		System.out.println("Holaa cabesa soy un cliente: "+this.getApellidos());
	}
	public static void metodoEstatico() {
		System.out.println("Soy estatico");
	}



}