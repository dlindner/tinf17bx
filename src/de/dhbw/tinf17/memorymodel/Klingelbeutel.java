package de.dhbw.tinf17.memorymodel;

public class Klingelbeutel {
	
	private int m�nzen;
	private final Object sperre;
	private final Object sperre2;
	
	public Klingelbeutel() {
		super();
		m�nzen = 0;
		this.sperre = new Object();
		this.sperre2 = new Object();
	}
	
	public void werfeEin() {
		synchronized (this.sperre) {
			m�nzen = m�nzen + 1;
		}
	}
	
	public void holeRaus() {
		synchronized (this.sperre) {
			m�nzen = m�nzen - 1;
		}
	}
	
	@Override
	public String toString() {
		return String.valueOf(m�nzen);
	}
}
