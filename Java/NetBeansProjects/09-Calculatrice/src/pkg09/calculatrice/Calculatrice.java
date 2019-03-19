/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09.calculatrice;

import static javax.swing.JOptionPane.*;

/**
 *
 * @author CRM
 */
public class Calculatrice {
    public static float result;
    public static String resultat;
    /**
     * @param operateur Opérateur de calcul
     * @param var1
     * @param var2
     * @return resultat
     * @throws pkg09.calculatrice.CalculException
     */
    public static String calculer(char operateur, int var1, int var2) 
            throws CalculException {
        switch(operateur) {
            case '-':
                result = var1 - var2;
                resultat = String.format("%2.2f - %2.2f = %2.2f", var1, var2, 
                        result);
                break;
            case '+':
                result = var1 + var2;
                resultat = String.format("%d + %d = %2.2f", var1, var2, 
                        result);
                break;
            case '*':
                result = var1 * var2;
                resultat = String.format("%2.2f * %2.2f = %2.2f", var1, var2, 
                        result);
                break;
            case '/':
                
                try {
                    if(var2 == 0)
                    {
                        throw new CalculException("Diviser par zéro est un non sens !");
                    }
                    
                    result = ((float)var1 / (float)var2);
                    resultat = String.format("%d / %d = %2.2f", var1, 
                            var2, result);
                } catch(CalculException e) {
                    e.printStackTrace();
                }
                break;
            default:
                resultat = ("Quel est cet opérateur étrange venu d'ailleurs ? "
                        + "----> " + operateur);
        }
        return resultat;
    }
}
