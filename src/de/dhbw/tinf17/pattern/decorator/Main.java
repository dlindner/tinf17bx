package de.dhbw.tinf17.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		Nachricht nachricht = new TextNachricht("Hallo TINF17B1");
		nachricht = new RückwärtsDekorierer(nachricht);
		nachricht = new CoolnessDekorierer(nachricht);
		System.out.println(nachricht.alsText());
	}

}
