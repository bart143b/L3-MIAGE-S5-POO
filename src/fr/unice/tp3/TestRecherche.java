package fr.unice.tp3;

public class TestRecherche {

	public static void main(String[] args) {
		int[] tab = {2, 85, -6, 12, 25, 38, 55};
	
		System.out.println("********** Tableau non trié **********");
		System.out.println("Valeur attendu 6, valeur obtenu " + Recherche.rechercher(tab, 55));
		System.out.println("Valeur attendu 2, valeur obtenu " + Recherche.rechercher(tab, -6));

	}

}
