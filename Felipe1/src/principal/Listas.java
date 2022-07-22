package principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		List<Integer> listaNumeros = new ArrayList<>();
		//añadir
		listaNumeros.add(1);
		listaNumeros.add(5);
		listaNumeros.add(10);
		//imprimir todos los elementos
		System.out.println(listaNumeros);
		//coger uno
		System.out.println(listaNumeros.get(1));
		//saber la longitud
		System.out.println(listaNumeros.size());
		//borrar un elemento
		listaNumeros.remove(1);
		System.out.println(listaNumeros);
		//recorrer listas
		for(int i=0;i<listaNumeros.size();i++) {
			Integer elemento = listaNumeros.get(i);
			System.out.println(elemento);
		}
		listaNumeros.clear();
		for (int i = 1; i < 101; i++) {
			listaNumeros.add(i);
		}
		for(Integer n: listaNumeros) {
			System.out.println(n);
		}
	}

}
