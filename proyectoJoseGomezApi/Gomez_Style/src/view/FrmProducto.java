package view;


import controller.ControllerProducto;
import model.TextosApp;
import utils.Teclado;

public class FrmProducto {
	public static void VistaProducto() {
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
				ControllerProducto.listar(false);
				break;
			}
			case 2: {
				ControllerProducto.nuevo();
				break;
			}
			case 3: {
				ControllerProducto.modificar();

				break;
			}
			case 4: {
				ControllerProducto.borrar();
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
		System.out.println(TextosApp.SALIDAPRODUCTO);
	}

	private static void mostrarOpcionesMenu() {
		System.out.println("==================================");
		System.out.println(TextosApp.MENUPRODUCTO);
		System.out.println(TextosApp.LISTARPRODUCTO);
		System.out.println(TextosApp.CREARPRODUCTO);
		System.out.println(TextosApp.EDITARPRODUCTO);
		System.out.println(TextosApp.BORRARPRODUCTO);
		System.out.println("==================================");

	}
}