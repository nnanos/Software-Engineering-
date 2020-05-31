import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiaxeirishRantebou {

	private JFrame frame;
	private JTextField textField‘Ô;
	private JTextField textFieldReason;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiaxeirishRantebou window = new DiaxeirishRantebou();
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
	public DiaxeirishRantebou() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_636911496229500");
		panel.setLayout(null);
		
		JButton btnYpourgeio = new JButton("\u0395\u03C0\u03B9\u03BA\u03BF\u03B9\u03BD\u03C9\u03BD\u03AF\u03B1 \u03BC\u03B5 \u03A5.\u03A5");
		btnYpourgeio.setBounds(10, 167, 182, 48);
		panel.add(btnYpourgeio);
		
		
		JPanel panelPat = new JPanel();
		frame.getContentPane().add(panelPat, "name_636914919073700");
		panelPat.setLayout(null);
		
		
		JPanel panelDenied = new JPanel();
		frame.getContentPane().add(panelDenied, "name_637123166851700");
		panelDenied.setLayout(null);
		
		JButton button = new JButton("\u0395\u03C0\u03B9\u03BA\u03BF\u03B9\u03BD\u03C9\u03BD\u03AF\u03B1 \u03BC\u03B5 \u03B1\u03C3\u03B8\u03B5\u03BD\u03B5\u03AF\u03C2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panelPat.setVisible(true);
			}
		});
		button.setBounds(242, 167, 182, 48);
		panel.add(button);
		
		
		
		JList list = new JList();
		list.setBounds(10, 11, 217, 192);
		panelPat.add(list);
		
		JButton btnNewAccept = new JButton("\u0391\u03C0\u03BF\u03B4\u03BF\u03C7\u03AE");
		btnNewAccept.setBounds(284, 21, 89, 23);
		panelPat.add(btnNewAccept);
		
		JButton button_1 = new JButton("\u0391\u03C0\u03CC\u03C1\u03C1\u03B9\u03C8\u03B7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPat.setVisible(false);
				panelDenied.setVisible(true);
				
			}
		});
		button_1.setBounds(284, 112, 89, 23);
		panelPat.add(button_1);
		
		
		
		JLabel label = new JLabel("\u03A0\u03C1\u03BF\u03C2");
		label.setBounds(10, 14, 65, 14);
		panelDenied.add(label);
		
		textField‘Ô = new JTextField();
		textField‘Ô.setBounds(131, 11, 157, 20);
		panelDenied.add(textField‘Ô);
		textField‘Ô.setColumns(10);
		
		JLabel labelReason = new JLabel("\u039B\u03CC\u03B3\u03BF\u03C2");
		labelReason.setBounds(10, 72, 48, 14);
		panelDenied.add(labelReason);
		
		textFieldReason = new JTextField();
		textFieldReason.setBounds(131, 69, 157, 20);
		panelDenied.add(textFieldReason);
		textFieldReason.setColumns(10);
		
		JButton btnNewButtonSend = new JButton("\u0391\u03C0\u03BF\u03C3\u03C4\u03BF\u03BB\u03AE");
		btnNewButtonSend.setBounds(10, 206, 89, 23);
		panelDenied.add(btnNewButtonSend);
	}
}
