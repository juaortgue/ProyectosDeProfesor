package view;

import controller.ControllerGesTipro;
import model.TextosApp;
import utils.Teclado;

public class FrmGesTipro {
	public static void VistaGesTipro() {
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
				ControllerGesTipro.listar(false);
				break;
			}
			case 2: {
				ControllerGesTipro.nuevo();
				break;
			}
			case 3: {
				ControllerGesTipro.modificar();

				break;
			}
			case 4: {
				ControllerGesTipro.borrar();
				break;
			}
			
			/*case 5:
				ControllerGesTipro.getTipo_Producto();
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
		System.out.println(TextosApp.SALIDAMENUTIPOPRODUCTO);
	}

	private static void mostrarOpcionesMenu() {
		System.out.println("==================================");
		System.out.println(TextosApp.MENUTIPOPRODUCTO);
		System.out.println(TextosApp.LISTARTIPOPRO);
		System.out.println(TextosApp.CREARTIPOPRO);
		System.out.println(TextosApp.EDITARTIPOPRO);
		System.out.println(TextosApp.BORRARTIPOPRO);
		//System.out.println("5.Obtener un Tipo de Producto");
		System.out.println("==================================");

	}
}

