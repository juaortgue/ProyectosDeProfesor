
package Principal;

import util.Teclado;

public class Main {

	public static void main(String[] args) {
		String clase = Teclado.leerString("Introduzca su clase de comprador (A,B,C)");
		Double precio = 0.0;
		int tipoPieza = 0;
		Double precioACobrar = 0.0;
		do {
			System.out.println("Si es mayor que 0 seguira comprando si es 0 saldrá.");

			precio = Teclado.leerDouble("Introduzca un precio pepito");
			if (precio != 0) {
				tipoPieza = Teclado.leerInt("Deme el tipo de pieza (1 o 2)");
				precioACobrar += aplicarDescuento(clase, tipoPieza, precio);
			
			}

		} while (precio != 0);
		System.out.println("Tiene que pagar = " + precioACobrar);

	}

	public static Double aplicarDescuento(String tipoComprador, int tipoPieza, Double precioPieza) {
		Double descuentoTotal = 0.0;
		Double precioAplicado = 0.0;
		if (tipoComprador == "A") {
			descuentoTotal += 2.0;
		} else if (tipoComprador == "B") {
			descuentoTotal += 4.0;
		} else {
			descuentoTotal += 6.0;
		}

		if (tipoPieza == 1) {
			descuentoTotal += 8.0;
		} else if (tipoPieza == 2) {
			descuentoTotal += 10.0;

		}
		precioAplicado = precioPieza - ((precioPieza * descuentoTotal) / 100);
		return precioAplicado;
	}

}
