package app;

import java.util.ArrayList;
import java.util.List;

import model.Coche;
import model.Concesionario;
import model.Vehiculo;

public class Main {

	/*
	 * EJERCICIO 3 (3 puntos):
	 * 
	 * Un coche se identifica por una matr�cula y tiene como atributos su marca,
	 * modelo, n�mero de puertas y tipo de combustible. Todos estos campos son
	 * obligatorios excepto el tipo de combustible. Las restricciones para este tipo
	 * de datos son las siguientes:
	 * 
	 * La matr�cula debe contener 7 caracteres. La marca y el modelo son cadena de
	 * caracteres y deben tener como m�ximo 150 caracteres (inclusivo). El n�mero de
	 * puertas debe ser un campo num�rico entero y �nicamente podr� almacenar tres
	 * posibles valores: 3, 4 y 5. El tipo de combustible es un campo l�gico que
	 * almacenar�: (true: Diesel. false: Gasolina). Existen una multitud de
	 * concesionarios ubicados por toda la geograf�a espa�ola. Cada uno de estos
	 * concesionarios podr� almacenar m�ltiples coches. Sin embargo, un coche estar�
	 * asociado �nicamente con un concesionario en concreto.
	 * 
	 * Un concesionario est� identificado por un identificador y tiene como atributo
	 * la ciudad donde se encuentra ubicado. Todos los campos para el concesionario
	 * son obligatorios. Las restricciones para este tipo de dato son las
	 * siguientes:
	 * 
	 * La ciudad es una cadena de caracteres y debe tener como m�ximo 150 caracteres
	 * (inclusivo). Un concesionario tiene una lista �nicamente de coches.
	 * 
	 * Evite que pueda crearse objetos de tipo Veh�culo (clase padre) y cree una
	 * clase main para probar el funcionamiento de la aplicaci�n. No es necesario
	 * utilizar la librer�a del uso de teclado para este ejercicio.
	 * 
	 * Evite que no puedan crearse objetivos de tipo Veh�culo (clase padre).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main.start();

	}

	public static void start() {
		System.out.println("Ejercicio 3");
		Coche c = new Coche("1234567","marca1","modelo1",3);
		Coche c2 = new Coche("4444444","marca1","modelo1",3);

		Coche c3 = new Coche("5555555","marca1","modelo1",3);

		System.out.println(c);
		c.setNumPuertas(5);
		System.out.println(c);
		List<Coche> ls = new ArrayList<Coche>();
		ls.add(c);
		ls.add(c2);
		ls.add(c3);
		Concesionario concesionario = new Concesionario(1, "Sevilla", ls);
		System.out.println(concesionario);
		//Vehiculo v = new Vehiculo();
		
		
	}

}
