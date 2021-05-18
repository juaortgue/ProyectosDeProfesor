package view;

import controller.ControllerFactura;
import model.TextosApp;
import utils.Teclado;

public class FrmFactura {
	public static void VistaFactura() {
		Integer op;

		do {
			mostrarOpcionesMenu();
			op = Teclado.leerInt(TextosApp.SELECCIONAOPCION);
			switch (op) {
			case 0: {
				salir();
				break;
			}
			case 1: {
				ControllerFactura.listar(false);
				break;
			}
			case 2: {
				ControllerFactura.nuevo();
				break;
			}
			case 3: {
				ControllerFactura.modificar();

				break;
			}
			case 4: {
				ControllerFactura.borrar();
				break;
			}
			
			default:
				opIncorrecta();
			}

		} while (op != 0);
	}

	public static void opIncorrecta() {
		System.out.println(TextosApp.ERROROPMENU);
	}

	public static void salir() {
		System.out.println(TextosApp.SALIDAMENUFACTURA);
	}

	private static void mostrarOpcionesMenu() {
		System.out.println("==================================");
		System.out.println(TextosApp.MENUFACTURA);
		System.out.println(TextosApp.LISTARFACTURA);
		System.out.println(TextosApp.CREARFACTURA);
		System.out.println(TextosApp.EDITARFACTURA);
		System.out.println(TextosApp.BORRARFACTURA);
		System.out.println("==================================");

	}
}
