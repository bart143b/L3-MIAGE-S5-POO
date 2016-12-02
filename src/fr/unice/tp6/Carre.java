package fr.unice.tp6;

import java.awt.Point;

public class Carre extends Rectangle {

	public Carre(Point p, double cote) {
		super(p, cote, cote);
	}
	
	@Override
	public String toString() {
		return super.toString()+ " carre de cote " + cote;
	}

}
