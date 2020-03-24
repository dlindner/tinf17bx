package de.dhbw.tinf17.pattern.decorator;

public class CoolnessDekorierer extends NachrichtDekorierer {
	
	public CoolnessDekorierer(Nachricht nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public String alsText() {
		String bisherigeNachricht = super.alsText();
		return "xXx " + bisherigeNachricht + " xXx";
	}
}
