package Principal;

public class Agaporni implements AnimalInterfaz {

	public Agaporni() {

	}

	@Override
	public void hacerRuido(String ruido) {
		System.out.println("PIO PIO");
	}

	@Override
	public Boolean estaVacunado() {
		return true;
	}
}
