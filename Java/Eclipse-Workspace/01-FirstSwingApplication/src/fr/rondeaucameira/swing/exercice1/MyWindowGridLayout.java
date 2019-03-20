package fr.rondeaucameira.swing.exercice1;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MyWindowGridLayout extends JFrame {
	
	private static final long serialVersionUID = -4939544011287453046L;

	public MyWindowGridLayout() {
		super("My first Swing application");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		
		JPanel contentPane = (JPanel) this.getContentPane();
		//contentPane.setLayout(new BorderLayout());
		
		JButton btnPushMe = new JButton("Push me!");
		contentPane.add(btnPushMe, BorderLayout.NORTH);
		
		JButton btnClickMe = new JButton("Click me!");
		btnClickMe.setPreferredSize(new Dimension(200, 0));
		contentPane.add(btnClickMe, BorderLayout.WEST);
		
		JCheckBox chkCheckMe = new JCheckBox("Check me!"); 
		contentPane.add(chkCheckMe, BorderLayout.SOUTH);
		
		JTextArea txtEditMe = new JTextArea("Edit me!");
		contentPane.add(txtEditMe);
	}

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		MyWindowGridLayout myWindow = new MyWindowGridLayout();
		myWindow.setVisible(true);
	}

}
