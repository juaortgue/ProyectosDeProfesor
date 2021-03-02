package model;

public class Empleado extends Persona {
	
	private String empleo;

	public Empleado(String nombre, String apellidos, String empleo) {
		super(nombre, apellidos);
		setEmpleo(empleo);
	}

	public String getEmpleo() {
		return empleo;
	}

	public void setEmpleo(String empleo) {
		this.empleo = empleo;
	}

	@Override
	public String toString() {
		return "Empleado [Empleo=" + getEmpleo() + ", Nombre=" + getNombre()
				+ ", Apellidos=" + getApellidos() + "]";
	}
	
	public void saludarEmpleado() {
		System.out.println("Holaa cabesa soy un empleado: "+this.getNombre());
	}

}