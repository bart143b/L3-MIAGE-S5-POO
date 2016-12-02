package fr.unice.tp6;

import java.awt.Point;

public class Rectangle extends AFormeGeometrique {

	private double largeur, hauteur;
	
	public Rectangle(Point p, double largeur, double hauteur) {
		super(p);
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	@Override
	public double getAire() {
		return largeur*hauteur;
	}

	@Override
	public double getPerimetre() {
		return (largeur+hauteur)*2;
	}
	
	@Override
	public String toString() {
		return super.toString()+ " rectangle, largeur " + largeur + " et hauteur " + hauteur;
	}

}
