package interfaces;

public interface IPublicacion {
	public String getCodigo();
	public String getAutor();
	public String getTitulo();
	public Integer getAnyoPublicacion();
	public void setCodigo(String c);
	public void setAutor(String a);
	public void setTitulo(String t);
	public void setAnyoPublicacion(Integer ap);
	
	/*
	 * En una biblioteca existen una serie de publicaciones, que tienen las
	 * propiedades de código, autor, título, año de publicación y una propiedad que
	 * indica si el libro está prestado. Defina las clases necesarias para
	 * implementar un programa con las siguientes características: a) Una Interfaz
	 * IPublicacion, que defina los métodos consultores y modificadores de las
	 * propiedades antes mencionadas. b) Defina 3 clases que se correspondan con
	 * Libro, Revista y Disco, que implementen la interfaz IPublicacion. c) Cada
	 * clase debe tener un constructor que reciba como parámetros los datos de las
	 * propiedades definidas. La propiedad que indica si el libro está prestado o
	 * no, deberá inicializarse por defecto a falso. d) Desarrolle un programa
	 * principal, que construya varias publicaciones, haciendo uso de los
	 * constructores, y después, utilice los métodos consultores y modificadores,
	 * modificando valores, y mostrando los distintos valores de las distintas
	 * propiedades por pantalla.
	 */

}
