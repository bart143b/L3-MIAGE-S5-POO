package fr.unice.abr;

public class TestArbreBinaire {

	public static void main(String[] args) {
		ArbreBinaire abr = new ArbreBinaire(12);
		
		abr.ajouterElement(5);
		abr.ajouterElement(6);
		abr.ajouterElement(2);
		abr.ajouterElement(4);
		abr.ajouterElement(1);
		abr.ajouterElement(0);
		abr.ajouterElement(13);
		
		
		System.out.println(abr.toString());
		System.out.println("contient 0 ? "+ abr.contient(0));
		System.out.println("contient 4 ? "+ abr.contient(4));
		System.out.println("contient -1 ? "+ abr.contient(-1));
		System.out.println("contient 12 ? "+ abr.contient(12));
		System.out.println("contient 15 ? "+ abr.contient(15));

	}

}
