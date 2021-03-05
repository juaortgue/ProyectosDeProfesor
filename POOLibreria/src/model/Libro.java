package model;

import interfaces.IConsultable;
import interfaces.IPrestable;
import interfaces.IPublicacion;

public class Libro implements IPublicacion, IPrestable, IConsultable {

	private String codigo;
	private String autor;
	private String titulo;
	private Integer anyoPublicacion;
	private Boolean prestado;
	private Boolean consultada;

	public Libro() {
		this.prestado = false;
		this.consultada = false;
	}

	public Libro(String c, String a, String t, Integer ap) {
		this.codigo = c;
		this.autor = a;
		this.titulo = t;
		this.anyoPublicacion = ap;
		this.prestado = false;
		this.consultada = false;
	}

	@Override
	public String getCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}

	@Override
	public String getAutor() {
		// TODO Auto-generated method stub
		return autor;
	}

	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return titulo;
	}

	@Override
	public Integer getAnyoPublicacion() {
		// TODO Auto-generated method stub
		return anyoPublicacion;
	}

	@Override
	public void setCodigo(String c) {
		// TODO Auto-generated method stub
		this.codigo = c;

	}

	@Override
	public void setAutor(String a) {
		// TODO Auto-generated method stub
		this.autor = a;

	}

	@Override
	public void setTitulo(String t) {
		// TODO Auto-generated method stub
		this.titulo = t;
	}

	@Override
	public void setAnyoPublicacion(Integer ap) {
		// TODO Auto-generated method stub
		this.anyoPublicacion = ap;
	}

	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", anyoPublicacion="
				+ anyoPublicacion + ", prestado=" + prestado + "]";
	}

	@Override
	public void prestar() {
		if (!this.consultada) {
			this.prestado = true;

		} else {
			System.out.println("No se puede prestar ...");
		}

	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		this.prestado = false;

	}

	@Override
	public Boolean estaPrestado() {
		// TODO Auto-generated method stub
		return this.prestado;
	}

	@Override
	public void retirar() {
		// TODO Auto-generated method stub
		// 1==1-- true
		if (!this.prestado) {
			this.consultada = true;

		} else {
			System.out.println("No se puede retirar ya que està siendo consultado");
		}
	}

	@Override
	public Boolean estaConsultando() {
		// TODO Auto-generated method stub
		return consultada;
	}

}
