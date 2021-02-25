package Principal;

//Para implementar una interfaz usar implements
public class Perro implements AnimalInterfaz{
	private Integer edad;
	private String nombre;
	private Boolean estaVacunado;
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean getEstaVacunado() {
		return estaVacunado;
	}
	public void setEstaVacunado(Boolean estaVacunado) {
		this.estaVacunado = estaVacunado;
	}
	public Perro(Integer edad, String nombre, Boolean estaVacunado) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.estaVacunado = estaVacunado;
	}
	@Override
	public String toString() {
		return "Perro [edad=" + edad + ", nombre=" + nombre + ", estaVacunado=" + estaVacunado + "]";
	}
	@Override
	public void hacerRuido(String ruido) {
		System.out.println("Soy un perro que da mucha lata y me hago pipi en todos lados");
		
	}
	@Override
	public Boolean estaVacunado() {
		return this.estaVacunado;
	}
	

}
