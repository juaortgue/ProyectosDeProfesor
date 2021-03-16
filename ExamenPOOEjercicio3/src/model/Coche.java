package model;

public class Coche extends Vehiculo{
	
	private String matrica;
	private String marca;
	private String modelo;
	private int numPuertas;
	private Boolean tipoCombustiple;
	//VALIDACIONES: en constructores y en setters
	public Coche() {
		
	}
	public Coche(String matrica, String marca, String modelo, int numPuertas) {
		
		boolean tieneError=false;
		if(matrica.length()!=7) {
			System.out.println("Matricula no valida");
			tieneError=true;
		}
		if(marca.length()>150 || modelo.length()>150) {
			System.out.println("Modelo no valido");
			tieneError=true;
		}//3 4 o 5
		if(numPuertas!=3) {
			if(numPuertas!=4) {
				if(numPuertas!=5) {
					System.out.println("Puertas no validas");
					tieneError=true;
				}
			}
			
		}
		
		if(tieneError==false) {
			this.matrica = matrica;
			this.marca = marca;
			this.modelo = modelo;
			this.numPuertas = numPuertas;
			this.tipoCombustiple = true;
		}
		
	}
	public Coche(String matrica, String marca, String modelo, int numPuertas, Boolean tipoCombustiple) {
		super();
		boolean tieneError=false;
		if(matrica.length()!=7) {
			System.out.println("Matricula no valida");
			tieneError=true;
		}
		if(marca.length()>150 || modelo.length()>150) {
			System.out.println("Modelo no valido");
			tieneError=true;
		}//3 4 o 5
		if(numPuertas!=3 && numPuertas !=4 && numPuertas!=5) {
			System.out.println("Puertas no validas");
			tieneError=true;
		}
		if(tieneError==false) {
			this.matrica = matrica;
			this.marca = marca;
			this.modelo = modelo;
			this.numPuertas = numPuertas;
			this.tipoCombustiple = tipoCombustiple;
		}
	}
	@Override
	public String toString() {
		return "Coche [matrica=" + matrica + ", marca=" + marca + ", modelo=" + modelo + ", numPuertas=" + numPuertas
				+ ", tipoCombustiple=" + tipoCombustiple + "]";
	}
	public String getMatrica() {
		return matrica;
	}
	public void setMatrica(String matrica) {
		this.matrica = matrica;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if(marca.length()>150) {
			System.out.println("Error en marca");
		}else {
			System.out.println("Su marca es correcta");
			this.marca = marca;	
		}
		
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if(modelo.length()>150) {
			System.out.println("error");
		}else {
			this.modelo = modelo;

		}
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		boolean error = false;
		if(numPuertas!=4) {
			if(numPuertas!=3) {
				if(numPuertas!=5) {
					System.out.println("Error");
					error=true;
				}
			}
		}
		if(error==false) {
			this.numPuertas = numPuertas;

		}else {
			System.out.println("Como hay error no se puede setear el num puertas");
		}
	}
	public Boolean getTipoCombustiple() {
		return tipoCombustiple;
	}
	public void setTipoCombustiple(Boolean tipoCombustiple) {
		this.tipoCombustiple = tipoCombustiple;
	}
	
	
	
	
}
