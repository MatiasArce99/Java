package Clases;

public class Principal {

	public static void main(String[] args) {
		BancoMacro bm = new BancoMacro();
		bm.agregarCuenta(new Cuenta(200500, "Matías")); //Polimorfismo
		bm.agregarCuenta(new Cuenta(300000, "Daniel"));
		bm.cobrarMantenimiento();
		bm.agregarCuenta(new CajaAhorro(150000, "León"));
		bm.mostrarCuentas();
	}
}