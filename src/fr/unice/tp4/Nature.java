package fr.unice.tp4;

import java.awt.Color;
import java.awt.Graphics;

public enum Nature {
	BARRE(Color.BLACK), ESPACE(Color.WHITE);
	
	private Color couleur;
	
	Nature(Color c) {
		couleur = c;
	}
	
	public void affecterCouleur(Graphics g) {
		g.setColor(couleur);
	}
}
