package ejercicios;

import java.util.Arrays;

public class Hamburgueseria {
	
	private String nombre;
	private String[] burguers;
	private Integer[] precioMenus;
	
	public Hamburgueseria(String n, String[] b, Integer[] pm) {
		this.nombre=n;
		this.burguers=b;
		this.precioMenus=pm;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String[] getBurguers() {
		return this.burguers;
	}
	public void setBurguers(String[] b) {
		this.burguers=b;
	}
	public Integer[] getPrecios() {
		return this.precioMenus;
	}
	public void setPrecios(Integer[] pm) {
		this.precioMenus=pm;
	}
	
	public String toString() {
		return this.nombre+"-"+Arrays.toString(this.burguers)+"-"
	+Arrays.toString(this.precioMenus);
	}
	

}
