package fr.unice.tp1;

class MoyenneTest {
    public static void main(String[] args) {
	Moyenne m1 = new Moyenne();

	System.out.println(" -- Test calcul moyenne sans ajout de note");
	System.out.println("Resultat attendu : 0.0 ; resultat obtenu " + m1.calculMoyenne());
	System.out.println(" -- Test ajoueNote 10 -8 75");
	m1.ajouteNote(10);
	m1.ajouteNote(-8);
	m1.ajouteNote(75);
	System.out.println("Resultat obtenu (calcul moyenne) : " + m1.calculMoyenne());  
    }


}
