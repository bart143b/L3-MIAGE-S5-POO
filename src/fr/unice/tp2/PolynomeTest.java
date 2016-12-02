package fr.unice.tp2;


public class PolynomeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Polynome p1, p2, p3, p4, p5;
		p1 = new Polynome(5, -5, 1);
		p2 = new Polynome(1, 6, 9);
		p3 = new Polynome(1, 0, 1);
		p4 = new Polynome(0, 1, 1);
		
		System.out.println("p1 : " + p1);
		System.out.println("p2 : " + p2);
		System.out.println("p3 : " + p3);
		System.out.println("p4 : " + p4);
		
		System.out.println("Discriminanat de p1 : " + p1.discriminant());
		System.out.println("Discriminanat de p2 : " + p2.discriminant());
		System.out.println("Discriminanat de p3 : " + p3.discriminant());
		System.out.println("Discriminanat de p4 : " + p4.discriminant());
		
		System.out.println("Evaluation de p1 avec la veleur x=3 : " + p1.calculer(3));
		System.out.println("Evaluation de p2 avec la veleur x=3 : " + p2.calculer(3));
		System.out.println("Evaluation de p3 avec la veleur x=3 : " + p3.calculer(3));
		System.out.println("Evaluation de p4 avec la veleur x=3 : " + p4.calculer(3));
		
		System.out.println("Racinne reelle1 de p1 : " + p1.racineReelle1());
		System.out.println("Racinne reelle2 de p1 : " + p1.racineReelle2());
		System.out.println("Racinne reelle1 de p2 : " + p2.racineReelle1());
		System.out.println("Racinne reelle2 de p2 : " + p2.racineReelle2());
		
		System.out.println("Racine complexe 1 de p3 : " + p3.racine1());
		System.out.println("Racine complexe 2 de p3 : " + p3.racine2());

	}

}
