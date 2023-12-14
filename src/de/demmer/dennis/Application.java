package de.demmer.dennis;

public class Application {

		
	
	public static void main(String[] args) {
	
	
		Email email1 = new Email("dennis@dennis.de", "Java I Praktikum","Nils@nils.de", "Lorem ipsum");
	
		System.out.println(email1.absender);
		System.out.println(email1.size);
		
		System.out.println(email1.betreffInGroßBuchstaben());
		
		
//		Email email2 = new Email("Nils@nils.de");
//		email2.absender = 
//		[...]
		
		
		
		
		String[] stringArr = new String[150];
		Email[]  emailArr  = new Email[150];
		
		
		Email email3 = new Email(5);
		
		email3.betreff = "das ist ein test";
		System.out.println(email3.betreffInGroßBuchstaben());
		
		
		Email email4 = new Email("Test");
		
	}

}
