/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombrejeunes;

import java.util.Scanner;

/**
 *
 * @author CRM
 */
public class NombreJeunes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cpt1 = 0, cpt2 = 0, cpt3 = 0;
        boolean stop = false;
        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez entrer l'âge de la personne ou 100 pour quitter :");
            int age = sc.nextInt();
            
            if (age < 20) {
                cpt1++;
            }
            else if ((age >= 20) && (age <= 40)) {
                cpt2++;
            }
            else if (age > 40 && age != 100) {
                cpt3++;
            }

            if (age == 100) {
                stop = true;
            }
            
        } while (!stop);
        
        System.out.println("Il y a "+cpt1+" jeunes, "+cpt2+" moyens et "+cpt3+" vieux.");
        
    }
}
