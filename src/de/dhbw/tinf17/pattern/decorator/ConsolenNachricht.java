package de.dhbw.tinf17.pattern.decorator;

public class ConsolenNachricht implements Nachricht {
	
	public ConsolenNachricht() {
		super();
	}
	
	@Override
	public void drucke(String text) {
		System.out.println(text);
	}
}
