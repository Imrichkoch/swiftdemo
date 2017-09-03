package swiftdemo;

import javax.swing.JFrame;

public class HelloFrame extends JFrame {

	private static final long serialVersionUID = -6658177492159480071L;

	public HelloFrame() {
		add(new HelloWorldComponent());
		pack();
	}

}
