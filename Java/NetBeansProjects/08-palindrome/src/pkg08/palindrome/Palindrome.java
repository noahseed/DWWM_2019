/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08.palindrome;

import java.util.Scanner;

/**
 *
 * @author CRM
 */
public class Palindrome {
    
    public static boolean IsPalindrome(String text)
        {
            int min = 0;
            int max = text.length() - 1;

            while (true)
            {
                if (min > max)
                {
                    return true;
                }
                char a = text.charAt(min);
                char b = text.charAt(max);

                while (!Character.isLetterOrDigit(a))
                {
                    min++;
                    if (min > max)
                    {
                        return true;
                    }
                    a = text.charAt(min);
                }

                while (!Character.isLetterOrDigit(b))
                {
                    max--;
                    if (min > max)
                    {
                        return true;
                    }
                    b = text.charAt(max);
                }

                if (Character.toLowerCase(a) != Character.toLowerCase(b))
                {
                    return false;
                }
                min++;
                max--;
            }
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner saisie = new Scanner(System.in);

        System.out.println("Veuillez entrer une phrase ?");
        String text = saisie.nextLine();
        
        if (text == "." || text == "") {
            System.out.println("La chaîne est vide.");
        }
        else {
            if (IsPalindrome(text)) {
                System.out.println(text + " est un palindrome.");
            }
            else {
                System.out.println(text + " n'est pas un palindrome.");
            }
        }
    }
    
}
