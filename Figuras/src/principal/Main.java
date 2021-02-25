package principal;

import modelos.Figura;
import modelos.Rombo;
import modelos.Triangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EJEMPLO CLASE ABSTRACTA
		Triangulo c1 = new Triangulo("blanco", 10.2, 20.5);
		Rombo r1 = new Rombo("negro", 20.4, 10.3);
		//Figura f1 = new Figura("qewwqe");
		
		//el polimorfimos es la capacidad de que un metodo
		//reciba mediante un tipo de objeto padre, muchos hijos
		//para ello, las clases hijos deben ser a la vez clase padre
		
		Figura t1 = new Triangulo("rojo", 12.2, 10.3);
		Figura r2 = new Rombo("blanco", 30.5, 30.2);
		ejemploPolimorfismo(t1);
		ejemploPolimorfismo(r2);
		
	}
	//si no existiese el polimorfismo tendria que definir un metodo 
	//para cada tipo de figura, imagina que son 100 figuras=100 metodos distintos
	//EJEMPLO DE NO POLIMORFISMO
	public static void saludarTriangulo(Triangulo t) {
		t.soyAltisimo();
	}
	public static void saludarRombo(Rombo r) {
		r.soyGuapo();
	}
	
	//EJEMPLO USANDO POLIMORFISMO
	public static void ejemploPolimorfismo(Figura f) {
		if(f instanceof Triangulo) {
			Triangulo t  = (Triangulo)f;
			t.soyAltisimo();
		}
		if(f instanceof Rombo) {
			Rombo r = (Rombo)f;
			r.soyGuapo();
		}
		
	}
	
	

}
