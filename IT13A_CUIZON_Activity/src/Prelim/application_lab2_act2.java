/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java;

import java.util.Scanner;


public class application_lab2_act2 {
     public static void main(String[] args) {
        int a, b, c;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Enter First Number:");
        a = in.nextInt();
        
         System.out.println("Enter Second Number:");
        b = in.nextInt();
        
         System.out.println("Enter Third Number:");
        c = in.nextInt();
        
        if (a > b && a > c){ 
        System.out.println("a is the greatest number");
        } else if (b > a && b > c){
        System.out.println("b is the greatest number");
        } else if (c > b && c > a){
        System.out.println("c is the greatest number");
        }
        
    }
    
}       

