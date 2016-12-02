package fr.unice.tp3;

import java.util.Arrays;

/**
 * 
 * @author Issoufi Adam
 *
 */

public class Vecteur {
	int[] tab;

	public Vecteur(int x, int y, int ... tab) {
		this.tab = new int[2 + tab.length];
		this.tab[0] = x;
		this.tab[1] = y;

		for(int i = 0; i < tab.length; i++) {
			this.tab[i + 2] = tab[i];
		}
	}

	public Vecteur(int taille, int[] tab) {
		assert(taille >= 2); // Il y a aumoins deux valeurs
		assert(tab.length <= taille); 
		
		this.tab = (tab == null) ? new int[taille] : Arrays.copyOf(tab, taille);
	}
	
	public String toString() {
		return Arrays.toString(tab);
	}
	
	

}
