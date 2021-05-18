package app;

import dbm.ConexionBD;
import logic.LogMarca;
import model.Marca;

public class Start {

	public static void main(String[] args) {
		Start application = new Start();
		application.init();
	}

	private void init() {
		view.FrmPrincipal.VistaPrincipal();
	}


}