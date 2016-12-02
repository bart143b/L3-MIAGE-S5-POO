package fr.unice.tp3;

public class Somme {
	private static int total;
	
	public static void main(String[] args) {
		total = 0;
		for (String str : args) {
			total += Integer.parseInt(str);
			System.out.println(str);
		}
		
		System.out.println("Resultat :" + total);
	}
}
