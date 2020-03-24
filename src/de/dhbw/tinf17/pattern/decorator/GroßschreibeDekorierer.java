package de.dhbw.tinf17.pattern.decorator;

public class Gro�schreibeDekorierer extends NachrichtDekorierer {
	
	public Gro�schreibeDekorierer(Nachricht nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void drucke(String text) {
		super.drucke(text.toUpperCase());
	}
}
