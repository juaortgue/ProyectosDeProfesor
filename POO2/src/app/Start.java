package app;

import model.Coche;
import utils.Teclado;

public class Start {

	public static void main(String[] args) {
//		Coche c1 = new Coche();
//		Coche c2 = new Coche("1234ddg", "fiat", 120,100, 400);
//		System.out.println(c2.toString());
//		System.out.println(c2);
//		c1.setPotencia(0);
//		c1.setPotencia(1);
//		System.out.println(c1);
		int opcion;
		Coche c3 = new Coche("1234ddd", "Peugeot", 1200, 0, 300);
		do {
			System.out.println("MOSTRANDO COCHE.......");
			System.out.println(c3);
			System.out.println("----------------------------------");
			String menu = "MENU\n0.Salir\n1.Acelerar\n2.Decelerar";
			opcion = Teclado.leerInt(menu);
			switch (opcion) {
			case 0:
				opcion=0;
				break;
			case 1:
				int incremento = Teclado.leerInt("¿Cuanto quiere acelerar?");
				c3.acelerar(incremento);
				break;
			case 2:
				int decremento = Teclado.leerInt("¿Cuanto quiere desacelerar?");
				c3.decelerar(decremento);
				break;
			default:
				System.out.println("Opcion erronea.");
			}
		} while (opcion != 0);
	}

}
