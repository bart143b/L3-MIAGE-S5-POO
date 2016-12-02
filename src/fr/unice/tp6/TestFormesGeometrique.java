package fr.unice.tp6;

import java.awt.Point;

public class TestFormesGeometrique {

	public static void main(String[] args) {
		
		AFormeGeometrique rec = new Rectangle(new Point(0, 1), 8, 4);
		AFormeGeometrique car = new Carre(new Point(1, 1), 4);
		AFormeGeometrique eli = new Ellipse(new Point(2, 1), 2, 4);
		AFormeGeometrique cer = new Cercle(new Point(2, 1), 2);
		
		System.out.println(rec);
		System.out.println("Aire : " + rec.getAire());
		System.out.println("Perimetre : " + rec.getPerimetre());
		System.out.println("-----------------");
		
		System.out.println(car);
		System.out.println("Aire : " + car.getAire());
		System.out.println("Perimetre : " + car.getPerimetre());
		System.out.println("-----------------");
		
		System.out.println(eli);
		System.out.println("Aire : " + eli.getAire());
		System.out.println("Perimetre : " + eli.getPerimetre());
		System.out.println("-----------------");
		
		System.out.println(cer);
		System.out.println("Aire : " + cer.getAire());
		System.out.println("Perimetre : " + cer.getPerimetre());
		System.out.println("-----------------");

	}

}
