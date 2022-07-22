package principal;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<>();
		//numeros.add("PEPE");
		numeros.add(222222);
		numeros.add(2);
		numeros.add(1000);
		System.out.println(numeros);
		System.out.println(numeros.size());
		//bucle for mejorado
		for(Integer n: numeros) {
			System.out.println(n);
		}
		//borramos por el objeto en este caso un integer
		numeros.remove(2);
		System.out.println(numeros);
		numeros.clear();
		//conjuntos ordenados
		Set<Integer> ordenados = new TreeSet<>();
		ordenados.add(10);
		ordenados.add(1);
		System.out.println(ordenados);
	}

}
