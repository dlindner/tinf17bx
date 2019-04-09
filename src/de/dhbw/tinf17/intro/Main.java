package de.dhbw.tinf17.intro;

import java.util.ArrayList;
import java.util.List;

public final class Main {
	
	private Main() {
		super();
	}
	
	public static void main(String[] args) {
		final Animal bernhard = new Cat();
		final Animal james = new Staubsauger();
		
		bernhard.streichle();
		james.streichle();
		
		final List<Animal> zoo = new ArrayList<>();
		zoo.add(bernhard);
		zoo.add(james);
		
		zoo.forEach(Animal::streichle);
		
		final Kitchen kitchen = new Kitchen();
		kitchen.f�ttere(bernhard);
		kitchen.f�ttere(james);
		
		kitchen.f�ttere(null);
		
		zoo.forEach(kitchen::f�ttere);
	}
}
