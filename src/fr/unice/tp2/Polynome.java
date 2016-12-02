package fr.unice.tp2;
/**
 * L3 - POO - TD2
 * 
 * @author Issoufi Adam
 * 
 * V1 : 20/09/2016
 */

public class Polynome {
	private int a, b, c;
	
	/**
	 * Constructeur du polynome a(x^2)+bx+c
	 * @param a 
	 * @param b
	 * @param c
	 */
	Polynome(int a, int b, int c) {
		assert(a != 0);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/**
	 * Evalue le polynome avec la valeur X
	 * @param x La valeur a évaluer
	 * @return Retourne le résultat de l'évaluation
	 */
	public int calculer(int x) {
		return a*x*x+b*x+c;
	}
	
	/**
	 * Fournie le discriminant du polynome
	 * @return Retourne le disciminant
	 */
	public int discriminant() {
		return b*b-4*a*c;
	}
	
	/**
	 * 
	 * @return
	 */
	public float racineReelle1() {
		assert(discriminant() >= 0);
		
		return (float) ((-b+Math.sqrt(discriminant()))/(2*a));
	}
	
	/**
	 * 
	 * @return
	 */
	public float racineReelle2() {
		assert(discriminant() >= 0);
		
		return (float) ((-b-Math.sqrt(discriminant()))/(2*a));
	}
	
	/**
	 * 
	 * @return
	 */
	public Complexe racine1() {
		if (discriminant() >= 0) return new Complexe((double)racineReelle1());
		
		return new Complexe(-b/(2*a), Math.sqrt(Math.abs(discriminant()))/(2*a));
	}
	
	/**
	 * 
	 * @return
	 */
	public Complexe racine2() {
		if (discriminant() >= 0) return new Complexe((double)racineReelle2());
		
		return new Complexe(-b/(2*a), -Math.sqrt(Math.abs(discriminant()))/(2*a));
	}
	
	public String toString() {
		return a+"X^2+"+b+"X+"+c;
	}
	
}
