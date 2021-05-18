package view;

import controller.ControllerCliente;
import model.TextosApp;
import utils.Teclado;

public class FrmCliente {
	public static void VistaCliente() {
		Integer op;

		do {
			mostrarOpcionesMenu();
			op = Teclado.leerInt(TextosApp.SELECCIONAOPCION);
			switch (op) {
			case 1: {
				ControllerCliente.listar(false);
				break;
			}
			case 2: {
				ControllerCliente.nuevo();		
				break;
						}
			case 3: {
				ControllerCliente.modificar();
				break;
			}case 4: {
				ControllerCliente.borrar();
				break;
			}
			default:
				opIncorrecta();
			}
			
		}while(op!=0);
	}
	
	public static void opIncorrecta() {
		System.out.println(TextosApp.ERROROPMENU);
	}

	private static void mostrarOpcionesMenu() {
		System.out.println(TextosApp.MENUCLIENTE);
		System.out.println(TextosApp.LISTARCLIENTE);
		System.out.println(TextosApp.CREARCLIENTE);
		System.out.println(TextosApp.EDITARCLIENTE);
		System.out.println(TextosApp.BORRARCLIENTE);
	}
}
