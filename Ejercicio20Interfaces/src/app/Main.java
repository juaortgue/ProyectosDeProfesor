package app;

import model.Fijo;
import model.Movil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movil m1 = new Movil(8755656);
		Movil m2 = new Movil(8755656);
		System.out.println("Los objetos tienen los mismos atributos?:"+m1.equals(m2));
		
		m1.consultarNumero();
		
		m1.colgar(655665656);
		
		Fijo j1 = new Fijo(954666566);
		
		j1.activarAltavoz();
		j1.colgar(667676666);
		
		Movil m10 = new Movil(222);
		Movil m11 = cambiarNumero(m10);
		System.out.println(m10.getNumero());
	}
	public static Movil cambiarNumero(Movil m) {
		m.setNumero(0);
		m = new Movil(5);
		return m;
	}

}
