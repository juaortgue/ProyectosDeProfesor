package modelos;

public class Rombo extends Figura{

	private Double dMayor;
	private Double dMenor;
	private Double area;
	public Rombo(String color,Double dma, Double dme ) {
		super(color);
		if(dma>dme) {
			this.dMayor=dma;
			this.dMenor=dme;
		}else {
			System.out.println("Error diagonales.");
		}
		
		// TODO Auto-generated constructor stub
	}
	public Double getdMayor() {
		return dMayor;
	}
	public void setdMayor(Double dMayor) {
		this.dMayor = dMayor;
	}
	public Double getdMenor() {
		return dMenor;
	}
	public void setdMenor(Double dMenor) {
		this.dMenor = dMenor;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public Rombo(String color, Double dMayor, Double dMenor, Double area) {
		super(color);
		this.dMayor = dMayor;
		this.dMenor = dMenor;
		this.area = area;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((dMayor == null) ? 0 : dMayor.hashCode());
		result = prime * result + ((dMenor == null) ? 0 : dMenor.hashCode());
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
		Rombo other = (Rombo) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (dMayor == null) {
			if (other.dMayor != null)
				return false;
		} else if (!dMayor.equals(other.dMayor))
			return false;
		if (dMenor == null) {
			if (other.dMenor != null)
				return false;
		} else if (!dMenor.equals(other.dMenor))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Rombo [dMayor=" + dMayor + ", dMenor=" + dMenor + ", area=" + area + "]";
	}
	
	public Double calcularArea() {
		// TODO Auto-generated method stub
		Double a = this.dMayor*this.dMenor;
		setArea(a);
		return a;
	}
	public void soyGuapo() {
		if(this.getdMayor()>2.0) {
			System.out.println("Soy guapo");
		}else {
			System.out.println("Soy un ogro");
		}
	}

}
