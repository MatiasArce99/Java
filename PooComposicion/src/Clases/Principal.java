package Clases;

public class Principal {
	
	public static void main(String[] args) {
		
		Producto p1 = new Producto(1, "Yerba Mate", 1000);
		Producto p2 = new Producto(2, "Leche", 320);
		Producto p3 = new Producto(3, "Café Tostado", 3200);
		Producto p4 = new Producto(4, "Jamón cocido", 950);
		Producto p5 = new Producto(5, "Galletas saladas", 500);
		Venta v = new Venta(22336);
		v.agregar(p1, 1);
		v.agregar(p2, 5);
		v.agregar(p3, 1);
		v.agregar(p4, 2);
		v.agregar(p5, 2);
		v.mostrarTicket();
		
	}

}
