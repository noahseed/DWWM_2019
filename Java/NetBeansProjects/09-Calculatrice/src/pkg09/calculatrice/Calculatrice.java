/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09.calculatrice;

import java.util.Scanner;

/**
 *
 * @author CRM
 */
public class Calculatrice {
    public static float result;
    /**
     * @param operateur Opérateur de calcul
     * @param var1
     * @param var2
     * @return resultat
     */
    public static String calculer(char operateur, float var1, float var2) {
        String resultat;
        switch(operateur) {
            case '-':
                result = var1 - var2;
                resultat = String.format("%2.2f - %2.2f = %2.2f", var1, var2, result);
                break;
            case '+':
                result = var1 + var2;
                resultat = String.format("%2.2f + %2.2f = %2.2f", var1, var2, result);
                break;
            case '*':
                result = var1 * var2;
                resultat = String.format("%2.2f * %2.2f = %2.2f", var1, var2, result);
                break;
            case '/':
                try {
                    result = var1 / var2;
                    resultat = String.format("%2.2f / %2.2f = %2.2f", var1, var2, result);
                } catch(Exception e) {
                    e.printStackTrace();
                }
                
                break;
            default:
                resultat = ("Quel est cet opérateur étrange venu d'ailleurs ? ----> " + operateur);
        }
        return resultat;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Quel est le premier nombre à calculer ?");
//        double nb1 = sc.nextDouble();
//        
//        sc.nextLine();
//        
//        System.out.println("Quel est l'opérateur de calcul ?");
//        String operat = sc.nextLine();
//        char oper = operat.charAt(0);
//        
//        System.out.println("Quel est le deuxième nombre à calculer ?");
//        double nb2 = sc.nextDouble();
        System.out.println(Calculatrice.calculer('+', 1, 2));
        System.out.println(Calculatrice.calculer('-', 2078, 64));
        System.out.println(Calculatrice.calculer('*', 15, 3));
        System.out.println(Calculatrice.calculer('/', 42, 9));
//        Calculatrice.calculer('/', 15, 2) + Calculatrice.calculer('*', 2, 3);
        
//        System.out.println("Résultat : " + calculer(oper, nb1, nb2));
    }
    
}
