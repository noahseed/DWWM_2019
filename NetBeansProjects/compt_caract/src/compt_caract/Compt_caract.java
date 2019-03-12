/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compt_caract;

/**
 *
 * @author CRM
 */
public class Compt_caract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cpt = 0;
        String phrase = "Lorem Elsass.";
        
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == ' ') {
                continue;
            }
            cpt++;
        }
        
        System.out.println("Il y a " + (cpt - 1) + " lettres dans la phrase.");
    }
    
}
