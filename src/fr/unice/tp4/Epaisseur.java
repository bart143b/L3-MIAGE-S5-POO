package fr.unice.tp4;

import java.awt.Graphics;

public enum Epaisseur {
	LARGE(6), ETROIT(2);
	
	private int epaisseur;
	
	Epaisseur(int e) {
		epaisseur = e;
	}
	
	public int dessinerSymbole(Graphics g, int x) {
		g.fillRect(x, 50, epaisseur, 100);
		return x+epaisseur;
	}
}
