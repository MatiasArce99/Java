package Clases;

public class CuentaCorriente extends Cuenta{
	private int numeroCheque = 100;
	
	public CuentaCorriente(double saldo, String propietario) {
		super(saldo, propietario);
	}

	public int getNumeroCheque() {
		return numeroCheque;
	}

	public void setNumeroCheque(int numeroCheque) {
		this.numeroCheque = numeroCheque;
	}	
	
	public void extraer(double monto) {
		saldo = saldo - monto;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nCuenta corriente. Cantidad de cheques: "+numeroCheque;
	}
}
