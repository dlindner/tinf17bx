package de.dhbw.tinf17.intro;

public class Kitchen {
	
	public Kitchen() {
		super();
	}
	
	public void füttere(Cat cat) {
		System.out.println("K1: Thunfisch her!");
	}
	
	public void füttere(Staubsauger staubi) {
		System.out.println("K2: Her mit den Krümeln!");
	}
	
	public void füttere(Animal animal) {
		System.out.println("K3: Geh weg damit!");
	}
}
