package fr.rondeaucameira.swing.exercice2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MyWindowListener1 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = -4939544011287453046L;
	
	private JButton btnPushMe = new JButton("Push me!");
	private JButton btnClickMe = new JButton("Click me!");

	public MyWindowListener1() {
		super("My first Swing application");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));
		
		btnPushMe.addActionListener(this);
		contentPane.add(btnPushMe);
		
		
		btnClickMe.addActionListener(this);
		contentPane.add(btnClickMe);
		
		JCheckBox chkCheckMe = new JCheckBox("Check me!");
		contentPane.add(chkCheckMe);
		
		JTextField txtEditMe = new JTextField("Edit me!");
		txtEditMe.setPreferredSize(new Dimension(120, 30));
		contentPane.add(txtEditMe);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == btnPushMe) {
			System.out.println("Bouton push me cliqu�");
		} else {
			System.out.println("Autre bouton cliqu�");			
		}
	}

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		MyWindowListener1 myWindow = new MyWindowListener1();
		myWindow.setVisible(true);
	}

}
