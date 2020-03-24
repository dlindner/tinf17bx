package de.dhbw.tinf17.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		Nachricht nachricht = new ConsolenNachricht();
		nachricht = new Base64Nachricht(nachricht);
		nachricht = new R�ckw�rtsDekorierer(nachricht);
		nachricht = new CoolnessDekorierer(nachricht);
		nachricht = new Gro�schreibeDekorierer(nachricht);
		nachricht.drucke("Hallo TINF17B1");
	}
}
