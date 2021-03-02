package main;

import model.Articulo;
import model.Cliente;
import model.Tienda;

public class Main {

	public static void main(String[] args) {
		// Creamos tienda, llenamos el almacen y mostramos el inventario:
		Tienda t = new Tienda();
		t.llenarAlmacen();
		t.mostrarInventario();
		// Creamos cliente, lo registramos en la tienda y mostramos su saldo:
		Cliente c = new Cliente("Pedro", 1000);
		t.aniadirCliente(c);
		c.mostrarSaldo();
		c.aumentarSaldo(350.0);
		c.aumentarSaldo(-1000.9999);
		System.out.println("Mi saldo es: "+c.getSaldo());
		// Obtenemos array de articulos en la tienda:
		Articulo[] articulos = t.obtenerArticulos();
		t.vender(articulos[0], c);
		t.mostrarInventario();
		c.mostrarSaldo();
		c.mostrarHistorial();
	}

}
