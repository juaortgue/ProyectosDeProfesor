package model;

import java.util.Arrays;
import java.util.Date;

public class Tienda {
	private Articulo articulos[];
	private Integer cantidades[];
	private Cliente clientes[];
	private Integer numArticulos;
	private Integer numClientes;

	public Tienda(Articulo[] articulos, Integer[] cantidades, Cliente[] clientes, Integer numArticulos,
			Integer numClientes) {
		super();
		this.articulos = articulos;
		this.cantidades = cantidades;
		this.clientes = clientes;
		this.numArticulos = numArticulos;
		this.numClientes = numClientes;
	}

	public Tienda() {
		// TODO Auto-generated constructor stub
		this.clientes = new Cliente[10];
		this.numClientes = 0;
	}

	public Articulo[] getArticulos() {
		return articulos;
	}

	public void setArticulos(Articulo[] articulos) {
		this.articulos = articulos;
	}

	public Integer[] getCantidades() {
		return cantidades;
	}

	public void setCantidades(Integer[] cantidades) {
		this.cantidades = cantidades;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public Integer getNumArticulos() {
		return numArticulos;
	}

	public void setNumArticulos(Integer numArticulos) {
		this.numArticulos = numArticulos;
	}

	public Integer getNumClientes() {
		return numClientes;
	}

	public void setNumClientes(Integer numClientes) {
		this.numClientes = numClientes;
	}

	@Override
	public String toString() {
		return "Tienda [articulos=" + Arrays.toString(articulos) + ", cantidades=" + Arrays.toString(cantidades)
				+ ", clientes=" + Arrays.toString(clientes) + ", numArticulos=" + numArticulos + ", numClientes="
				+ numClientes + "]";
	}

	public void llenarAlmacen() {
		/*
		 * 1� Creamos los articulos 2� los a�adimos a un array de articulos 3� el array
		 * se lo metemos a la tienda
		 */
		Articulo a0 = new Articulo(0, "Cero", 10.);
		Articulo a1 = new Articulo(1, "uno", 20.);
		Articulo a2 = new Articulo(2, "dos", 15.);
		Articulo a3 = new Articulo(3, "tres", 180.);
		Articulo a4 = new Articulo(4, "cuatro", 105.);
		Articulo a5 = new Articulo(5, "cinco", 99.);
		Articulo arrayArticulos[] = { a0, a1, a2, a3, a4, a5 };
		Integer arrayCantidades[] = { 12, 9, 10, 4, 1, 2 };
		this.setArticulos(arrayArticulos);
		this.setCantidades(arrayCantidades);
		this.setNumArticulos(arrayArticulos.length);
		/*
		 * La salida de este programa deber�a ser la siguiente: Mostrando inventario de
		 * la tienda: ----------------------------------------------------------- [ 0]
		 * Articulo: Cero (ref. 0), 10.0 euros + iva Cantidad en stock: 12
		 * ----------------------------------------------------------- [ 1] Articulo:
		 * Uno (ref. 1), 20.0 euros + iva Cantidad en stock: 9
		 * ----------------------------------------------------------- [ 2] Articulo:
		 * Dos (ref. 2), 15.0 euros + iva Cantidad en stock: 10
		 * ----------------------------------------------------------- [ 3] Articulo:
		 * Tres (ref. 3), 180.0 euros + iva Cantidad en stock: 15
		 * ----------------------------------------------------------- [ 4] Articulo:
		 * Cuatro (ref. 4), 105.0 euros + iva Cantidad en stock: 4
		 * ----------------------------------------------------------- [ 5] Articulo:
		 * Cinco (ref. 5)
		 * 
		 */
	}

	public void mostrarInventario() {
		System.out.println("Mostrando inventario de\r\n" + "		 * la tienda: ------------------------------"
				+ "-----------------------------");

		for (int i = 0; i < this.getNumArticulos(); i++) {
			Articulo a = this.getArticulos()[i];
			System.out.println("Art�culo: " + a.getNombre() + " (ref. " + a.getId() + ") ," + a.getPrecio() + " euros, "
					+ "stock : " + this.getCantidades()[i] + " unidades.");

			System.out.println("-------------------------------------------");
		}
	}

	public void aniadirCliente(Cliente c) {
		Integer numClient = this.getNumClientes();
		// cojo los clientes que tengo
		Cliente clienteLista[] = this.getClientes();
		// le a�ado el nuevo
		clienteLista[numClient] = c;
		// con la lista ya actualizada se la paso a mi tienda para
		// que tenga todos los clientes
		this.setClientes(clienteLista);
		// en base a lenght obtengo el n� de liente de mi tienda
		this.setNumClientes(this.getClientes().length);
		// int nClientes = this.getNumClientes()+1;

	}

	public Articulo[] obtenerArticulos() {
		// TODO Auto-generated method stub
		return this.getArticulos();
	}

	/*
	 * private String nombre; private Double saldo; private Articulo
	 * historialArticulos[]; private Date historialFechas[]; private Articulo
	 * carrito[]; private Integer tamanioCarrito; private Integer tamanioHistorial;
	 */
	public void vender(Articulo a, Cliente c) {
		if (a.getPrecio() > c.getSaldo()) {
			System.out.println("El saldo del cliente es insuficiente.");
		} else {
			System.out.println("Vendiendo.....");
			c.setSaldo(c.getSaldo() - a.getPrecio());
			// obtenemos la posicion del articulo para bajarle en uno el stock
			int posicion = 0;
			for (int i = 0; i < this.getArticulos().length; i++) {
				if (this.getArticulos()[i].equals(a)) {
					posicion = i;
				}
			}
			// ahora quitamos en uno el stock
			Integer[] cantidadesAntigua = this.getCantidades();
			cantidadesAntigua[posicion] -= 1;
			this.setCantidades(cantidadesAntigua);
			modificarClienteVenta(c, a);
		}
	}

	private void modificarClienteVenta(Cliente c, Articulo a) {
		Articulo[] historial = c.getHistorialArticulos();
		historial[c.getTamanioHistorial()] = a;
		c.setHistorialArticulos(historial);
		Date[] fechas = c.getHistorialFechas();
		fechas[c.tamanioFechas] = new Date(System.currentTimeMillis());
		c.setHistorialFechas(fechas);
	}

}
