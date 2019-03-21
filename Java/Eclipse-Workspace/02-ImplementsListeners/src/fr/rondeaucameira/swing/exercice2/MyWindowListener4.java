package fr.rondeaucameira.swing.exercice2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MyWindowListener4 extends JFrame {
	
	private static final long serialVersionUID = -4939544011287453046L;
	
	private JButton btnPushMe = new JButton("Push me!");
	private JButton btnClickMe = new JButton("Click me!");

	public MyWindowListener4() {
		super("My first Swing application");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		//btnPushMe.addActionListener((e) -> btnPushListener(e));
		btnPushMe.addActionListener(this::btnPushListener);
		contentPane.add(btnPushMe);
		
		btnClickMe.addActionListener((event) -> System.out.println("btnClickMe clicked"));
		btnClickMe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnClickMe.setForeground(Color.BLACK);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btnClickMe.setForeground(Color.RED);
			}
		});
		contentPane.add(btnClickMe);
		
		JCheckBox chkCheckMe = new JCheckBox("Check me!");
		contentPane.add(chkCheckMe);
		
		JTextField txtEditMe = new JTextField("Edit me!");
		txtEditMe.setPreferredSize(new Dimension(120, 30));
		contentPane.add(txtEditMe);
	}
	
	private void btnPushListener(ActionEvent event) {
		//btnClickMe.setText("Ouille");
		System.out.println("btnPushMe clicked");
	}

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		MyWindowListener4 myWindow = new MyWindowListener4();
		myWindow.setVisible(true);
	}

}