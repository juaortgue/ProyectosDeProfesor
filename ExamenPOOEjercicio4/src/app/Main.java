package app;

import model.Tablero;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main start = new Main();
		start.init();
	}
	public static void init() {
		System.out.println("Iniciando el juego....");
		Tablero t = new Tablero();
		t.inicializarTablero();
		t.mostrarTablero();
		t.mostrarMovientosTorre(2, 1);
	}

}
