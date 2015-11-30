

import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainApp {
	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException,
			UnsupportedLookAndFeelException {


		UIManager.put("nimbusBase", new Color(25, 100, 255));
		UIManager.put("nimbusBlueGrey", new Color(200, 123, 45));
		UIManager.put("control", new Color(220,220,220));

		UIManager
				.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		new MainFrame();
	}
}