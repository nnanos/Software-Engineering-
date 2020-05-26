import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Poliths {

	private JFrame frame;
	private JTextField longitude;
	private JTextField latitude;
	private JTextField radius;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Poliths window = new Poliths();
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
	public Poliths() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 502, 362);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel civ = new JPanel();
		civ.setBounds(0, 0, 486, 323);
		frame.getContentPane().add(civ);
		civ.setLayout(null);
		
		JButton profilebtn = new JButton("\u03A0\u03C1\u03BF\u03C6\u03AF\u03BB \u03A0\u03BF\u03BB\u03AF\u03C4\u03B7");
		profilebtn.setBounds(10, 43, 178, 23);
		civ.add(profilebtn);
		
		JButton docbtn = new JButton("\u0391\u03AF\u03C4\u03B7\u03C3\u03B7 \u03B5\u03C0\u03B9\u03BA\u03BF\u03B9\u03BD\u03C9\u03BD\u03AF\u03B1\u03C2 \u03BC\u03B5 \u03B9\u03B1\u03C4\u03C1\u03CC");
		docbtn.setBounds(10, 77, 178, 23);
		civ.add(docbtn);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(329, 55, 157, 146);
		textPane.setText("\u039F\u03B9 \u03B1\u03BD\u03B1\u03BA\u03BF\u03B9\u03BD\u03CE\u03C3\u03B5\u03B9\u03C2 \u03B5\u03BC\u03C6\u03B1\u03BD\u03AF\u03B6\u03BF\u03BD\u03C4\u03B1\u03B9 \u03B5\u03B4\u03CE.");
		civ.add(textPane);
		
		JLabel lblNewLabel = new JLabel("\u0391\u03BD\u03B1\u03BA\u03BF\u03B9\u03BD\u03CE\u03C3\u03B5\u03B9\u03C2");
		lblNewLabel.setBounds(329, 30, 102, 14);
		civ.add(lblNewLabel);
		
		longitude = new JTextField();
		longitude.setBounds(10, 148, 86, 20);
		civ.add(longitude);
		longitude.setColumns(10);
		
		latitude = new JTextField();
		latitude.setBounds(106, 148, 86, 20);
		civ.add(latitude);
		latitude.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u039C\u03AE\u03BA\u03BF\u03C2");
		lblNewLabel_1.setBounds(10, 123, 46, 14);
		civ.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u03A0\u03BB\u03AC\u03C4\u03BF\u03C2");
		lblNewLabel_2.setBounds(106, 123, 46, 14);
		civ.add(lblNewLabel_2);
		
		JButton filter = new JButton("\u0395\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE");
		filter.setBounds(199, 178, 89, 23);
		civ.add(filter);
		
		radius = new JTextField();
		radius.setBounds(202, 148, 86, 20);
		civ.add(radius);
		radius.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u0391\u03BA\u03C4\u03AF\u03BD\u03B1 \u0395\u03CD\u03C1\u03BF\u03C5\u03C2");
		lblNewLabel_3.setBounds(202, 123, 78, 14);
		civ.add(lblNewLabel_3);
		
		JPanel docrequest = new JPanel();
		docrequest.setBounds(0, 0, 486, 323);
		frame.getContentPane().add(docrequest);
		
		JPanel profile = new JPanel();
		profile.setBounds(0, 0, 486, 323);
		frame.getContentPane().add(profile);
	}
}
