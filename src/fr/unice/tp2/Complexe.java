package fr.unice.tp2;

public class Complexe {
	private double reelle, imaginaire; 
	
	Complexe(double reelle, double imaginaire) {
		this.imaginaire = imaginaire;
		this.reelle = reelle;
	}
	
	public Complexe(double re) {
		reelle = re;
		imaginaire = 0.0;
	}
	
	public double nomre() {
		return reelle*reelle + imaginaire*imaginaire;
	}
	
	public String toString() {
		if(imaginaire >= 0.0)
			return reelle+" + i"+imaginaire;
		else 
			return reelle+" - i"+-imaginaire;
	}
}
