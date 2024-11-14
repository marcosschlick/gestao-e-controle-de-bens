import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Screen extends JFrame {

	void execute() {
		setSize(1200, 800);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);

		JButton button1 = new JButton();
		addButton(button1, this);
	}
	
	private static void addButton(JButton button, Screen screen) {
		button.setSize(250, 150);
		screen.add(button);

	}
}
