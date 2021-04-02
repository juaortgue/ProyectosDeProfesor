package fp.ventaCoches;

import java.time.LocalDate;

import fp.utiles.CocheValidador;
import fp.utiles.Color;

public class Coche implements Comparable<Coche>{
	/*
	 * Un constructor con todas las propiedades básicas Una propiedad derivada Todas
	 * las propiedades básicas deben ser consultables y modificables Tres
	 * restricciones Un criterio de igualdad Un orden natural Realizar un test tal
	 * que:
	 * 
	 * 
	 * Cree un objeto correcto y lo imprima por pantalla Cree tantos objetos
	 * incorrectos como restricciones haya, y comprobar que se eleva cada excepción
	 * 
	 * marca string, modelo string, precio double, iva double, fecha date, color
	 * enum
	 * 
	 */
	private String marca;
	private String modelo;
	private Double precio;// precio>0
	private Double iva;// iva>=0 && iva<precio
	private LocalDate fecha;// 1980, 2000, 2022, fecha<=fechaActual
	private Color colorCoche;

	// propiedad derivada: aquella propiedad que depende de otra para calcularse
	/*
	 * Me pasan atributos desde el main y gracias a ellos creo mi nuevo objeto
	 */
	// "marca","modelo",100.230, 100.0,new Date(),Color.BLANCO
	/*
	 * public static Coche of(String ma, String mo, Double pr, Double iv, Date f,
	 * Color c) { return new Coche(ma, mo, pr, iv, f, c); }
	 */

	public Coche() {

	}

	public Coche(String ma, String mo, Double pr, Double iv, LocalDate f, Color c) {
		// validaciones
		Boolean result = true;
		result = CocheValidador.validarPrecio(pr) && CocheValidador.validarIva(pr, iv)
				&& CocheValidador.validarFecha(f);
		if (result) {
			this.marca = ma;
			this.modelo = mo;
			this.precio = sumarIvaAPrecio(pr, iv);
			this.iva = iv;
			this.fecha = f;
			this.colorCoche = c;
			// control + shitf+ f --> tabula documento
			// control + shit + o --> importa todo del tiron
		}

	}

//	public Coche(String ma, String mo, Double pr, Double iv, LocalDate f, Color c) {
//		
//		//pr=100, iv=20
//		if(pr>0) {
//			this.precio = sumarIvaAPrecio(pr, iv);
//		}else {
//			System.out.println("Error en precio: debe ser mayor que 0");
//		}
//		if(iv>=0 && iv<precio) {
//			this.iva = iv;
//
//		}else {
//			System.out.println("Error en el iva");
//		}
//		
//		if(f.isBefore(LocalDate.now()) || f.equals(LocalDate.now())) {
//			this.fecha=f;
//		}else {
//			System.out.println("Error en fecha");
//		}
//		// this.precio=pr+iv;
//		this.fecha = f;
//		this.colorCoche = c;
//		this.marca = ma;
//		this.modelo = mo;
//	}
////pr=100, iv=20
	public Double sumarIvaAPrecio(Double p, Double i) {
		return p + i;// 100+20=120
	}

	/*
	 * Los metodos estaticos se pueden llamar sin necesidad de crear el objeto coche
	 */
	public static void saludar() {
		System.out.println("HOLA CABESA QUE YA VIENE LOS REBUJITOS");
	}

	public void despedirse() {
		System.out.println("Adios");
	}

	// getters
	public String getMarca() {
		return this.marca;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public Color getColorCoche() {
		return colorCoche;
	}

	public void setColorCoche(Color colorCoche) {
		this.colorCoche = colorCoche;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setFecha(LocalDate nuevaFecha) {
		this.fecha = nuevaFecha;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", iva=" + iva + ", fecha="
				+ fecha + ", colorCoche=" + colorCoche + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colorCoche == null) ? 0 : colorCoche.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((iva == null) ? 0 : iva.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((precio == null) ? 0 : precio.hashCode());
		return result;
	}

	//dos coches son iguales si tienen mismo modelo y marca
	//FERRari y otro es Ferrari--> ferrari y ferrari
	public Boolean equals(Coche cocheAComparar) {
		return this.modelo.toLowerCase().equals(cocheAComparar.getModelo().toLowerCase())
				&& this.marca.toLowerCase().equals(cocheAComparar.getMarca().toLowerCase());
	}

	//devuelves -1 si tu coche es menor que el que te dan
	//devuelves 0 si son iguales
	//devuelves 1 si el que me dan es menor que el mio
	//Mi orden natural sera por  la marca, despues pr el modelo y despues por el precio
	@Override
	public int compareTo(Coche c2) {
		int result = 0;
		result = this.marca.toLowerCase().compareTo(c2.getMarca().toLowerCase());
		if(result==0) {
			result = this.modelo.toLowerCase().compareTo(c2.getModelo().toLowerCase());
			if(result==0) {
				result = this.precio.compareTo(c2.getPrecio());
			}
		}
		return result;
	}

	// toString: traduce un coche a string y lo devuelve

}
