package de.dhbw.tinf17.pattern.decorator;

public class CoolnessDekorierer extends NachrichtDekorierer {
	
	public CoolnessDekorierer(Nachricht nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void drucke(String bisherigeNachricht) {
		super.drucke("xXx " + bisherigeNachricht + " xXx");
	}
}
