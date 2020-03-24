package de.dhbw.tinf17.pattern.decorator;

public class R�ckw�rtsDekorierer extends NachrichtDekorierer {
	
	public R�ckw�rtsDekorierer(Nachricht nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public String alsText() {
		String bisherigeNachricht = super.alsText();
		StringBuilder builder = new StringBuilder(bisherigeNachricht);
		return builder.reverse().toString();
	}
}
