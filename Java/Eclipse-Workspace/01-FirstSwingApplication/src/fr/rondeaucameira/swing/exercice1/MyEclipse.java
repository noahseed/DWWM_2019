package fr.rondeaucameira.swing.exercice1;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MyEclipse extends JFrame {
	
	private static final long serialVersionUID = -4939544011287453046L;

	public MyEclipse() {
		super("My first Swing application");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		
		JPanel contentPane = (JPanel) this.getContentPane();
		//contentPane.setLayout(new BorderLayout());
		
		contentPane.add(createToolBar(), BorderLayout.NORTH);
		
		JScrollPane westComponent = new JScrollPane(new JTree());
		westComponent.setPreferredSize(new Dimension(150, 0));
		contentPane.add(westComponent, BorderLayout.WEST);
		
		JCheckBox chkCheckMe = new JCheckBox("Check me!"); 
		contentPane.add(chkCheckMe, BorderLayout.SOUTH);
		
		JTextArea txtContent = new JTextArea("The content of this editor");
		JScrollPane scrContent = new JScrollPane(txtContent);
		contentPane.add(scrContent);
		
		contentPane.add(createRightPanel(), BorderLayout.EAST);
		
		contentPane.add(createStatusBar() , BorderLayout.SOUTH);
	}
	
	private JToolBar createToolBar() {
		JToolBar toolBar = new JToolBar();
		
		JButton btnPushMe = new JButton("Push me!");
		toolBar.add(btnPushMe);
		
		JButton btnClickMe = new JButton("Click me!");
		toolBar.add(btnClickMe);
		
		JCheckBox chkCheckMe = new JCheckBox("Check me!"); 
		toolBar.add(chkCheckMe);
		
		JTextField txtEditMe = new JTextField("Edit me!");
		txtEditMe.setPreferredSize(new Dimension(140, 30));
		toolBar.add(txtEditMe);
		
		return toolBar;
	}
	
	private JPanel createStatusBar() {
		JPanel statusBar = new JPanel(new FlowLayout(FlowLayout.LEFT));

		JLabel lblStatus1 = new JLabel("Message 1");
		lblStatus1.setPreferredSize(new Dimension(100, 30));
		statusBar.add(lblStatus1);
		
		JLabel lblStatus2 = new JLabel("Message 2");
		lblStatus2.setPreferredSize(new Dimension(100, 30));
		statusBar.add(lblStatus2);
		
		JLabel lblStatus3 = new JLabel("Message 3");
		lblStatus3.setPreferredSize(new Dimension(100, 30));
		statusBar.add(lblStatus3);
		
		return statusBar;
	}
	
	private JPanel createRightPanel() {
		JPanel panel = new JPanel(new GridLayout(4, 1));
		panel.add(new JButton("Button1"));
		panel.add(new JButton("Button2"));
		panel.add(new JButton("Button3"));
		panel.add(new JButton("Button4"));
		return panel;
	}

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		MyEclipse myWindow = new MyEclipse();
		myWindow.setVisible(true);
	}

}