package fr.unice.tp6;

import java.awt.Graphics;
import java.awt.Point;

public abstract class AFormeGeometrique {
	private Point ancrage;
	
	public AFormeGeometrique(Point p) {
		this.ancrage = p;
	}
	
	public Point getAncrage() { return this.ancrage; }
	public void setAncrage(Point p) { this.ancrage = p;}
	
	public abstract double getAire();
	public abstract double getPerimetre();
	public abstract void dessineToi(Graphics g);
	
	public String toString() {
		return "Ancrage ("+ ancrage.getX() +", "+ancrage.getY()+") :";
	}
}
