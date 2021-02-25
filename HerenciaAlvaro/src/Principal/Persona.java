package Principal;

public class Persona {
	
	private String instituto;
	private String nombre;
	private String dni;
	
	
	public String getInstituto() {
		return instituto;
	}
	public void setInstituto(String instituto) {
		this.instituto = instituto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(String instituto, String nombre, String dni) {
		super();
		this.instituto = instituto;
		this.nombre = nombre;
		this.dni = dni;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((instituto == null) ? 0 : instituto.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (instituto == null) {
			if (other.instituto != null)
				return false;
		} else if (!instituto.equals(other.instituto))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public void darClase() {
		System.out.println("Estoy dando clase y soy una PERSONA");
	}
	public void andar() {
		System.out.println("Estoy andando y soy una PERSONA");
	}

}
