import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OthoniFarmakopoiou {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OthoniFarmakopoiou window = new OthoniFarmakopoiou();
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
	public OthoniFarmakopoiou() {
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
		
		JButton dilosh_apothematwn = new JButton("\u0394\u03AE\u03BB\u03C9\u03C3\u03B7 \u0391\u03C0\u03BF\u03B8\u03B5\u03BC\u03AC\u03C4\u03C9\u03BD");
		dilosh_apothematwn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Othoni_dilwhs_apothematwn othoni_diloshs_Apothematwn = new Othoni_dilwhs_apothematwn();
				othoni_diloshs_Apothematwn.setVisible(true);
			}
		});
		dilosh_apothematwn.setBounds(124, 146, 199, 79);
		frame.getContentPane().add(dilosh_apothematwn);
		
		JButton dilosh_efimerias = new JButton("\u0394\u03AE\u03BB\u03C9\u03C3\u03B7 \u0395\u03C6\u03B7\u03BC\u03B5\u03C1\u03AF\u03B1\u03C2");
		dilosh_efimerias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Othoni_Diloshs_Efimerias othoni_diloshs_efimerias = new Othoni_Diloshs_Efimerias();
				othoni_diloshs_efimerias.setVisible(true);
			}
		});
		dilosh_efimerias.setBounds(124, 33, 199, 72);
		frame.getContentPane().add(dilosh_efimerias);
	}
}
