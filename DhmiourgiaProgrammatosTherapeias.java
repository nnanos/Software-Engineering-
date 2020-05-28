import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JLayeredPane;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Label;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DhmiourgiaProgrammatosTherapeias extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JTextField givenMed;
	private JTextField givenName;
	private JTextField givenNotifTime;
	private String givenMedVar;
	private String givenNameVar;
	private String givenNotifTimeVar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DhmiourgiaProgrammatosTherapeias frame = new DhmiourgiaProgrammatosTherapeias();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	**/
	public DhmiourgiaProgrammatosTherapeias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u039D\u03AD\u03BF \u03A0\u03C1\u03CC\u03B3\u03C1\u03B1\u03BC\u03BC\u03B1 \u0398\u03B5\u03C1\u03B1\u03C0\u03B5\u03AF\u03B1\u03C2");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(129, 11, 267, 27);
		contentPane.add(lblNewLabel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 76, 513, 312);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		layeredPane.add(panel, "name_5025162847000");
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("\u03A3\u03C5\u03BD\u03AD\u03C7\u03B5\u03B9\u03B1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(false);
				panel_1.setVisible(true);
			}
		});
		btnNewButton.setBounds(370, 278, 133, 23);
		panel.add(btnNewButton);
		
		givenMed = new JTextField();
		givenMed.setBounds(10, 63, 147, 20);
		panel.add(givenMed);
		givenMed.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE \u03A6\u03B1\u03C1\u03BC\u03AC\u03BA\u03BF\u03C5:");
		lblNewLabel_1.setBounds(10, 44, 147, 14);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		layeredPane.add(panel_1, "name_5026989177300");
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\u03A3\u03C5\u03BD\u03AD\u03C7\u03B5\u03B9\u03B1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(370, 278, 133, 23);
		panel_1.add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\u039A\u03C5\u03C1\u03B9\u03B1\u03BA\u03AE");
		chckbxNewCheckBox.setBounds(6, 53, 97, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("\u0394\u03B5\u03C5\u03C4\u03AD\u03C1\u03B1");
		chckbxNewCheckBox_1.setBounds(6, 79, 97, 23);
		panel_1.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("\u03A4\u03C1\u03AF\u03C4\u03B7");
		chckbxNewCheckBox_2.setBounds(6, 105, 97, 23);
		panel_1.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("\u03A4\u03B5\u03C4\u03AC\u03C1\u03C4\u03B7");
		chckbxNewCheckBox_3.setBounds(6, 131, 97, 23);
		panel_1.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("\u03A0\u03AD\u03BC\u03C0\u03C4\u03B7");
		chckbxNewCheckBox_4.setBounds(6, 157, 97, 23);
		panel_1.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("\u03A0\u03B1\u03C1\u03B1\u03C3\u03BA\u03B5\u03C5\u03AE");
		chckbxNewCheckBox_5.setBounds(6, 183, 97, 23);
		panel_1.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("\u03A3\u03AC\u03B2\u03B2\u03B1\u03C4\u03BF");
		chckbxNewCheckBox_6.setBounds(6, 209, 97, 23);
		panel_1.add(chckbxNewCheckBox_6);
		
		JLabel lblNewLabel_2 = new JLabel("\u0395\u03C0\u03B9\u03BB\u03BF\u03B3\u03AE \u0397\u03BC\u03AD\u03C1\u03B1\u03C2:");
		lblNewLabel_2.setBounds(6, 34, 122, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u0395\u03C0\u03B9\u03BB\u03BF\u03B3\u03AE \u038F\u03C1\u03B1\u03C2:");
		lblNewLabel_3.setBounds(223, 34, 208, 14);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		layeredPane.add(panel_2, "name_5029028999700");
		panel_2.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("\u03A3\u03C5\u03BD\u03AD\u03C7\u03B5\u03B9\u03B1");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel_3.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(370, 278, 133, 23);
		panel_2.add(btnNewButton_2);
		
		givenName = new JTextField();
		givenName.setBounds(10, 32, 191, 20);
		panel_2.add(givenName);
		givenName.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\u039F\u03BD\u03BF\u03BC\u03B1\u03C3\u03AF\u03B1 \u03A0\u03C1\u03BF\u03B3\u03C1\u03AC\u03BC\u03BC\u03B1\u03C4\u03BF\u03C2:");
		lblNewLabel_5.setBounds(10, 11, 158, 14);
		panel_2.add(lblNewLabel_5);
		
		JPanel panel_3 = new JPanel();
		layeredPane.add(panel_3, "name_5031388942800");
		panel_3.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_3.setBounds(370, 278, 133, 23);
		panel_3.add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u0395\u03C0\u03B9\u03B8\u03C5\u03BC\u03AF\u03B1 \u03B5\u03BD\u03B7\u03BC\u03AD\u03C1\u03C9\u03C3\u03B7\u03C2:");
		lblNewLabel_4.setBounds(10, 11, 146, 14);
		panel_3.add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u038C\u03C7\u03B9");
		rdbtnNewRadioButton.setBounds(10, 32, 109, 23);
		panel_3.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\u039D\u03B1\u03B9");
		rdbtnNewRadioButton_1.setBounds(10, 58, 109, 23);
		panel_3.add(rdbtnNewRadioButton_1);
		
		givenNotifTime = new JTextField();
		givenNotifTime.setBounds(129, 85, 86, 20);
		panel_3.add(givenNotifTime);
		givenNotifTime.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\u0395\u03C0\u03B9\u03B8\u03C5\u03BC\u03B7\u03C4\u03AE \u038F\u03C1\u03B1:");
		lblNewLabel_6.setBounds(10, 88, 109, 14);
		panel_3.add(lblNewLabel_6);
	}
}
