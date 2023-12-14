package de.demmer.dennis;

public class Email {
	
	// Felder/Attribute
	String absender;
	String betreff;
	String empfänger;
	String text;
	int size;
	
	
	
	//Konstruktor
	public Email(String absender, String betreff, String empfänger, String text) {
		
		this.absender = absender;
		this.betreff = betreff;
		this.empfänger = empfänger;
		this.text = text;
		
		size = absender.length() + betreff.length() + empfänger.length() + text.length();

	}
	
	public Email(int i) {
		System.out.println("Integer Konstruktor");
	}
	
	public Email(String text) {
		System.out.println("String Konstruktor");
		absender = "";
		
	}
	

	//Methode
	public String betreffInGroßBuchstaben() {
		return betreff.toUpperCase();
	}

	public void test() {
		System.out.println("Test");
	}
	
	
	
}
