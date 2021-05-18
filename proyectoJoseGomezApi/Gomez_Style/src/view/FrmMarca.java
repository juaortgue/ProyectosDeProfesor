package view;

import controller.ControllerMarca;
import model.TextosApp;
import utils.Teclado;

public class FrmMarca {
	public static void VistaMarca() {
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
				ControllerMarca.listar(false);
				break;
			}
			case 2: {
				ControllerMarca.nuevo();
				break;
			}
			case 3: {
				ControllerMarca.modificar();

				break;
			}
			case 4: {
				ControllerMarca.borrar();
				break;
			}
			
			case 5:
				ControllerMarca.getMarca();
				break;
			
			default:
				opIncorrecta();
			}

		} while (op != 0);
	}

	public static void opIncorrecta() {
		System.out.println(TextosApp.ERROROPMENU);
	}

	public static void salir() {
		System.out.println(TextosApp.SALIDAMENUMARCA);
	}

	private static void mostrarOpcionesMenu() {
		System.out.println("==================================");
		System.out.println(TextosApp.MENUMARCA);
		System.out.println(TextosApp.LISTARMARCA);
		System.out.println(TextosApp.CREARMARCA);
		System.out.println(TextosApp.EDITARMARCA);
		System.out.println(TextosApp.BORRARMARCA);
		System.out.println(TextosApp.OBTENERMARCA);
		System.out.println("==================================");

	}
}
