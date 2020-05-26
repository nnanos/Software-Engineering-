import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;

public class ProfilPolith extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfilPolith frame = new ProfilPolith();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProfilPolith() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton createTherapy = new JButton("\u0394\u03B7\u03BC\u03B9\u03BF\u03C5\u03C1\u03B3\u03AF\u03B1 \u03A0\u03C1\u03BF\u03B3\u03C1\u03AC\u03BC\u03BC\u03B1\u03C4\u03BF\u03C2 \u0398\u03B5\u03C1\u03B1\u03C0\u03B5\u03AF\u03B1\u03C2");
		createTherapy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DhmiourgiaProgrammatosTherapeias therapyprogram = new DhmiourgiaProgrammatosTherapeias();
				therapyprogram.setVisible(true);
			}
		});
		createTherapy.setBounds(10, 252, 320, 43);
		contentPane.add(createTherapy);
		
		JLabel lblNewLabel = new JLabel("\u03A0\u03C1\u03BF\u03C6\u03AF\u03BB");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(285, 11, 221, 34);
		contentPane.add(lblNewLabel);
		
		JButton prescriptionCodeButton = new JButton("\u03A0\u03C1\u03BF\u03B2\u03BF\u03BB\u03AE \u039A\u03C9\u03B4\u03B9\u03BA\u03CE\u03BD \u03A3\u03C5\u03BD\u03C4\u03B1\u03B3\u03BF\u03B3\u03C1\u03AC\u03C6\u03B7\u03C3\u03B7\u03C2");
		prescriptionCodeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		prescriptionCodeButton.setBounds(10, 323, 320, 39);
		contentPane.add(prescriptionCodeButton);
		
		JLabel lblNewLabel_1 = new JLabel("\u0395\u03C0\u03B9\u03BB\u03B5\u03B3\u03BC\u03AD\u03BD\u03BF \u03A0\u03C1\u03CC\u03B3\u03C1\u03B1\u03BC\u03BC\u03B1 \u0398\u03B5\u03C1\u03B1\u03C0\u03B5\u03AF\u03B1\u03C2");
		lblNewLabel_1.setBounds(400, 108, 228, 14);
		contentPane.add(lblNewLabel_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 123, 320, 172);
		contentPane.add(textPane);
		
		JButton editTherapyProgramButton = new JButton("\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1");
		editTherapyProgramButton.setBounds(400, 323, 239, 39);
		contentPane.add(editTherapyProgramButton);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(400, 123, 239, 239);
		contentPane.add(textPane_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u039B\u03AF\u03C3\u03C4\u03B1 \u03C4\u03C1\u03B5\u03C7\u03CC\u03BD\u03C4\u03C9\u03BD \u03C0\u03C1\u03BF\u03B3\u03C1\u03B1\u03BC\u03BC\u03AC\u03C4\u03C9\u03BD \u03B8\u03B5\u03C1\u03B1\u03C0\u03B5\u03AF\u03B1\u03C2");
		lblNewLabel_2.setBounds(10, 108, 279, 14);
		contentPane.add(lblNewLabel_2);
	}
}
