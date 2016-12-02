package fr.unice.tp3;

public class TestVecteur {
	public static void main(String[] args) {
		System.out.println("Vecteur attendu <2, 4> --> Vecteur obtenu : " +new Vecteur(2, 4));
		System.out.println("Vecteur attendu <2, 4, 3, -1> --> Vecteur obtenu : " +new Vecteur(2, 4, 3, -1));
		System.out.println("Vecteur attendu <2, 4, null> --> Vecteur obtenu : " +new Vecteur(2, 4, null));
		System.out.println("Vecteur attendu <2, 4, [4, 5]> --> Vecteur obtenu : " +new Vecteur(2, 4, new int[]{4, 5}));
		
	}

}
