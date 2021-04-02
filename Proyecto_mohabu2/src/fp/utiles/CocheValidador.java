package fp.utiles;

import java.time.LocalDate;

public class CocheValidador {
	public static Boolean validarPrecio(Double p) {
		Boolean result = true;
		if(p<=0) {
			result=false;
			System.out.println("Error precio");
		}
		return result;
	}
	public static Boolean validarIva(Double p, Double i) {
		Boolean result = true;
		if(i<=0 || i>=p) {
			result = false;
			System.out.println("Error iva");

		}
		return result;
	}
	public static Boolean validarFecha(LocalDate f) {
		Boolean result = true;
		// menor o igual
		if(f.isAfter(LocalDate.now())){
			result=false;
			System.out.println("Error fecha");

		}
		return result;
	}
}
