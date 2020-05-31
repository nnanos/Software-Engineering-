import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ProbolhProfil {

	private JFrame frame;
	private JTextField textFieldId;
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
					ProbolhProfil window = new ProbolhProfil();
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
	public ProbolhProfil() {
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
		frame.getContentPane().add(panel, "name_634703186870000");
		panel.setLayout(null);
		
		JPanel panelEditProfile = new JPanel();
		frame.getContentPane().add(panelEditProfile, "name_634705153448300");
		panelEditProfile.setLayout(null);
		
		JPanel panelIstoriko = new JPanel();
		frame.getContentPane().add(panelIstoriko, "name_634706545464600");
		panelIstoriko.setLayout(null);
		
		
		JPanel panelView = new JPanel();
		frame.getContentPane().add(panelView, "name_635795608489600");
		panelView.setLayout(null);
		
		JLabel lblName = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1");
		lblName.setBounds(10, 29, 101, 14);
		panelView.add(lblName);
		
		JLabel lblSympotms = new JLabel("\u03A3\u03C5\u03BC\u03C0\u03C4\u03CE\u03BC\u03B1\u03C4\u03B1");
		lblSympotms.setBounds(10, 70, 101, 14);
		panelView.add(lblSympotms);
		
		JLabel lblTherapy = new JLabel("\u0398\u03B5\u03C1\u03B1\u03C0\u03B5\u03AF\u03B1");
		lblTherapy.setBounds(10, 108, 101, 14);
		panelView.add(lblTherapy);
		
		JLabel lblDiarkeia = new JLabel("\u0394\u03B9\u03AC\u03C1\u03BA\u03B5\u03B9\u03B1 \u03B8\u03B5\u03C1\u03B1\u03C0\u03B5\u03AF\u03B1\u03C2");
		lblDiarkeia.setBounds(10, 157, 101, 14);
		panelView.add(lblDiarkeia);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(192, 23, 107, 20);
		panelView.add(editorPane);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(192, 64, 107, 20);
		panelView.add(editorPane_1);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBounds(192, 102, 107, 20);
		panelView.add(editorPane_2);
		
		JEditorPane editorPane_3 = new JEditorPane();
		editorPane_3.setBounds(192, 151, 107, 20);
		panelView.add(editorPane_3);
		
		JButton btnNewButton = new JButton("\u0395\u03BC\u03C6\u03AC\u03BD\u03B9\u03C3\u03B7 \u0399\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03BF\u03CD");
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setBounds(10, 196, 148, 23);
		panelView.add(btnNewButton);
		
		JButton btnSave = new JButton("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7 \u03B1\u03BB\u03BB\u03B1\u03B3\u03CE\u03BD");
		btnSave.setBounds(10, 227, 148, 23);
		panelView.add(btnSave);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(192, 197, 107, 20);
		panelView.add(textFieldId);
		textFieldId.setColumns(10);
		
		JPanel panelAdd = new JPanel();
		frame.getContentPane().add(panelAdd, "name_635820795380100");
		panelAdd.setLayout(null);
		
		JLabel lblNewName = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1");
		lblNewName.setBounds(10, 11, 48, 14);
		panelAdd.add(lblNewName);
		
		JLabel lblNewSymptoms = new JLabel("\u03A3\u03C5\u03BC\u03C0\u03C4\u03CE\u03BC\u03B1\u03C4\u03B1");
		lblNewSymptoms.setBounds(10, 56, 83, 14);
		panelAdd.add(lblNewSymptoms);
		
		JLabel lblNewDay = new JLabel("\u0397\u03BC\u03AD\u03C1\u03B1 \u03B5\u03BC\u03C6\u03AC\u03BD\u03B9\u03C3\u03B7\u03C2");
		lblNewDay.setBounds(10, 98, 83, 14);
		panelAdd.add(lblNewDay);
		
		JLabel lblNewAllergies = new JLabel("\u0391\u03BB\u03BB\u03B5\u03C1\u03B3\u03B9\u03AD\u03C2");
		lblNewAllergies.setBounds(10, 144, 83, 14);
		panelAdd.add(lblNewAllergies);
		
		textField = new JTextField();
		textField.setBounds(121, 8, 191, 20);
		panelAdd.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 53, 191, 20);
		panelAdd.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(121, 95, 191, 20);
		panelAdd.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(121, 141, 191, 20);
		panelAdd.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7 \u0399\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03BF\u03CD");
		btnNewButton_1.setBounds(10, 216, 172, 23);
		panelAdd.add(btnNewButton_1);
		
		
		JButton btnView = new JButton("\u03A0\u03C1\u03BF\u03B2\u03BF\u03BB\u03AE \u0399\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03BF\u03CD");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelIstoriko.setVisible(false);
				panelView.setVisible(true);
			}
		});
		btnView.setBounds(10, 148, 156, 59);
		panelIstoriko.add(btnView);
		
		JButton buttonAdd = new JButton("\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7 \u0399\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03BF\u03CD");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				panelIstoriko.setVisible(false);
				panelAdd.setVisible(true);

				
			}
		});
		buttonAdd.setBounds(268, 148, 156, 59);
		panelIstoriko.add(buttonAdd);
		
		JButton btnEditProfile = new JButton("E\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1 \u03C0\u03C1\u03BF\u03C6\u03AF\u03BB");
		btnEditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panelEditProfile.setVisible(true);
				
			}
		});
		btnEditProfile.setBounds(10, 178, 146, 50);
		panel.add(btnEditProfile);
		
		JButton buttonProfilCivil = new JButton("\u0399\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03CC \u0391\u03C3\u03B8\u03B5\u03BD\u03CE\u03BD");
		buttonProfilCivil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panelIstoriko.setVisible(true);
				
			}
		});
		buttonProfilCivil.setBounds(278, 178, 146, 50);
		panel.add(buttonProfilCivil);
		
		
		JLabel lblField = new JLabel("\u0395\u03B9\u03B4\u03B9\u03BA\u03CC\u03C4\u03B7\u03C4\u03B1");
		lblField.setBounds(10, 134, 89, 14);
		panelEditProfile.add(lblField);
		
		JLabel labelUsername = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1 \u03C7\u03C1\u03AE\u03C3\u03C4\u03B7");
		labelUsername.setBounds(10, 47, 89, 14);
		panelEditProfile.add(labelUsername);
		
		JLabel labelEmail = new JLabel("Email");
		labelEmail.setBounds(10, 72, 48, 14);
		panelEditProfile.add(labelEmail);
		
		JLabel labelPassword = new JLabel("\u039A\u03C9\u03B4\u03B9\u03BA\u03CC\u03C2");
		labelPassword.setBounds(10, 97, 48, 14);
		panelEditProfile.add(labelPassword);
		
		JButton buttonSave = new JButton("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7 \u03B1\u03BB\u03BB\u03B1\u03B3\u03CE\u03BD");
		buttonSave.setBounds(10, 227, 170, 23);
		panelEditProfile.add(buttonSave);
		
		JEditorPane editorPaneUsername = new JEditorPane();
		editorPaneUsername.setBounds(158, 35, 107, 20);
		panelEditProfile.add(editorPaneUsername);
		
		JEditorPane editorPaneEmail = new JEditorPane();
		editorPaneEmail.setBounds(158, 66, 107, 20);
		panelEditProfile.add(editorPaneEmail);
		
		JEditorPane editorPanePassword = new JEditorPane();
		editorPanePassword.setBounds(158, 97, 107, 20);
		panelEditProfile.add(editorPanePassword);
		
		JEditorPane editorPaneField = new JEditorPane();
		editorPaneField.setBounds(158, 128, 107, 20);
		panelEditProfile.add(editorPaneField);
		
		JLabel lblAvailability = new JLabel("\u0395\u03C6\u03B7\u03BC\u03B5\u03C1\u03AF\u03B1");
		lblAvailability.setBounds(10, 159, 48, 14);
		panelEditProfile.add(lblAvailability);
		
		JEditorPane editorPaneAvailability = new JEditorPane();
		editorPaneAvailability.setBounds(158, 159, 107, 20);
		panelEditProfile.add(editorPaneAvailability);
		
		JButton btnViewProfile = new JButton("\u03A0\u03C1\u03BF\u03B2\u03BF\u03BB\u03AE \u03A0\u03C1\u03BF\u03C6\u03AF\u03BB");
		btnViewProfile.setBounds(260, 227, 164, 23);
		panelEditProfile.add(btnViewProfile);
		
		
		
	}
}
