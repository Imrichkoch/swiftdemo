package swiftdemo;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class HelloFrameDemo {
	
	public static void main(String[] args) {
		JFrame frame = new HelloFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Hello World In Swing");
		
	}

}
