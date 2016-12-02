package fr.unice.tp4;

public class IterateurSymbole {
	private String c;
	private int indice;
	//private int indiceC;
	
	public IterateurSymbole(String c) {
		this.c = c;
		indice = 0;
		//indiceC = 0;
	}
	
	public boolean termine() {
		return indice == c.length();
	}
	
	public Symbole suivant() {
		Epaisseur e = null;
		Nature n = null;
		
		switch (c.charAt(indice)) {
		case '0':
			e = Epaisseur.ETROIT;
			break;
		case '1':
			e = Epaisseur.LARGE;
			break;
		default:
			return null;
		}
		//indiceC = (indice%9);
		n = (indice%2 == 0) ? Nature.BARRE : Nature.ESPACE;
		indice++;
		
		return new Symbole(n, e);
	}
}
