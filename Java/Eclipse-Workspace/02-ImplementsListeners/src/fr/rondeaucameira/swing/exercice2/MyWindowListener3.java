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

public class MyWindowListener3 extends JFrame {
	
	private static final long serialVersionUID = -4939544011287453046L;
	
	private JButton btnPushMe = new JButton("Push me!");
	private JButton btnClickMe = new JButton("Click me!");

	public MyWindowListener3() {
		super("My first Swing application");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		/*btnPushMe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnPushListener(e);
			}
		});*/
		btnPushMe.addActionListener((e) -> btnPushListener(e));
		contentPane.add(btnPushMe);
		
		btnClickMe.addActionListener((event) -> System.out.println("btnClickMe clicked"));
		contentPane.add(btnClickMe);
		
		JCheckBox chkCheckMe = new JCheckBox("Check me!");
		contentPane.add(chkCheckMe);
		
		JTextField txtEditMe = new JTextField("Edit me!");
		txtEditMe.setPreferredSize(new Dimension(120, 30));
		contentPane.add(txtEditMe);
	}
	
	private void btnPushListener(ActionEvent event) {
		btnClickMe.setText("Ouille");
		System.out.println("btnPushMe clicked");
	}

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		MyWindowListener3 myWindow = new MyWindowListener3();
		myWindow.setVisible(true);
	}

}