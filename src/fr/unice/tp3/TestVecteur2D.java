package fr.unice.tp3;

public class TestVecteur2D {
	
	public static void main(String[] args) {
		Vecteur2D v1 = new Vecteur2D(2, 4);
		Vecteur2D v2 = new Vecteur2D(-3, 7);
		Vecteur2D v = new Vecteur2D(6, -1);
	
		System.out.println(v1);
		System.out.println(v2);
		
		System.out.println(v.multiplier(4));
		System.out.println(Vecteur2D.produitScalaire(v1, v2));
		System.out.println(v.transposer());
		System.out.println(Vecteur2D.ajouter(v1, v2));
		
	}

}
