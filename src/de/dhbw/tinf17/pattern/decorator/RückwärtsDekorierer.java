package de.dhbw.tinf17.pattern.decorator;

public class RückwärtsDekorierer extends NachrichtDekorierer {
	
	public RückwärtsDekorierer(Nachricht nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void drucke(String bisherigeNachricht) {
		StringBuilder builder = new StringBuilder(bisherigeNachricht);
		super.drucke(builder.reverse().toString());
	}
}
