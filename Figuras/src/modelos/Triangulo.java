package modelos;

public class Triangulo extends Figura{
	
	private double base;
	private double altura;
	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(base);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangulo other = (Triangulo) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (Double.doubleToLongBits(base) != Double.doubleToLongBits(other.base))
			return false;
		return true;
	}
	//sobreescritura
	@Override
	public Double calcularArea() {
		/*
		 * 1ºCalcular area del triangulo = b*h/2
		 * 2º setear mi area
		 * 3º devolver area
		 */
		Double a = (this.base*this.altura)/2;
		setArea(a);
		return a;
	}
	
	public void soyAltisimo() {
		System.out.println("Soy alto y punto");
	}
	
}
