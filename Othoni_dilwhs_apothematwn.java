import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Othoni_dilwhs_apothematwn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Othoni_dilwhs_apothematwn frame = new Othoni_dilwhs_apothematwn();
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
	public Othoni_dilwhs_apothematwn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u03A0\u03B5\u03C1\u03B9\u03B3\u03C1\u03B1\u03C6\u03AE");
		lblNewLabel.setBounds(120, 11, 64, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u03A0\u03B5\u03C1\u03B9\u03B3\u03C1\u03B1\u03C6\u03AE");
		label.setBounds(120, 84, 64, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u03A0\u03B5\u03C1\u03B9\u03B3\u03C1\u03B1\u03C6\u03AE");
		label_1.setBounds(120, 152, 64, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u03A0\u03B5\u03C1\u03B9\u03B3\u03C1\u03B1\u03C6\u03AE");
		label_2.setBounds(120, 223, 64, 14);
		contentPane.add(label_2);
		
		JLabel lblNewLabel_1 = new JLabel("\u03A4\u03B9\u03BC\u03AE 30\u03B5\u03C5\u03C1\u03CE/\u03C4\u03B5\u03BC\u03AC\u03C7\u03B9\u03BF");
		lblNewLabel_1.setBounds(225, 11, 109, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_3 = new JLabel("\u03A4\u03B9\u03BC\u03AE 20 \u03B5\u03C5\u03C1\u03CE/\u03C4\u03B5\u03BC\u03AC\u03C7\u03B9\u03BF");
		label_3.setBounds(225, 84, 109, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u03A4\u03B9\u03BC\u03AE 40 \u03B5\u03C5\u03C1\u03CE/\u03C4\u03B5\u03BC\u03AC\u03C7\u03B9\u03BF");
		label_4.setBounds(225, 152, 109, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u03A4\u03B9\u03BC\u03AE 15 \u03B5\u03C5\u03C1\u03CE/\u03C4\u03B5\u03BC\u03AC\u03C7\u03B9\u03BF");
		label_5.setBounds(225, 223, 109, 14);
		contentPane.add(label_5);
		
		JLabel lblNewLabel_2 = new JLabel("4251269");
		lblNewLabel_2.setBounds(28, 30, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel label_6 = new JLabel("4251270");
		label_6.setBounds(28, 100, 46, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("4251271");
		label_7.setBounds(28, 178, 46, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("4251272");
		label_8.setBounds(28, 249, 46, 14);
		contentPane.add(label_8);
		
		JLabel lblNewLabel_3 = new JLabel("\u03A4\u03B5\u03BC\u03AC\u03C7\u03B9\u03B1");
		lblNewLabel_3.setBounds(362, 11, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel label_9 = new JLabel("\u03A4\u03B5\u03BC\u03AC\u03C7\u03B9\u03B1");
		label_9.setBounds(362, 84, 46, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("\u03A4\u03B5\u03BC\u03AC\u03C7\u03B9\u03B1");
		label_10.setBounds(362, 152, 46, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("\u03A4\u03B5\u03BC\u03AC\u03C7\u03B9\u03B1");
		label_11.setBounds(362, 223, 46, 14);
		contentPane.add(label_11);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setBounds(362, 27, 39, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(360, 97, 39, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_2.setColumns(10);
		textField_2.setBounds(362, 164, 39, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_3.setColumns(10);
		textField_3.setBounds(362, 235, 39, 20);
		contentPane.add(textField_3);
		
		JButton Oloklirwsh = new JButton("\u039F\u03BB\u03BF\u03BA\u03BB\u03AE\u03C1\u03C9\u03C3\u03B7 \u03A0\u03B1\u03C1\u03B1\u03B3\u03B3\u03B5\u03BB\u03AF\u03B1\u03C2");
		Oloklirwsh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "Επιτυχής Ολοκλήρωση Παραγγελίας");
				
			}
		});
		Oloklirwsh.setBounds(120, 260, 194, 66);
		contentPane.add(Oloklirwsh);
		
		JLabel lblNewLabel_4 = new JLabel("Φάρμακο 1");
		lblNewLabel_4.setBounds(28, 11, 64, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel label_12 = new JLabel("Φάρμακο 2");
		label_12.setBounds(28, 84, 64, 14);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("Φάρμακο 3");
		label_13.setBounds(28, 152, 64, 14);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("Φάρμακο 4");
		label_14.setBounds(28, 223, 64, 14);
		contentPane.add(label_14);
	}
}
