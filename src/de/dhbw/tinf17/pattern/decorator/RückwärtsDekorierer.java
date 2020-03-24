package de.dhbw.tinf17.pattern.decorator;

public class R�ckw�rtsDekorierer extends NachrichtDekorierer {
	
	public R�ckw�rtsDekorierer(Nachricht nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void drucke(String bisherigeNachricht) {
		StringBuilder builder = new StringBuilder(bisherigeNachricht);
		super.drucke(builder.reverse().toString());
	}
}
