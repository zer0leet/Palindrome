/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zer0leet;

import java.util.Scanner;

/**
 *
 * @author Deepika
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, r, sum = 0, temp;
        System.out.println("Enter the number for which the Palindrome is to be checked");
        n = input.nextInt(0);
        temp = n;
        while (n > 0) {
            r = n % 10;  //getting remainder  
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("palindrome number ");
        } else {
            System.out.println("not palindrome");
        }
    }

}
