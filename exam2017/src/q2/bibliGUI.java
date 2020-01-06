package q2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class bibliGUI implements ActionListener {

	private JFrame frame;
	private JTextField txtTitre;
	private JTextField txtAuteur;
	private JTextArea txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bibliGUI window = new bibliGUI();
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
	public bibliGUI() {
		initialize();		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Bibliotheque bibli = new Bibliotheque();
		frame = new JFrame("Blibliothèque");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEncoder = new JButton("Encoder");
		btnEncoder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((txtTitre.getText() != null || txtTitre.getText() != "Titre") && (txtAuteur.getText() != null || txtAuteur.getText() != "Auteur")) {
					bibli.ajouterLivre(new Livre(txtTitre.getText(), txtAuteur.getText()));
					txtArea.setText(bibli.listeLivres());
				}
			}
		});
		btnEncoder.setBackground(Color.GRAY);
		btnEncoder.setBounds(121, 227, 89, 23);
		frame.getContentPane().add(btnEncoder);
		
		JButton btnRinitialiser = new JButton("Réinitialiser");
		btnRinitialiser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTitre.setText("");
				txtAuteur.setText("");
			}
		});
		btnRinitialiser.setBackground(Color.GRAY);
		btnRinitialiser.setBounds(220, 227, 108, 23);
		frame.getContentPane().add(btnRinitialiser);
		
		txtTitre = new JTextField();
		txtTitre.setBounds(10, 196, 187, 20);
		txtTitre.setText("Titre");
		frame.getContentPane().add(txtTitre);
		txtTitre.setColumns(10);
		
		txtAuteur = new JTextField();
		txtAuteur.setBounds(213, 196, 187, 20);
		txtAuteur.setText("Auteur");
		frame.getContentPane().add(txtAuteur);
		txtAuteur.setColumns(10);
		
		txtArea = new JTextArea();
		txtArea.setBounds(10, 0, 414, 196);
		frame.getContentPane().add(txtArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
