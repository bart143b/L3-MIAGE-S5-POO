package fr.unice.tp1;

import java.awt.Graphics;
import java.applet.Applet;

public class HelloWorldApplet extends Applet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
	g.drawString("Hello world!", 50, 25);
    }
}
