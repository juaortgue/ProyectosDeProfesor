package Principal;

public class Profesor extends Persona{
	private Double sueldo;

	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}

	//mi constructor tiene que tener los atributos del padre y del hijo
	public Profesor(String instituto, String nombre, String dni, Double sueldo) {
		super(instituto, nombre, dni);
		this.sueldo=sueldo;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public void darClase() {
		// TODO Auto-generated method stub
		super.darClase();
		System.out.println("Y UN PROFESOR");
	}
	

}
