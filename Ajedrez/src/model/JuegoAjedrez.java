package model;

import java.util.Arrays;

public class JuegoAjedrez {
	private char tablero[][];
	private int fil;
	private int col;
	public JuegoAjedrez(int fil, int col) {
		super();
		this.tablero = null;
		this.fil = fil;
		this.col=col;
	}
	public char[][] getTablero() {
		return tablero;
	}
	public void setTablero(char[][] tablero) {
		this.tablero = tablero;
	}
	public int getFil() {
		return fil;
	}
	public void setFil(int fil) {
		this.fil = fil;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	@Override
	public String toString() {
		return "JuegoAjedrez [tablero=" + Arrays.toString(tablero) + ", fil=" + fil + ", col=" + col + "]";
	};
	public void rellenarTablero() {
		char tableroNuevo[][] = new char[8][8];
		for (int i = 0; i < tableroNuevo.length; i++) {
			for(int j=0;j<tableroNuevo.length;j++) {
				if((i+1+j+1)%2==0) {
					tableroNuevo[i][j]='B';
				}else {
					tableroNuevo[i][j]='N';

				}
				System.out.print(tableroNuevo[i][j]+"  ");
			}
			System.out.println();
		}
		this.setTablero(tableroNuevo);
		
	}
	public void mostrarMovimientosTorre() {
		for(int i = 0; i<this.getTablero().length;i++) {
			for(int j=0;j<this.getTablero().length;j++) {
				if(i==this.fil || j==this.getCol()) {
					System.out.print("T  ");
				}else {
					System.out.print("_  ");
				}
			}
			System.out.println();
		}
	}
	
	
	

}
