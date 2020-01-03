package com.hans.string;

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word :");

        String str = scanner.nextLine();
        String reverse = "";

        for (int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }

        if(reverse.equals(str)){
            System.out.println("String is Palindrome ");
        }else {
            System.out.println("String isn't Palindrome ");
        }
    }
}
