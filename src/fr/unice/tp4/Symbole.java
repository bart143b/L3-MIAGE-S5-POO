package fr.unice.tp4;

import java.awt.Graphics;

public class Symbole {
	private Nature n;
	private Epaisseur e;
	
	public Symbole(Nature n, Epaisseur e) {
		this.n = n;
		this.e = e;
	}
	
	public int dessiner(Graphics g, int x) {
		n.affecterCouleur(g);
		return e.dessinerSymbole(g, x);
	}
}
