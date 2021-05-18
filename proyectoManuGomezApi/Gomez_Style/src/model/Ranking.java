package model;

import java.util.List;

public class Ranking implements Comparable<Ranking> {

	// ATRIBUTOS
	private Integer id_ranking;
	private String fecha;
	private Double dinero_facturado;
	private Double comision;

	// RELACIONES
	private List<Personal_Shopper> personal_shoppers;

	// CONSTRUCTOR POR VACIO

	public Ranking() {
		super();
	}

	// CONSTRUCTOR CON TODOS LOS ATRIBUTOS

	public Ranking(Integer id_ranking, String fecha, Double dinero_facturado, Double comision,
			List<Personal_Shopper> personal_shoppers) {
		super();
		setId_ranking(id_ranking);
		setFecha(fecha);
		setDinero_facturado(dinero_facturado);
		setComision(comision);
		setPersonal_shoppers(personal_shoppers);
	}

	// CONSTRUCTOR CON LOS DATOS DEL RANKING
	public Ranking(Integer id_ranking, String fecha, Double dinero_facturado, Double comision) {
		super();
		setId_ranking(id_ranking);
		setFecha(fecha);
		setDinero_facturado(dinero_facturado);
		setComision(comision);

	}

	// CONSTRUCTOR PASADO TRES ATRIBUTOS
	public Ranking(String fecha, Double dinero_facturado, Double comision) {
		super();

		setFecha(fecha);
		setDinero_facturado(dinero_facturado);
		setComision(comision);

	}

	// LOS GETTER AND SETTER

	public Integer getId_ranking() {
		return id_ranking;
	}

	public void setId_ranking(Integer id_ranking) {
		this.id_ranking = id_ranking;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Double getDinero_facturado() {
		return dinero_facturado;
	}

	public void setDinero_facturado(Double dinero_facturado) {
		this.dinero_facturado = dinero_facturado;
	}

	public Double getComision() {
		return comision;
	}

	public void setComision(Double comision) {
		this.comision = comision;
	}

	public List<Personal_Shopper> getPersonal_shoppers() {
		return personal_shoppers;
	}

	public void setPersonal_shoppers(List<Personal_Shopper> personal_shoppers) {
		this.personal_shoppers = personal_shoppers;
	}

	// EQUALS POR DEFECTO

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ranking other = (Ranking) obj;
		if (comision == null) {
			if (other.comision != null)
				return false;
		} else if (!comision.equals(other.comision))
			return false;
		if (dinero_facturado == null) {
			if (other.dinero_facturado != null)
				return false;
		} else if (!dinero_facturado.equals(other.dinero_facturado))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id_ranking == null) {
			if (other.id_ranking != null)
				return false;
		} else if (!id_ranking.equals(other.id_ranking))
			return false;
		if (personal_shoppers == null) {
			if (other.personal_shoppers != null)
				return false;
		} else if (!personal_shoppers.equals(other.personal_shoppers))
			return false;
		return true;
	}

	// TOSTRING

	@Override
	public String toString() {
		return "Ranking--> ID: " + id_ranking + ", FECHA: " + fecha + ", DINERO FACURADO: " + dinero_facturado
				+ ", COMISIÓN: " + comision + ", PERSONAL SHOPPER: " + personal_shoppers;
	}

	// COMPARAR RANKING POR FECHA

	@Override
	public int compareTo(Ranking o) {
		return this.fecha.compareTo(o.getFecha());

	}

}
