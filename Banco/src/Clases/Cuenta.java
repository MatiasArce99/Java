package Clases;

public class Cuenta {
	protected double saldo;
	private Fecha f = new Fecha(); //Composición
	private String propietario;
	
	public Cuenta(double saldo, String propietario) {
		this.saldo = saldo;
		this.propietario = propietario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Fecha getF() {
		return f;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	public void extraer(double monto) {
		if(monto > saldo) {
			System.out.println("Saldo insuficiente");
		} else {
			saldo = saldo - monto;
		}
	}
	
	public void depositar(double monto) {
		saldo = saldo + monto;
	}
	
	@Override
	public String toString() {
		return "Propietario: "+propietario+"\nSaldo actual: $"+saldo+"\nFecha: "+f;
	}
	
}
