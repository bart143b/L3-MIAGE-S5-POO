package fr.unice.tp6;

import java.awt.Point;

public class Cercle extends AFormeGeometrique {
	private double rayon;

	public Cercle(Point p, double rayon) {
		super(p);
		this.rayon = rayon;
	}

	@Override
	public double getAire() {
		return Math.PI*rayon*rayon;
	}

	@Override
	public double getPerimetre() {
		return 2*Math.PI*rayon;
	}
	
	public Point getCentre() {
		return super.getAncrage();
	}

	@Override
	public String toString() {
		return super.toString()+ " cercle de rayon " + rayon;
	}
}
