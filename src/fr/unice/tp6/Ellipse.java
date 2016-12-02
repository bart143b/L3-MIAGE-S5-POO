package fr.unice.tp6;

import java.awt.Point;

public class Ellipse extends AFormeGeometrique {
	
	private int demiGrandAxe, demiPetitAxe;
	
	public Ellipse(Point p, int demiGrandAxe, int demiPetitAxe) {
		super(p);
		this.demiGrandAxe = demiGrandAxe;
		this.demiPetitAxe = demiPetitAxe;
	}

	@Override
	public double getAire() {
		return Math.PI*demiGrandAxe*demiPetitAxe;
	}

	@Override
	public double getPerimetre() {
		return Math.PI*Math.sqrt(2*(demiGrandAxe*demiGrandAxe + demiPetitAxe*demiPetitAxe));
	}

	@Override
	public String toString() {
		return super.toString()+ " ellipse, demi grand axe " + demiGrandAxe + " et demi petit axe " + demiPetitAxe;
	}

}
