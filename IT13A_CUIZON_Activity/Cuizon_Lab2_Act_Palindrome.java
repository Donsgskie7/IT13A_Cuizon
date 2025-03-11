/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterms;
    import java.util.Scanner;
/**
 *
 * @author sagui
 */
public class Lab2_Act_Palindrome {
    public static void main (String [] args){
    
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = in.nextLine();
        
        String reversed = "";
        
        for (int x = word.length() - 1; x>= 0; x--){
            reversed += word.charAt(x);
        }
        
        if (word.equalsIgnoreCase(reversed)){
            System.out.println(word.toLowerCase() + " is a Palindrome ");
        } else {
             System.out.println(word.toLowerCase() + " is not a Palindrome ");
        }
    }
}
