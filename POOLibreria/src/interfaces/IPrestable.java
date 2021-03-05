package interfaces;

public interface IPrestable {

	/*
	 * Defina otra interfaz IPrestable, que tenga las operaciones relacionadas con
	 * el préstamo de las publicaciones. Tendrá definidas las operaciones: •
	 * prestar: No recibe ni retorna parámetros. Sólo debe modificar la propiedad
	 * que indica si está prestado o no, para que indique que sí está prestado. •
	 * devolver: No recibe ni retorna parámetros. Sólo debe modificar la propiedad
	 * que indica si está prestado o no, para que indique que no está prestado. •
	 * estaPrestado: Que no recibe parámetros y retorna el valor de la propiedad que
	 * indica si está prestado o no. f)
	 */
	public void prestar();
	public void devolver();
	public Boolean estaPrestado();
}
