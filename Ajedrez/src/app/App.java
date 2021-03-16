package app;

import model.JuegoAjedrez;

public class App {

	public static void main(String[] args) {
		App start = new App();
		start.init();
	}
	public  void init() {
		JuegoAjedrez j = new JuegoAjedrez(1,1);
		j.rellenarTablero();
		System.out.println("------------------------");
		j.mostrarMovimientosTorre();
	}

}
