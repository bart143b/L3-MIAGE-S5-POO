package fr.unice.tp3;

public class Recherche {
	
	// On suppose que le tableau n'est pas trié
	public static int rechercher(int[] tab, int valeur) {
		for(int i=0; i < tab.length; i++) {
			if (tab[i] == valeur) 
				return i;
		}
		return -1;
	}
	
	// Dans le pire des cas le cout de l'opération ci-dessus est log(tab.length)
	// Oui car il est plus facile de comparer les valeurs
	
	// On supose que le tableau est ordonné
	
	public static int rechercheDichotomique(int[] tab, int valeur) {
		int min = 0, max = tab.length-1, milieu;
		boolean aTrouve = false; 
		
		do {
			milieu = (min + max)/2;
			
			if(tab[milieu] == valeur)
				aTrouve = true;
			else if(tab[milieu] < valeur)
				min = milieu;
			else
				max = milieu;
				
		}while(!(aTrouve || (min+1 == max)));
		
		return (aTrouve) ? milieu : -1;
	} 
	/**
	public static int rechercheDichotomique(int[] tab, int valeur) {
		int min = 0, max = tab.length-1, milieu;
		
			milieu = (min + max)/2;
			
			if(tab[milieu] == valeur)
				return milieu;
			else if(tab[milieu] < valeur)
				min = milieu;
			else
				max = milieu;
				
	}**/
	
}
