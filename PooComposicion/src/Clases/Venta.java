package Clases;

import java.util.*;

public class Venta {
	
	private int numeroFactura;
	private Fecha f = new Fecha(); //Composición
	ArrayList<LineaVenta> lv = new ArrayList<LineaVenta>();
	//Para ArrayList no hay métodos get ni set.
	
	public Venta(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	
	public void agregar(Producto pro, int cantidad) {
		LineaVenta linea = new LineaVenta(cantidad, pro); //Composición
		lv.add(linea);
	}
	
	public double calcularTotal() {
		double total = 0;
		for(LineaVenta linea : lv) {
			total += linea.calcularSubtotal();
		}
		return total;
	}
	
	public void mostrarTicket() {
		System.out.println("Número de Factura: "+numeroFactura);
		System.out.println("Fecha: "+f);
		System.out.println("Total a pagar: $"+calcularTotal());
		
		for(int i = 0; i < lv.size(); i ++) {
			System.out.println(lv.get(i));
		}
	}

}