/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compt_occurences;

import java.util.Scanner;

/**
 *
 * @author CRM
 */
public class Compt_occurences {

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
        
        phrase = phrase.toLowerCase();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle suite de lettres souhaitez-vous rechercher "
                + "dans la phrase ?");
        String saisie = sc.nextLine();
        
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == saisie.charAt(0)) {
                if (phrase.charAt(i+1) == saisie.charAt(1)) {
                    cpt++;
                }
            }
        }
        
        if (cpt == 0) {
            System.out.println("L'occurence n'a pas été trouvée.");
        }
        else {
            System.out.println("L'occurence a été trouvée " + cpt + " fois "
                    + "dans la phrase.");
        }
    }
    
}
