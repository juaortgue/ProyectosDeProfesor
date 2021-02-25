package ejercicios;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//nombre de la clase pojo, nombre de la var, new Perro(atributos);
		//al crear un objeto le tienes que pasar los parametros por el orden
		//en que se recibe en el constructor
		Perro p1 = new Perro("Toby","Yorksire",3,false);
		System.out.println("La raza del perro es = "+p1.getRaza());
		p1.setRaza("Pastor Aleman");
		System.out.println("La nueva raza de mi perro es = "+p1.getRaza());
		//para imprimir un objeto no podemos imprimirlo y ya esta, java no entiende
		System.out.println("Mi perro es -->"+p1);
		/*
		 * Por lo tanto vamos a traducir el perro a una cadena de string
		 * para que java lo entienda y lo pueda imprimir con el metodo toString
		 */
		System.out.println(p1.toString());
		//java no necesita que pongas el .toString, porque al imprimir un objeto el se encarga de llamar
		//a la funcion
		System.out.println(p1);
		p1.ladrar();
		p1.vacunar();
		System.out.println(p1);
		p1.darPatita(true);
		p1.darPatita(false);
		
		
		//EJEMPLO DE MCDONAL
		String [] hamburguesas ={"Bigmac","Mcroyal deluxe"};
		Integer[] precios = {3,4};
		Hamburgueseria mcdonalds = new Hamburgueseria("Mcdonals", hamburguesas, precios);
		System.out.println(mcdonalds);
	}

}
