package Principal;

import util.Teclado;

public class Ejercicio52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lim = Teclado.leerInt("diga un n");
		for(int fila = 1; fila<lim;fila++) {
			for(int c = 1; c<(fila+1);c++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
