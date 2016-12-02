package fr.unice.abr;

public class TestNoeud {
	
	public static void main(String[] args) {
		Noeud racine, fg, fd, n1, n2;
		
		fg = new Noeud(3);
		fd = new Noeud(8);
		n1 = new Noeud(31);
		n2 = new Noeud(88);

		racine = new Noeud(7, fg, fd);
		n1.setFilsDroit(racine);
		n2.setFilsGauche(n1);
		
		System.out.println("Fueille de val 3 : " + fg);
		System.out.println("Fueille de val 8 : " + fd);
		
		System.out.println("Racine avec deux fils : " + racine);
		
		System.out.println("n1 modification fils droit : " + n1);
		System.out.println("n1 modification fils gauche : " + n2);
		
	}
}
