package Clases;

public class LineaVenta {
	
	private int cantidad;
	private Producto p;
	
	public LineaVenta(int cantidad, Producto p) {
		this.cantidad = cantidad;
		this.p = p;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getP() {
		return p;
	}

	public void setP(Producto p) {
		this.p = p;
	}
	
	public double calcularSubtotal() {
		return cantidad * p.getPrecio();
	}

	@Override
	public String toString() {
		return "Cantidad: "+cantidad+"\t"+p.getNombre()+"\tSubtotal: $"+calcularSubtotal();
	}
	
}