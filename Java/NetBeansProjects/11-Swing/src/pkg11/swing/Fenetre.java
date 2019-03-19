/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.swing;

import javax.swing.JFrame;

/**
 *
 * @author CRM
 */
public class Fenetre extends JFrame {
    public Fenetre(){
        this.setTitle("Ma première fenêtre Java");
        this.setSize(250, 250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(new Panneau());
        
        this.setVisible(true);
    }
}
