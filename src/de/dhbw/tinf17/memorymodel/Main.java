package de.dhbw.tinf17.memorymodel;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		Klingelbeutel beutel = new Klingelbeutel();
		
		Thread eins = new Thread(() -> {
			for (int i = 0; i < 100000; i++) {
				beutel.werfeEin();
				beutel.holeRaus();
			}
		});
		Thread zwei = new Thread(() -> {
			for (int i = 0; i < 100001; i++) {
				beutel.werfeEin();
				beutel.holeRaus();
			}
		});
		eins.start();
		zwei.start();
		
		eins.join();
		zwei.join();

		System.out.println(beutel);
	}
}
