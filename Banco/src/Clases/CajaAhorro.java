package Clases;

public class CajaAhorro extends Cuenta{
	private double interesMensual = 3;
	
	public CajaAhorro(double saldo, String propietario) {
		super(saldo, propietario);
	}

	public double getInteresMensual() {
		return interesMensual;
	}

	public void setInteresMensual(double interesMensual) {
		this.interesMensual = interesMensual;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nCaja de ahorro, interés mensual: %"+interesMensual;
	}
}
