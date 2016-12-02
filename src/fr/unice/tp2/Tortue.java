package fr.unice.tp2;

public class Tortue {
	private int x, y;
	private double angleRadian;
	private boolean styloLeve;
	static final double ANGLE_DEFAUT = 0.;

	public Tortue() {
		this.x = 0;
		this.y = 0;
		this.angleRadian = ANGLE_DEFAUT;
		this.styloLeve = false;
	}
	
	public void leverStylo() {
		this.styloLeve = true;
	}
	
	public void baisserStylo() {
		this.styloLeve = false;
	}
	
	public void tournerGauche(double degre) {
		angleRadian -= toRadion(degre);
	}
	
	public void tournerDroite(double degre) {
		angleRadian += toRadion(degre);
	}
	
	public void avancer(int pixels) {
		x += pixels*Math.cos(angleRadian);
		y += pixels*Math.sin(angleRadian);
	}
	
	public void reculer(int pixels) {
		x -= pixels*Math.cos(angleRadian);
		y -= pixels*Math.sin(angleRadian);
	}
	
	private double toRadion(double degre) {
		return (degre*Math.PI)/180.0;
	}
	
	public String toString() {
		return "("+x+", "+y+")";
	}
	
	
	

}
