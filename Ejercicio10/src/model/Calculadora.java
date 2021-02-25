package model;

public class Calculadora {
	private double numero;

	/*
	 * (int, long, float y double) llamados get{Tipo} y set{Tipo}
	 */
	public Calculadora() {

	}

	public Calculadora(double n) {
		this.numero = n;
	}

	public Double getNumeroDouble() {
		return this.numero;
	}

	public long getNumeroLong() {
		return (long) this.numero;
	}

	public int getNumeroInt() {
		return (int) this.numero;
	}

	public float getNumeroFloat() {
		return (float) this.numero;
	}

	public void setNumero(Double n) {
		this.numero = n;
	}

	public void setNumero(int n) {
		this.numero = (double) n;
	}

	public double sumar(double n) {
		return this.getNumeroDouble() + n;
	}

	public int sumar(int n) {
		return this.getNumeroInt() + n;
	}

	public double dividir(double n) {
		double resultado = 0.0;
		if ((this.getNumeroDouble() != 0.0)) {
			resultado = this.getNumeroDouble() / n;
		} else {
			System.out.println("No puedes dividir");
			resultado=0.0;
		}
		return resultado;
	}

}
