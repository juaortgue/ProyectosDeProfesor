package view;

import controller.ControllerTienda;
import model.TextosApp;
import utils.Teclado;

public class FrmTienda {

	public static void VistaTienda() {
		
		
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
				ControllerTienda.listar(true);
				break;
			}
			case 2: {
				ControllerTienda.nuevo();
				break;
			}
			case 3: {
				ControllerTienda.modificar();

				break;
			}
			case 4: {
				ControllerTienda.borrar();
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
		System.out.println(TextosApp.SALIDAMENUTIENDA);
	}

	private static void mostrarOpcionesMenu() {
		System.out.println("==================================");
		System.out.println(TextosApp.MENUTIENDA);
		System.out.println(TextosApp.LISTARTIENDA);
		System.out.println(TextosApp.CREARTIENDA);
		System.out.println(TextosApp.EDITARTIENDA);
		System.out.println(TextosApp.BORRARTIENDA);
		System.out.println("==================================");

	}
}