package principal;

public class Bucles {

	public static void main(String[] args) {
		Integer contador = 0;
		while(contador<5) {
			System.out.println("Se mete en el while");
			System.out.println(contador);
			contador++;
		}
		for(int i=0;i<5;i++) {
			System.out.println("Se mete en el for");
			System.out.println(i);
		}
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
				
			}
		}
		/*realizar un programa que calcule el factorial de 10*/
		System.out.println("------------------------------\nFACTORIAL");
		Integer factorial=1;
		for(int i=2;i<10;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
		/*imprimir los numeros multiplos de 2 y 5 desde el 1 al 100*/
		int a=2,b=5;
		for(int i=0;i<100;i++) {
			if(i%a==0 && i%b==0) {
				System.out.println(i);
			}
		}
	}

}
