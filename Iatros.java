import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Iatros {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Iatros window = new Iatros();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Iatros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnDiaxeirish = new JButton("\u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7 \u0391\u03B9\u03C4\u03B7\u03BC\u03AC\u03C4\u03C9\u03BD/\u03A1\u03B1\u03BD\u03C4\u03B5\u03B2\u03BF\u03CD");
		btnDiaxeirish.setBounds(21, 133, 185, 74);
		frame.getContentPane().add(btnDiaxeirish);
		
		JButton buttonProvolh = new JButton("\u03A0\u03C1\u03BF\u03B2\u03BF\u03BB\u03AE \u03A0\u03C1\u03BF\u03C6\u03B9\u03BB");
		buttonProvolh.setBounds(239, 133, 185, 74);
		frame.getContentPane().add(buttonProvolh);
	}
}
