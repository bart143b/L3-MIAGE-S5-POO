package fr.unice.tp4;

import java.applet.Applet;
import java.awt.Graphics;

public class Test extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public void paint(Graphics g) {
		Code39 c = new Code39();
		
		c.paint(g, "JAVA 2012");
	}
}
