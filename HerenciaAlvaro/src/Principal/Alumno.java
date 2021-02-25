package Principal;

public class Alumno extends Persona{

	 @Override
	public void darClase() {
		// TODO Auto-generated method stub
		super.darClase();
		System.out.println("PERO TAMBIEN ALUMNO");
	}


	@Override
	public void andar() {
		// TODO Auto-generated method stub
		super.andar();
	}

	private Double notaMedia;

	public Alumno(String instituto, String nombre, String dni,Double notaMedia) {
		super();//la palabra super sirve para que te cree un alumno 
		//con los atributos de una persona
		this.notaMedia = notaMedia;
	}
	

	public Double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(Double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [notaMedia=" + notaMedia + "]";
	}
	 
}
