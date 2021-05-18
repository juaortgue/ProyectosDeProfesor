package view;

import controller.ControllerEstilo;
import model.TextosApp;
import utils.Teclado;

public class FrmEstilo {
	public static void VistaEstilo() {
		Integer op;

		do {
			mostrarOpcionesMenu();
			op = Teclado.leerInt("\nSeleccione opción [0-Salir] para salir de estilos: ");
			switch (op) {
			case 0: {
				salir();
				break;
			}
			case 1: {
				ControllerEstilo.listar(true);
				break;
			}
			case 2: {
				ControllerEstilo.nuevo();
				break;
			}
			case 3: {
				ControllerEstilo.modificar();

				break;
			}
			case 4: {
				ControllerEstilo.borrar();
				break;
			}

			/*case 5:
				ControllerEstilo.getTotalEstilo();
				break;*/

			default:
				opIncorrecta();
			}

		} while (op != 0);
	}

	public static void opIncorrecta() {
		System.out.println(TextosApp.ERROROPMENU);
	}

	public static void salir() {
		System.out.println(TextosApp.SALIDAMENUESTILO);
	}

	private static void mostrarOpcionesMenu() {
		System.out.println("==================================");
		System.out.println(TextosApp.MENUESTILO);
		System.out.println(TextosApp.LISTARESTILO);
		System.out.println(TextosApp.CREARESTILO);
		System.out.println(TextosApp.EDITARESTILO);
		System.out.println(TextosApp.BORRARESTILO);
		//System.out.println("5.Obtener una Estilo");
		System.out.println("==================================");

	}

}
