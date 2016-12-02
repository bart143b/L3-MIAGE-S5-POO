package fr.unice.abr;

public class Noeud {
	int valeur;
	Noeud filsGauche, filsDroit;
	
	public Noeud(int v) {
		valeur = v;
		filsDroit = filsGauche = null;
	}
	
	public Noeud(int v, Noeud filsG, Noeud filsD) {
		valeur = v;
		filsGauche = filsG;
		filsDroit = filsD;
	}
	
	public boolean estUneFeuille() {
		return (filsGauche == null) && (filsDroit == null);
	}
	
	//accesseurs
	public int getValeur() { return valeur; }
	public Noeud getFilsGauche() { return filsGauche; }
	public Noeud getFilsDroit() { return filsDroit; }
	
	//modificaeurs
	public void setFilsGauche(Noeud g) { filsGauche = g; }
	public void setFilsDroit(Noeud d) { filsDroit = d; }
	
	public String toString() {
		return " {" + ((filsGauche == null) ? "" : filsGauche) + ", " + valeur + ", " +((filsDroit == null) ? "" : filsDroit) + "}";
	}
}
