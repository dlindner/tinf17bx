package de.dhbw.tinf17.pattern.decorator;

import java.nio.charset.Charset;
import java.util.Base64;

public class Base64Nachricht extends NachrichtDekorierer {
	
	public Base64Nachricht(Nachricht nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void drucke(String text) {
		byte[] encode = Base64.getEncoder().encode(text.getBytes(Charset.forName("utf-8")));
		String encoded = new String(encode);
		System.out.println("1. " + encoded);
		super.drucke(encoded);
		System.out.println("2. " + encoded);
	}
}
