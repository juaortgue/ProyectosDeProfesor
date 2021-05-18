package view;

import controller.ControllerPersonalS;
import model.TextosApp;
import utils.Teclado;

public class FrmPersonalS {
	public static void VistaPersonalS() {
		Integer op;

		do {
			mostrarOpcionesMenu();
			op = Teclado.leerInt(TextosApp.SELECCIONAOPCION);
			switch (op) {
			case 1: {
				ControllerPersonalS.listar(false);
				break;
			}
			case 2: {
				ControllerPersonalS.nuevo();
				break;
			}
			case 3: {
				ControllerPersonalS.modificar();
				break;
			}
			case 4: {
				ControllerPersonalS.borrar();
				break;
			}
			case 5: {
				ControllerPersonalS.nuevoCliente();
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
		System.out.println(TextosApp.SALIDAMENUPERSONALSHOPPER);
	}

	private static void mostrarOpcionesMenu() {
		System.out.println(TextosApp.MENUPERSOSHO);
		System.out.println(TextosApp.LISTARPERSOSHO);
		System.out.println(TextosApp.CREARPERSOSHO);
		System.out.println(TextosApp.EDITARPERSOSHO);
		System.out.println(TextosApp.BORRARPERSOSHO);
		System.out.println(TextosApp.ANADIRPERSOSHO);
	}
}