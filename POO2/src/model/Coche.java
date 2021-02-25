package model;

public class Coche {
	private String matricula;
	private String marca;
	private int potencia;
	private int velocidad;
	private int velMax;

	/*
	 * ALGORITMO DE CREACI�N DE UN OBJETO 1: atributos a private 2: constructor
	 * vacio y con atributos 3: metodos getter 4: metodos setter 5 metodo toString
	 * 6: metodo equals 7: metodo hashcode 8: metodos que no son los "normales" en
	 * un objeto, ejemplo: acelerar, ladrar, sumar
	 */

	// Todo objeto tiene un constructor vacio, que no inicializa las variables
	// y aparte un constructor que si las inicializa,
	// con esto aprendemos a que varios metodos se pueden llamar igual
	// mientras cambien el numero de parametros o el parametro a devolver
	/*
	 * public static int suma(int x, int b) { return x+b; } public static int
	 * suma(int x, int b, int c) { return x+b+c; }
	 */

	// INICIO DE METODOS POR DEFECTO
	public Coche() {

	}

	// constructor con todos los parametros
	public Coche(String mat, String mar, int pot, int v, int vMax) {
		if (mat.length() == 7) {
			this.matricula = mat;

		} else {
			System.out.println("matricula incorrecta");
		}
		this.marca = mar;
		if (pot > 0) {
			this.potencia = pot;

		} else {
			System.out.println("La potencia debe ser mayor que 0");
		}
		if (v >= 0) {
			this.velocidad = v;

		} else {
			System.out.println("La velocidad debe ser mayor que 0");
		}
		if (vMax > 0) {
			this.velMax = vMax;

		} else {
			System.out.println("La velocidad maxima debe ser mayor que 0");
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		// Para que tenga sentido, la potencia de un coche no puede ser
		// 0 o menor que 0
		if (potencia > 0) {
			this.potencia = potencia;
		} else {
			System.out.println("La potencia debe ser positiva");
		}
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		if (velocidad >= 0) {
			this.velocidad = velocidad;

		} else {
			System.out.println("La velocidad debe ser mayor que 0");
		}
	}

	public int getVelMax() {
		return velMax;
	}

	public void setVelMax(int velMax) {
		if (velMax > 0) {
			this.velMax = velMax;

		} else {
			System.out.println("La velMax debe ser mayor que 0");
		}
	}

	public String toString() {
		String cocheEnString = "Matricula = " + this.matricula + " marca=" + this.marca + " potencia=" + this.potencia
				+ "  velocidad=" + this.velocidad + ", vel max=" + this.velMax;
		return cocheEnString;
	}
	// FIN DE METODOS POR DEFECTO

	public void acelerar(Integer incremento) {
		/*
		 * Forma del profesor this.setVelocidad(this.getVelocidad()+incremento);
		 */
		Integer velocidadAnterior = this.getVelocidad();
		Integer velocidadNueva = velocidadAnterior + incremento;
		if (incremento > 0 && velocidadNueva<=this.getVelMax()) {
			
			this.setVelocidad(velocidadNueva);
		} else {
			System.out.println("Incremento no valido");
		}
	}
	public void decelerar(Integer decremento) {
		Integer velocidadObtenida = this.getVelocidad()-decremento;
		if(decremento>0 && velocidadObtenida>=0) {
			this.setVelocidad(velocidadObtenida);
		}else {
			System.out.println("Decremento no valido");

		}
	}

	

}
