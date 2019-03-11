/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebastien.application;

import com.sebastien.entites.Personne;

import javax.swing.JOptionPane;


/**
 *
 * @author Sébastien RONDEAU CAMEIRA
 */
public class Principale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        System.out.println("Hello world ... ");
        System.out.println("Mon premier programme Java fonctionne !!!");
        System.out.println("-----------------------------------------");
        
        Personne marcel = new Personne("Marcel","Dupont",70);
        marcel.setPrenom("Henri");
        
        marcel.setPrenom( JOptionPane.showInputDialog(null, "Prénom ?",
                "Nouveau prénom", JOptionPane.QUESTION_MESSAGE) );
        
        JOptionPane.showMessageDialog(null, marcel, "Personne",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
