/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09.calculatrice;

import java.util.Scanner;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author CRM
 */
public class Principale {
    public static String resultat;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est le premier nombre à calculer ?");
        int nb1 = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("Quel est l'opérateur de calcul ?");
        String operat = sc.nextLine();
        char oper = operat.charAt(0);
        
        System.out.println("Quel est le deuxième nombre à calculer ?");
        int nb2 = sc.nextInt();
//        System.out.println(Calculatrice.calculer('+', 1, 2));
//        System.out.println(Calculatrice.calculer('-', 2078, 64));
//        System.out.println(Calculatrice.calculer('*', 15, 3));
        
        try {
            resultat = Calculatrice.calculer(oper, nb1, nb2);
        }
        catch(NumberFormatException nfe){
            showMessageDialog(null, "Veuillez entrer un entier SVP ", "Erreur", 
                    ERROR_MESSAGE);
        }
        catch (CalculException ce) {
            showMessageDialog(null, "Voici la cause de l'exception\n" 
                    + ce.getMessage(), "Erreur", ERROR_MESSAGE);
        }
        System.out.println(resultat);
//        Calculatrice.calculer('/', 15, 2) + Calculatrice.calculer('*', 2, 3);
        
//        System.out.println("Résultat : " + calculer(oper, nb1, nb2));
    }
}
