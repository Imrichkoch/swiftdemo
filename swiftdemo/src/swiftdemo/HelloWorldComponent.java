package swiftdemo;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

public class HelloWorldComponent extends JComponent{

	
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8979345813985698398L;
	
	

	
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	private static final int MESSAGE_X = 150;
	private static final int MESSAGE_Y = 100;
	
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawString("Hello World", getWidth()/2, getHeight()/2);
	}
	
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
