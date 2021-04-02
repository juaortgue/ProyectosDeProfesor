package fp.ventaTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fp.utiles.Color;
import fp.ventaCoches.Coche;

public class Test {

	public static void main(String[] args) {
		/*
		 * En la siguiente fase debéis crear el proyecto y el tipo base.
		 * 
		 * El nombre del proyecto será Proyecto_uvus, siendo uvus su nombre de usuario
		 * virtual de la Universidad de Sevilla. Este mismo nombre se utilizará para
		 * nombrar el fichero zip cuando haya que exportarlo. Supongamos por ejemplo que
		 * el dataset del usuario demouser contiene datos sobre los vuelos de un
		 * aeropuerto. En tal caso, la estructura de su proyecto podría ser la
		 * siguiente: Requisitos:
		 * 
		 * 
		 * Un constructor con todas las propiedades básicas Una propiedad derivada Todas
		 * las propiedades básicas deben ser consultables y modificables Tres
		 * restricciones Un criterio de igualdad Un orden natural Realizar un test tal
		 * que:
		 * 
		 * 
		 * Cree un objeto correcto y lo imprima por pantalla Cree tantos objetos
		 * incorrectos como restricciones haya, y comprobar que se eleva cada excepción
		 */
		// creacion por constructor
		// creacion por metodo of = factoria y es estatico
		// Coche c2 = Coche.of("marca","modelo",100.230, 100.0,new Date(),Color.BLANCO);
		// accedo a metodo estatico
		// Coche.saludar();
		//coche creado con exito
		System.out.println("Creando coche con exito....");
		Coche c1 = new Coche("BMW", "300", 100000.300, 100.0, LocalDate.now(), Color.BLANCO);
		System.out.println(c1);

		//precio negativo
		System.out.println("Creando coche con error en precio....");
		Coche c2 = new Coche("BMW", "200", 0.0, 100.0, LocalDate.now(), Color.VERDE);
		//iva negativo
		System.out.println("Creando coche con error en iva negativo....");
		Coche c3 = new Coche("BMW", "100", 100000.300, -100.0, LocalDate.now(), Color.BLANCO);
		//iva mayor que precio
		System.out.println("Creando coche con error en iva => precio....");
		Coche c4 = new Coche("BMW", "500", 100000.300, 100000.300, LocalDate.now(), Color.BLANCO);
		System.out.println("Creando coche con error en la fecha....");
		Coche c5 = new Coche("BMW", "700", 20000.3050, 100.0, LocalDate.now().plusDays(1), Color.VERDE);
		
		//mas coches
		Coche c6 = new Coche("FERRARI", "10000", 200.30, 1.0, LocalDate.now(), Color.ROJO);
		Coche c7 = new Coche("MERCEDES", "adsadasd", 500000.13213, 123.0, LocalDate.now(), Color.ROJO);
		Coche c8 = new Coche("FORD", "FIESTA", 30.13213, 2.0, LocalDate.now(), Color.NEGRO);

		List<Coche> ls = new ArrayList<Coche>();
		ls.add(c1);
		ls.add(c6);
		ls.add(c7);
		ls.add(c8);
		System.out.println("Lista sin ordenar: ");
		System.out.println(ls);
		//ordenar por orden natural
		Collections.sort(ls);
		System.out.println("Lista orden natural: ");
		System.out.println(ls);

	}

}
