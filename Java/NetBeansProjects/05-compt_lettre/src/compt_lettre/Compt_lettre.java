/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compt_lettre;

import java.util.Scanner;

/**
 *
 * @author CRM
 */
public class Compt_lettre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cpt = 0;
        String phrase = "Lorem Elsass ipsum blottkopf, risus, messti de "
                + "Bischheim porta Gal. turpis commodo mamsell quam. kougelhopf"
                + " Salut bisamme réchime sit sed  munster suspendisse non "
                + "Huguette chambon Gal ! hopla ac tchao bissame "
                + "Oberschaeffolsheim amet auctor, vulputate ornare merci "
                + "vielmols ch'ai hoplageiss knack Strasbourg nüdle amet, "
                + "dignissim und gal elementum Richard Schirmeck Spätzle nullam"
                + " Christkindelsmärik tellus barapli ornare so vielmols, dolor"
                + " ullamcorper Coopé de Truchtersheim amet kuglopf ac Carola "
                + "Racing.";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle lettre souhaitez-vous rechercher dans la "
                + "phrase ?");
        char lettre = sc.next().charAt(0);
        
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == lettre) {
                cpt++;
            }
        }
        
        if (cpt == 0) {
            System.out.println("La phrase ne contient pas le caractère "
                    + "recherché.");
        }
        else {
            System.out.println("Le caractère \"" + lettre + "\" apparait "
                    + cpt + " fois dans la phrase.");
        }
    }
}
