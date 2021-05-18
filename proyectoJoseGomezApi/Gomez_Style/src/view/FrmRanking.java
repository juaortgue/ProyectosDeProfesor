package view;


import controller.ControllerRanking;
import model.TextosApp;
import utils.Teclado;

public class FrmRanking {
	public static void VistaRanking() {
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
				ControllerRanking.listar(false);
				break;
			}
			case 2: {
				ControllerRanking.nuevo();
				break;
			}
			case 3: {
				ControllerRanking.modificar();

				break;
			}
			case 4: {
				ControllerRanking.borrar();
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
		System.out.println(TextosApp.SALIDARANKING);
	}

	private static void mostrarOpcionesMenu() {
		System.out.println("==================================");
		System.out.println(TextosApp.MENURANKING);
		System.out.println(TextosApp.LISTARRANKING);
		System.out.println(TextosApp.CREARRANKING);
		System.out.println(TextosApp.EDITARRANKING);
		System.out.println(TextosApp.BORRARRANKING);
		System.out.println("==================================");

	}
}
