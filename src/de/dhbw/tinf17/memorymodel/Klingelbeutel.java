package de.dhbw.tinf17.memorymodel;

public class Klingelbeutel {
	
	private int münzen;
	private final Object sperre;
	private final Object sperre2;
	
	public Klingelbeutel() {
		super();
		münzen = 0;
		this.sperre = new Object();
		this.sperre2 = new Object();
	}
	
	public void werfeEin() {
		synchronized (this.sperre) {
			münzen = münzen + 1;
		}
	}
	
	public void holeRaus() {
		synchronized (this.sperre) {
			münzen = münzen - 1;
		}
	}
	
	@Override
	public String toString() {
		return String.valueOf(münzen);
	}
}
