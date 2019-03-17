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
        int cptMineurs = 0;
        int cptMajeurs = 0;
        int cptTours = 1;
        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez entrer l'âge de la personne "+cptTours
                    +".");
            int age = sc.nextInt();
            
            if (age < 20) {
                cptMineurs++;
            }
            else {
                cptMajeurs++;
            }
            
            cptTours++;
            
        } while (cptTours <= 20);
        
        if (cptMineurs == 20) {
            System.out.println("Toutes les personnes ont moins de 20 ans.");
        }
        else if (cptMajeurs == 20) {
            System.out.println("Toutes les personnes ont plus de 20 ans.");
        }
        else {
            System.out.println("Il y a "+cptMineurs+" jeunes et "+cptMajeurs+
                    " adultes.");
        }
    }
}
