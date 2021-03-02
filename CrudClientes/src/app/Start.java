package app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.CNuevo;
import model.COcasion;
import model.Cliente;
import model.Coche;
import model.Empleado;
import model.Persona;

public class Start {

	public static void main(String[] args) {
		Start application = new Start();
		application.init();
		application.introducionConjuntos();
	}

	private void introducionConjuntos() {
		/*
		 * Un conjunto es como una lista PERO no se pueden repetir elementos,
		 * 
		 */
		// Set es una interfaz y hashset la implementa
		Set<Integer> c = new HashSet<Integer>();
		// add
		c.add(1);
		System.out.println(c.add(2));
		c.add(3);
		System.out.println(c);
		// no admite valores repetidos

		System.out.println("Está el 5 ?:" + c.contains(5));
		c.forEach(x -> System.out.println(x));
		c.remove(3);
		System.out.println(c.add(3));
		System.out.println("¿Esta vacío?:" + c.isEmpty());
		System.out.println(c);
		System.out.println("Borrando set.....");
		/*
		 * c.clear(); System.out.println("¿Después del clear esta vacío¿: " +
		 * c.isEmpty()); System.out.println(c);
		 */
		System.out.println("Tamaño del conjunto = " + c.size());
		// el set no puede acceder a sus indices
		/*
		 * for (int i = 0; i < c.size(); i++) { System.out.println(c.); }
		 */
		// para recorrerlo usamos un FOR MEJORADO
		int posicion = 0;
		for (Integer num : c) {
			System.out.println("posicion:" + posicion + " = " + num);
			posicion++;

		}
	}

	private void init() {
		System.out.println("Inicio del programa:\n");
		// Coche c1 = new Coche();
		CNuevo cn1 = new CNuevo("BMW", "300", "1234", 2021);
		
		System.out.println(cn1);
		COcasion co1 = new COcasion("LAMBORGINI", "0909", "5678", 9999999);

		System.out.println(co1);

		// creamos un conjunto de coches
		Set<Coche> coches = new HashSet<Coche>();
		coches.add(cn1);
		coches.add(co1);
		for (Coche c : coches) {
			System.out.println(c);
		}
		List<Persona> gente = new ArrayList<>();

		gente.add(new Empleado("Pepe", "López", "mecánico"));

		gente.add(new Empleado("Carlos", "Hortal", "administrativo"));

		Set<Coche> lst1 = new HashSet<Coche>();
		lst1.add(new CNuevo("Audi", "A4", "SE-112233", 2017));
		lst1.add(new CNuevo("Seat", "Toledo", "SE-445566", 2018));
		gente.add(new Cliente("Pedro", "Solís", "pedro@gmail.com", lst1));

		Set<Coche> lst2 = new HashSet<Coche>();
		lst2.add(new COcasion("Fiat", "Punto", "CO-1234", 2));
		lst2.add(new CNuevo("Ford", "Fiesta", "HU-6789", 2006));
		gente.add(new Cliente("María", "García", "maria@hotmail.com", lst2));

		Set<Coche> lst3 = new HashSet<Coche>();
		gente.add(new Cliente("Ana", "Hurtado", "anah@hotmail.com", lst3));

		gente.add(new Cliente("Jose", "Juncal", "jj@hotmail.com", new HashSet<Coche>()));

		System.out.println("----------------------------");
		Cliente c4 = new Cliente("pepe", "pepito", "pepe@gmail.com", lst2);
		/*c4.metodoEstatico();
		Cliente.metodoEstatico();*/
	}

	/*
	 * Gracias a un objeto comun y abstracto podemos crear menos metodos para los
	 * hijos
	 */
	public void esEmpleado(Empleado e) {
		if (e instanceof Empleado) {
			System.out.println("Es empleado");
		} else {
			System.out.println("No es empleado");
		}
	}

	public static void esCliente(Cliente c) {
		if (c instanceof Cliente) {
			System.out.println("Es Cliente");
		} else {
			System.out.println("No es Cliente");
		}
	}
	public void obtenerTipo(Persona p) {
		if(p instanceof Empleado) {
			System.out.println(p);
		}else {
			System.out.println(p);
		}
	}

}
