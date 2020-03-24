package de.dhbw.tinf17.pattern.decorator;

public abstract class NachrichtDekorierer implements Nachricht {
	
	private final Nachricht nachfolger;

	public NachrichtDekorierer(Nachricht nachfolger) {
		super();
		this.nachfolger = nachfolger;
	}
	
	@Override
	public void drucke(String text) {
		this.nachfolger.drucke(text);
	}
}
