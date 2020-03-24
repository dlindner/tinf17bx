package de.dhbw.tinf17.pattern.decorator;

public class TextNachricht implements Nachricht {
	
	private final String text;

	public TextNachricht(String text) {
		super();
		this.text = text;
	}
	
	@Override
	public String alsText() {
		return this.text;
	}
}
