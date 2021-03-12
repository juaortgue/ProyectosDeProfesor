package model;

import java.util.Comparator;

//para el metodo compare to implementamos comparable
public class Libro implements Comparable<Libro>{
	private String titulo;
	private String autor;
	private Integer paginas;
	private String generos;
	public Libro() {
		super();
	}
	
	public Libro(String titulo, String autor, Integer paginas, String generos) {
		super();
		//ORACLE SE EQUIVOCA
//		this.titulo = titulo;
//		this.autor = autor;
//		this.paginas = paginas;
//		this.generos = generos;
		setTitulo(titulo);
		setAutor(autor);
		setPaginas(paginas);
		setGeneros(generos);
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Integer getPaginas() {
		return paginas;
	}
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	public String getGeneros() {
		return generos;
	}
	public void setGeneros(String generos) {
		this.generos = generos;
	}
	//yo soy un libro y me dan otro libro para compararme
	public boolean equals(Libro comp) {
		boolean result = false;
		if(this.getAutor().equals(comp.getAutor()) && 
				this.getTitulo().equals(comp.getTitulo()) && 
				this.getPaginas().equals(comp.getPaginas())) {
			result=true;
		}
		return result;
	}

	@Override
	public String toString() {
		return "Libro --> titulo:" + titulo + ", autor:" + autor + ", paginas:" + paginas + ", generos:" + generos + ".";
	}

	@Override
	public int compareTo(Libro o) {
		// Compareto--> devuelve 0 si son iguales, -1 si el primer libro es menor, +1 si es mayor
		int salida = 0;
		if(getAutor().compareTo(o.getAutor())==0) {
			if(getTitulo().compareTo(o.getTitulo())==0) {
				salida = getGeneros().compareTo(o.getGeneros());
			}else {
				salida = getTitulo().compareTo(o.getTitulo());
			}
		}else {
			salida = getAutor().compareTo(o.getAutor());
		}
		
		return salida;
	}
	
	
	
	
//	 * a) Clase POJO correspondiente, con un constructor por defecto, otro con todos
//* los atributos, los métodos Getters & Setters, método equals (son libros son
//* iguales si, siendo del mismo autor, tienen el mismo título y número de
//* páginas), método toString personalizado, y un método que establezca un orden
//* natural de ordenación siguiendo estas prioridades: Autor, Género, Título.
//* 
//* b) En un método main, añada a una lista 10 libros de forma manual. Imprímala
//* utilizando un for normal, luego utilizando un for extendido.
//* 
//* c) Imprima la lista ordenándola por su orden natural establecido en la propia
//* clase; luego ordenándola por Genero-Autor-Título y por último sólo por el
//* Número de Páginas.
//* 
//* d) Elimine cada uno de los elemento de la lista, desde el último hasta el
//* primero, mostrando en pantalla qué elemento es que que se elimina de dicha
//* lista.
//*/

}
