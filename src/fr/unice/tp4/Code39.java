package fr.unice.tp4;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Code39 {
	private static String[][] tab = {{"A", "100001001"},
									 {"B", "001001001"},
									 {"C", "101001000"},
									 {"D", "000011001"},
									 {"E", "100011000"},
									 {"F", "001011000"},
									 {"G", "000001101"},
									 {"H", "100001100"},
									 {"I", "001001100"},
									 {"J", "000011100"},
									 {"K", "100000011"},
									 {"L", "001000011"},
									 {"M", "101000010"},
									 {"N", "000010011"},
									 {"O", "100010010"},
									 {"P", "001010010"},
									 {"Q", "000000111"},
									 {"R", "100000110"},
									 {"S", "001000110"},
									 {"T", "000010110"},
									 {"U", "110000001"},
									 {"V", "011000001"},
									 {"W", "111000000"},
									 {"X", "010010001"},
									 {"Y", "110010000"},
									 {"Z", "011010000"},
									 {"*", "010010100"},
									 {"0", "000110100"},
									 {"1", "100100001"},
									 {"2", "001100001"},
									 {"3", "101100000"},
									 {"4", "000110001"},
									 {"5", "100110000"},
									 {"6", "001110000"},
									 {"7", "000100101"},
									 {"8", "100100100"},
									 {"9", "001100100"},
									 {" ", "0"},
									 {"-", "010000101"},
									 {"$", "010101000"},
									 {"%", "000101010"},
									 {".", "110000100"},
									 {"/", "010100010"},
									 {"+", "010001010"},
									 
	};
	
	private final int CLE = 0, VALEUR = 1;
	
	public String getCaractere(char c) {
		for (String[] s: tab) {
			if(s[CLE].equalsIgnoreCase(c+"")) {
				return s[VALEUR];
			}
		}
		return null;
	}
	
	public String getChaine(String s) {
		
		String texte = getCaractere('*');
		for (int i = 0; i < s.length(); i++) {
			texte += getCaractere(' ');
			texte += getCaractere(s.charAt(i));
		}
		texte += getCaractere(' ');
		texte += getCaractere('*');
		return texte;
	}
	
	public void paint(Graphics g, String message) {
		String m;
		IterateurSymbole is;
		int x;
		
		m = getChaine(message);
		is = new IterateurSymbole(m);
		x = 50;
		while(!is.termine()) {
			x = (is.suivant()).dessiner(g, x);
		}
		g.setFont(new Font("TimesRoman", Font.BOLD, 30));
		g.setColor(Color.BLACK);
		g.drawString("*"+message.toUpperCase()+"*", x/3, 200);
	}
}
