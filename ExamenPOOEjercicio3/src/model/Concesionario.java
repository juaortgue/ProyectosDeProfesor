package model;

import java.util.List;

public class Concesionario {
	private Integer id;
	private String ciudad;
	List<Coche> coches;
	public Concesionario(Integer id, String ciudad, List<Coche> coches) {
		super();
		boolean error=false;
		this.id = id;
		
		//tiene que ser menor o igual a 150 --> 151 erroneo
		if(ciudad.length()>150) {
			System.out.println("ERROR EN CIUDAD CABESA");
			error=true;
		}
		if(error==false) {
			this.ciudad = ciudad;
			this.coches = coches;
		}else {
			System.out.println("No se ha podido crear el coche");
		}
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public List<Coche> getCoches() {
		return coches;
	}
	public void setCoches(List<Coche> coches) {
		this.coches = coches;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result + ((coches == null) ? 0 : coches.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Concesionario other = (Concesionario) obj;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (coches == null) {
			if (other.coches != null)
				return false;
		} else if (!coches.equals(other.coches))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Concesionario [id=" + id + ", ciudad=" + ciudad + ", coches=" + coches + "]";
	}
	
	/*
	 * EJERCICIO 3 (3 puntos):
	 
	 Existen una multitud de
	 * concesionarios ubicados por toda la geografía española. Cada uno de estos
	 * concesionarios podrá almacenar múltiples coches. Sin embargo, un coche estará
	 * asociado únicamente con un concesionario en concreto.
	 * 
	 * Un concesionario está identificado por un identificador y tiene como atributo
	 * la ciudad donde se encuentra ubicado. Todos los campos para el concesionario
	 * son obligatorios. Las restricciones para este tipo de dato son las
	 * siguientes:
	 * 
	 * La ciudad es una cadena de caracteres y debe tener como máximo 150 caracteres
	 * (inclusivo). Un concesionario tiene una lista únicamente de coches.
	 * 
	 * Evite que pueda crearse objetos de tipo Vehículo (clase padre) y cree una
	 * clase main para probar el funcionamiento de la aplicación. No es necesario
	 * utilizar la librería del uso de teclado para este ejercicio.
	 * 
	 * Evite que no puedan crearse objetivos de tipo Vehículo (clase padre).
	 */
}
