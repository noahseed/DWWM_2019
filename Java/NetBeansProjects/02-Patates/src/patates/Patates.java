/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patates;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sébastien RONDEAU CAMEIRA
 */
public class Patates {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int nbPatates = 70;
        
        System.out.println("-----------------------------------------");
        System.out.println("        Epluchons des patates !!!        ");
        System.out.println("-----------------------------------------");
        
        for (int i = 1; i <= nbPatates; i++) {
            System.out.println("Epluchons la patate n°" + i);

            if (nbPatates == i) {
                System.out.println("Je retourne à la cave chercher des pommes"
                        + " de terre...");
                System.in.read();
                i = 0;
                nbPatates = 70;
            }
        }
    }
}
