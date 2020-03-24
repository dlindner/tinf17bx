package de.dhbw.tinf17.pattern.decorator;

public class GroﬂschreibeDekorierer extends NachrichtDekorierer {
	
	public GroﬂschreibeDekorierer(Nachricht nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void drucke(String text) {
		super.drucke(text.toUpperCase());
	}
}
