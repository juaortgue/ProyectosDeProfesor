package view;


import controller.ControllerLineaFactura;
import model.TextosApp;
import utils.Teclado;

public class FrmLineaFactura {
	public static void VistaLineaFactura() {
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
				ControllerLineaFactura.listar(false);
				break;
			}
			case 2: {
				ControllerLineaFactura.nuevo();
				break;
			}
			case 3: {
				ControllerLineaFactura.modificar();

				break;
			}
			case 4: {
				ControllerLineaFactura.borrar();
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
		System.out.println(TextosApp.SALIDAMENULINEAFACTURA);
	}

	private static void mostrarOpcionesMenu() {
		System.out.println("==================================");
		System.out.println(TextosApp.MENULINEAFAC);
		System.out.println(TextosApp.LISTARLINEAFAC);
		System.out.println(TextosApp.CREARLINEAFAC);
		System.out.println(TextosApp.EDITARLINEAFAC);
		System.out.println(TextosApp.BORRARLINEAFAC);
		System.out.println("==================================");

	}
}