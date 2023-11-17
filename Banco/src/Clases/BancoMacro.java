package Clases;
import java.util.*;
public class BancoMacro {
	ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
	
	public void agregarCuenta(Cuenta c) {
		cuentas.add(c);
	}
	
	public void mostrarCuentas() {
		for(int i = 0; i < cuentas.size(); i ++ ) {
			System.out.println(cuentas.get(i));
			System.out.println("\n");
		}
	}
	
	public void cobrarMantenimiento() {
		for (Cuenta cuenta : cuentas) {
			cuenta.extraer(50);
		}
	}
	
}
