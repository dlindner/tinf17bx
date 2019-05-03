package de.dhbw.tinf17.fun.with.types;

public class Main {
	
	public static void main(String[] args) {
		double value = 0.0D;
		for (int i = 0; i < 9; i++) {
			value = value + 1.1D;
		}
		value = value - 1.1D;
		System.out.println(value);
		System.out.println(8.8D == value);
		
		System.out.println(1.0D / 0.0D);
		System.out.println(1.0D / -0.0D);
		
		System.out.println(Double.POSITIVE_INFINITY + Double.NEGATIVE_INFINITY);
		
		double isIt = Double.POSITIVE_INFINITY + Double.NEGATIVE_INFINITY;
		System.out.println(isIt == Double.NaN);
		System.out.println(Double.isNaN(isIt));
		
		double deadly = Double.MAX_VALUE - 1;
		
		Integer wert = 127;
		Integer wert2 = Integer.valueOf(127);
		
		System.out.println(wert.equals(wert2));
		System.out.println(wert == wert2);
		
		System.out.println("-----");
		String erster = "Höpfner";
		String zweiter = new String("Höpfner");
		
		System.out.println(erster);
		System.out.println(zweiter);
		
		System.out.println(erster.equals(zweiter));
		System.out.println(erster == zweiter);
		
		String dritter = "Höpfner";
		System.out.println(erster == dritter);
		
		erster = erster + " Grape";
		dritter = dritter + " Grape";
		System.out.println(erster == dritter);
		
		
	}

}
