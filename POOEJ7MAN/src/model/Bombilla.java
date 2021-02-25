package model;

public class Bombilla {
	private Boolean encendida;

	public Bombilla() {
		this.encendida = false;
	}

	public Bombilla(Boolean e) {
		this.encendida = e;
	}

	public Boolean isEncendida() {
		return encendida;
	}

	public void setEncendida(Boolean e) {
		this.encendida = e;
	}

	public void encender() {
		System.out.println("Se esta encendiendo...");
		setEncendida(true);
	}

	public void apagar() {
		System.out.println("Se esta apagando....");
		setEncendida(false);
	}

	public void cambiar() {
		setEncendida(isEncendida() ? false : true);
	}

	public void mostrarBombilla() {
		System.out.println(isEncendida() ? "*" : "·");
	}

}
