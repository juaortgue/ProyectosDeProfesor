package Principal;

public class Ejercicio3 {
//[1,2,3,4,5]
	public static void main(String[] args) {
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i]=i;
			System.out.println(a[i]);
		}
		System.out.println("-------------------------");
		for(int j = a.length-1;j>0;j--) {
			System.out.println(a[j]);
		}
		//3-->9,3+1=4*4=16
		//[1,2,3] 0,1,2 tam = 3

	}

}
