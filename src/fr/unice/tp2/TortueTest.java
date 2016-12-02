package fr.unice.tp2;

public class TortueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tortue t = new Tortue();
		
		t.avancer(10);
		System.out.println(t);
		
		t.reculer(20);
		System.out.println(t);
		
		t.tournerDroite(20);
		System.out.println(t);
		
		t.avancer(5);
		System.out.println(t);
	}

}
