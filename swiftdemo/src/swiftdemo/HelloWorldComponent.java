package swiftdemo;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

public class HelloWorldComponent extends JComponent {

	private static final long serialVersionUID = 8979345813985698398L;

	private static final int DEFAULT_WIDTH = 100;
	private static final int DEFAULT_HEIGHT = 900;

	@Override
	public void paintComponent(Graphics g) {
		String s = "Hello World";

		int stringPixelLen = (int) g.getFontMetrics().getStringBounds(s, g).getWidth();
		int stringPixelw = (int) g.getFontMetrics().getStringBounds(s, g).getHeight();

		int xPosition = getWidth() / 2 - stringPixelLen / 2;
		int yPosition = getHeight() / 2 - stringPixelw / 2;

		g.drawString(s, xPosition, yPosition);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
