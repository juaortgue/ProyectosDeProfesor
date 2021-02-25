package Principal;

public class Main {

	public static void main(String[] args) {
		/*
		 * Una clase padre es aquella que define metodos y atributos
		 *  y los implementa
		 * La clase hijo hereda del padre sus atributos y funciones,
		 * la clase hijo implementa las funciones del padre y las modifica
		 * a su gusto
		 */
		Persona p1 = new Persona("Salesianos", "Pepe los palotes", "1");
		p1.darClase();
		//para crear un objeto que hereda de otro, se pone
		//el tipo del PADRE y en el new EL DEL HIJO
		Persona a1 = new Alumno("Nestor almendros", "Alvaro", "123", 9.9);
		a1.darClase();
		Persona prof1 = new Profesor("pepe", "pepe", "pepe", 999999.99999);
		prof1.darClase();

	}

}
