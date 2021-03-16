package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import model.Bigmac;
import model.OrdenaPorCantidad;
import model.OrdenaPorPrecio;
import model.OrdenaPorPreparado;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Bigmac> ls = new ArrayList<Bigmac>();
		
		ls.add(new Bigmac(20.0, null, true, 10));
		ls.add(new Bigmac(2.0, null, true, 0));
		ls.add(new Bigmac(30.0, null, true, 1));
		ls.add(new Bigmac(1.0, null, false, 100));
		Collections.sort(ls);
		for(Bigmac b: ls) {
			System.out.println(b);
		}
		System.out.println("Bucle normal");
		for(int i =0; i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		Collections.sort(ls, new OrdenaPorPrecio());
		System.out.println("Lista por precios");
		for(Bigmac b: ls) {
			System.out.println(b);
		}
		Collections.sort(ls, new OrdenaPorCantidad());
		System.out.println("Lista por cantidades");
		for(Bigmac b: ls) {
			System.out.println(b);
		}
		Collections.sort(ls, new OrdenaPorPreparado());
		System.out.println("Lista por esta preparado");
		for(Bigmac b: ls) {
			System.out.println(b);
		}
		
		//eliminar 
		//NUNCA NUNCA JAMAS HACER OPERACIONES CON LISTAS Y RECORRERLAS A LA VEZ
		System.out.println("Borrando....");
		for(Bigmac b: ls) {
			System.out.println(b);
		}
		ls.clear();
		System.out.println("¿Está mi lista de bigmacs vacía? "+ls.isEmpty());
		
		
	}

}
