package Clases;
import java.util.*;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;
	
	public Fecha() {
		this.dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		this.mes = Calendar.getInstance().get(Calendar.MONTH) + 1;
		this.anio = Calendar.getInstance().get(Calendar.YEAR);
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	@Override
	public String toString() {
		return dia+"/"+mes+"/"+anio;
	}
	
}
