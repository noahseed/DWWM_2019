/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.exceptions;

import static javax.swing.JOptionPane.*;

/**
 *
 * @author CRM
 */
public class Exceptions {
    public static void main(String[] args) {
        // Variables nécessaires à la manipulation du tableau
        int tailleTableau = 0;
        String taille;
        int[] tableau;
        boolean encore = true;
        while (encore == true) {
            taille = showInputDialog(null, "Veuillez entrer le nombre d'élts "
                    + "souhaité", "Taille ?", INFORMATION_MESSAGE);
            try {
                tailleTableau = new Integer(taille);
                encore = false;
            }
            catch (NumberFormatException nfe) {
                showMessageDialog(null, "Veuillez entrer un entier SVP ", 
                        "Entier", WARNING_MESSAGE);
            }
        }

        tableau = new int[tailleTableau];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int) (Math.random() * 50 + 1);
        }
        afficher(tableau);
    }

    public static void afficher(int[] tableau) {
        String resultat = "";
        int taille = tableau.length;
        for (int i = 0; i < tableau.length; i++) {
            resultat += "tableau[" + i + "] = " + tableau[i] + "\n";
            System.out.println("tableau[" + i + "] = " + tableau[i]);
        }
        showMessageDialog(null, resultat, "Tableau de " + taille + " entiers",
                INFORMATION_MESSAGE);
    }
}