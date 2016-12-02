package fr.unice.abr;

public class ArbreBinaire {
	Noeud racine;
	
	public ArbreBinaire(int valeur) {
		racine = new Noeud(valeur);
	}
	
	public void ajouterElement(int valeur) {
		ajouterElement(racine, valeur);
	}
	
	private void ajouterElement(Noeud n, int valeur) {
		if(valeur  <= n.getValeur()) {
			if(n.getFilsGauche() == null) {
				n.setFilsGauche(new Noeud(valeur));
			} else {
				ajouterElement(n.getFilsGauche(), valeur);
			}
		} else {
			if(n.getFilsDroit() == null) {
				n.setFilsDroit(new Noeud(valeur));
			} else {
				ajouterElement(n.getFilsDroit(), valeur);
			}
		}
	}
	
	public boolean contient(int valeur) {
		return contient(racine, valeur);
	}
	
	private boolean contient(Noeud n, int v) {
		if(n == null) return false;
		
		if(n.getValeur() == v) return true;
		else if(n.estUneFeuille()){
			return false;
		} else {
			if(contient(n.getFilsGauche(), v)){
				return true;
			} else {
				return contient(n.getFilsDroit(), v);
			}
		}
	}
	
	public String toString() {
		return racine.toString();
	}
}
