package view;

import model.TextosApp;
import utils.Teclado;

public class FrmPrincipal {

	public static void VistaPrincipal() {
		Integer op;

		do {
			mostrarOpcionesMenu();
			op = Teclado.leerInt("\nSeleccione opción [0-Salir]: ");
			switch (op) {
			case 0: {
				System.out.println(TextosApp.SELECCIONAOPCION);

			}
			case 1: {
				FrmPersonalS.VistaPersonalS();

				break;
			}
			case 2: {
				FrmCliente.VistaCliente();
				break;
			}
			case 3: {
				FrmEstilo.VistaEstilo();
				break;
			}
			case 4: {
				FrmMarca.VistaMarca();
				break;
			}
			case 5: {
				FrmProducto.VistaProducto();
				break;
			}
			case 6: {

				FrmFactura.VistaFactura();

				break;
			}
			case 7: {

				FrmLineaFactura.VistaLineaFactura();

				break;
			}
			
			case 8: {
				FrmTienda.VistaTienda();

				break;
			}
			case 9: {
				FrmGesTipro.VistaGesTipro();
				break;
			}
			case 10: {
				FrmRanking.VistaRanking();
				break;
			}
			default:
				System.out.println(TextosApp.ERROROPMENU);
			}

		} while (op != 0);
	}

	private static void mostrarOpcionesMenu() {
		System.out.println("*******************");
		System.out.println("****GOMEZ STYLE****");
		System.out.println("*******************");
		System.out.println("\nMENÚ PRINCIPAL\n");
		System.out.println("1.Gestionar personal shoppers");
		System.out.println("2.Gestionar clientes");
		System.out.println("3.Asesorar clientes");
		System.out.println("4.Gestionar marcas");
		System.out.println("5.Gestionar productos");
		System.out.println("6.Gestionar facturas");
		System.out.println("7.Gestionar linea de facturas");
		System.out.println("8.Gestionar tiendas");
		System.out.println("9.Gestionar tipo de producto");
		System.out.println("10.Ver ranking");
	}

}
