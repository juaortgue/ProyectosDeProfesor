package interfaces;

public interface IConsultable {

	/*
	 * h) Defina otra interfaz IConsultable, que tenga las operaciones relacionadas
	 * con la consulta de las publicaciones consultables en la biblioteca: •
	 * retirar: No recibe ni retorna parámetros. Este método indica que una
	 * publicación es retirada para consulta. • devolver: No recibe ni retorna
	 * parámetros. Este método indica que una publicación es devuelta después de ser
	 * consultada. • estaConsultando: Este método indica si una publicación está
	 * siendo consultada
	 */
	public void retirar();
	public void devolver();
	public Boolean estaConsultando();
	
}
