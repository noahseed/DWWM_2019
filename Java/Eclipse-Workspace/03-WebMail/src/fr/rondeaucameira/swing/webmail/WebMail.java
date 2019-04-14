package fr.rondeaucameira.swing.webmail;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class WebMail extends JFrame {

	private static final long serialVersionUID = 390126406282374161L;
	
	// Construction de l'interface graphique
	public WebMail() {
		super("Envoi de mails � un destinataire");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		// Construction et injection de la barre de menu
		this.setJMenuBar(createMenuBar());
		
		// Construction et injection de la barre d'outils
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.add(createToolBar(), BorderLayout.NORTH);
		contentPane.add(new JTree(), BorderLayout.WEST);
	}

	// M�thode de construction de la barre de menu
	private JMenuBar createMenuBar() {
		// Cr�ation de la barre de menu
		JMenuBar menuBar = new JMenuBar();
		
		// Menu Message
		JMenu mnuMessage = new JMenu("Message");
		mnuMessage.setMnemonic('M');
		
		JMenuItem mnuNew = new JMenuItem("Nouveau");
		mnuNew.setMnemonic('N');
		mnuNew.setIcon(new ImageIcon("icons/new.png"));
		mnuMessage.add(mnuNew);

		JMenuItem mnuOpen = new JMenuItem("Ouvrir...");
		mnuOpen.setMnemonic('O');
		mnuOpen.setIcon(new ImageIcon("icons/open.png"));
		mnuMessage.add(mnuOpen);
		
		mnuMessage.addSeparator();
		
		JMenuItem mnuSend = new JMenuItem("Envoyer");
		mnuSend.setMnemonic('E');
		mnuSend.setIcon(new ImageIcon("icons/send.png"));
		mnuSend.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0));
		mnuMessage.add(mnuSend);
		
		mnuMessage.addSeparator();
		
		JMenuItem mnuQuit = new JMenuItem("Quitter");
		mnuQuit.setMnemonic('Q');
		mnuQuit.setIcon(new ImageIcon("icons/exit.png"));
		mnuQuit.addActionListener(this::mnuQuitListener);
		mnuMessage.add(mnuQuit);
		
		menuBar.add(mnuMessage);
		
		// Menu Options
		JMenu mnuOptions = new JMenu("Options");
		mnuOptions.setMnemonic('O');
		menuBar.add(mnuOptions);
		
		JMenuItem mnuParams = new JMenuItem("Param�tres...");
		mnuParams.setMnemonic('P');
		mnuParams.setIcon(new ImageIcon("icons/config.png"));
		mnuOptions.add(mnuParams);
		
		// Menu Aide
		JMenu mnuHelp = new JMenu("?");
		mnuHelp.setMnemonic('?');
		menuBar.add(mnuHelp);
		
		JMenuItem mnuAbout = new JMenuItem("A propos...");
		mnuAbout.setMnemonic('A');
		mnuAbout.setIcon(new ImageIcon("icons/about.png"));
		mnuAbout.addActionListener(this::mnuAboutListener);
		mnuHelp.add(mnuAbout);
		
		return menuBar;
	}
	
	// M�thode de construction de la barre d'outils
	private JToolBar createToolBar() {
		
		// La barre d'outils � proprement parler
		JToolBar toolBar = new JToolBar();
		
		JButton btnNew = new JButton(new ImageIcon("icons/new.png"));
		btnNew.addActionListener(this::mnuAboutListener);
		btnNew.setToolTipText("Nouveau");
		toolBar.add(btnNew);
		
		JButton btnOpen = new JButton(new ImageIcon("icons/open.png"));
		btnOpen.setToolTipText("Ouvrir...");
		toolBar.add(btnOpen);
		
		toolBar.addSeparator();
		
		JButton btnSend = new JButton(new ImageIcon("icons/send.png"));
		btnSend.setToolTipText("Envoyer (F12)");
		toolBar.add(btnSend);
		
		return toolBar;
	}
	
	private void mnuQuitListener(ActionEvent event) {
		System.exit(0);
	}
	
	private void mnuAboutListener(ActionEvent event) {
		JOptionPane.showMessageDialog(this, "Envoi de mails � un destinataire\n\n"
				+ "� S. RONDEAU CAMEIRA 2019\n\nVersion 1.0");
	}

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());

		WebMail window = new WebMail();
		window.setVisible(true);
	}

}
