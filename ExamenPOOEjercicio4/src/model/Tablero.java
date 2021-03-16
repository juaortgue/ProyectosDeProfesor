package model;

import java.util.Arrays;

public class Tablero {
	/*
	 * /* Realizar un programa que simule los posibles movimientos de una torre en
	 * un tablero de ajedrez cuya dimensión es de 8 x 8 de tipo de dato carácter.
	 * Las casillas blancas del ajedrez se simbolizan con una B y las casillas
	 * negras con N. Para ello se deben crear múltiples métodos como:
	 * 
	 * Método que devuelve el tablero de ajedrez con las casillas blancas y negras
	 * rellenadas. Para rellenar las casillas se debe crear un algoritmo que
	 * identifique si la casilla es Negra o Blanca. Por tanto no se puede
	 * inicializar la matriz manualmente. En dos variables de tipo int (fil y col),
	 * se almacenará la posición inicial de la torre en el tablero.
	 * 
	 * Método que, dependiendo de la posición inicial de la torre, marcará con un
	 * asterisco (*) todas aquellas casillas que la torre pueda posicionarse. Por
	 * ejemplo, si la posición suministrada por el usuario es, fil = 3 y col = 4,
	 * esta función deberá devolver el tablero de ajedrez de la siguiente manera:
	 * Método que muestre la matriz (tablero de ajedrez) con los movimientos
	 * posibles a partir de la posición de la torre definida en las variables fil y
	 * col. Recordad que dentro de los métodos no se puede hacer uso de la impresión
	 * por pantalla (println o print).
	 */
	private char[][] tab;
	private int fil;
	private int col;
	
	
	public Tablero(char[][] tab, int fil, int col) {
		super();
		this.tab = tab;
		this.fil = fil;
		this.col = col;
	}


	public int getFil() {
		return fil;
	}


	public void setFil(int fil) {
		this.fil = fil;
	}


	public int getCol() {
		return col;
	}


	public void setCol(int col) {
		this.col = col;
	}


	public Tablero() {
		super();
		this.tab = new char[7][7];
	}


	public Tablero(char[][] tab) {
		super();
		this.tab = tab;
	}
	


	public char[][] getTab() {
		return tab;
	}


	public void setTab(char[][] tab) {
		this.tab = tab;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(tab);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tablero other = (Tablero) obj;
		if (!Arrays.deepEquals(tab, other.tab))
			return false;
		return true;
	}


	
	@Override
	public String toString() {
		return "Tablero [tab=" + Arrays.toString(tab) + ", fil=" + fil + ", col=" + col + "]";
	}


	public void inicializarTablero() {
	
		char[][] tableroNuevo = new char[8][8];
		for (int i = 1; i <= tab.length+1; i++) {
			for (int j = 1; j <= tab.length+1; j++) {
				if((i+j)%2==0) {
					tableroNuevo[i-1][j-1]='B';
				}else {
					tableroNuevo[i-1][j-1]='N';

				}
				
			}
		}
		//seteo
		this.setTab(tableroNuevo);
		
	}
	public void mostrarTablero() {
		System.out.println("Tablero de ajedrez");
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab.length; j++) {
				System.out.print(this.getTab()[i][j]+"  ");
			}
			System.out.println();
		}
	}
	public void mostrarMovientosTorre(int f, int c) {
		System.out.println("Movimientos de la torre.....");
		this.setCol(c);
		this.setFil(f);
		for (int i = 1; i <= tab.length+1; i++) {
			for (int j = 1; j <= tab.length+1; j++) {
				if(c==j || i==f) {
					System.out.print("T  ");
				}else {
					System.out.print("x  ");
				}
			}
			System.out.println();
		}
		
		
	}
	

}
