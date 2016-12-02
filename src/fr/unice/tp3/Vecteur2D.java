package fr.unice.tp3;

/**
 * 
 * @author Adam Issoufi
 *
 */

public class Vecteur2D {
	private int x, y;
	
	Vecteur2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Vecteur2D multiplier(int k) {
		return new Vecteur2D(x*k, y*k);
	}
	
	public static int produitScalaire(Vecteur2D v1, Vecteur2D v2) {
		return v1.x*v2.x+v1.y*v2.y;
	}
	
	public Vecteur2D transposer() {
		return new Vecteur2D(y, x);
	}
	
	public static Vecteur2D ajouter(Vecteur2D v1, Vecteur2D v2) {
		return new Vecteur2D(v1.x + v2.x, v1.y + v2.y);
	}
	
	public String toString() {
		return "< " + x + ", " + y + " >";
	}

}
