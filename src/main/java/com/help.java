package com;

import java.util.Scanner;

public class help  {
    static void main(String[] args) {
        //start with scanner and with two floating point numbers
        Scanner myScanner = new Scanner(System.in);

        //enter number 1
        System.out.println("Enter number 1: ");
        int num1 = myScanner.nextInt();
        // enter number 2
        System.out.println("Enter number 2:" );
        int num2 = myScanner.nextInt();

        //Possible calculations:
        //(A)dd
        //(S)ubtract
        //(M)ultiply
        //(D)ivide
        //Please select an option: M
        myScanner.nextLine();

        // ask if the user wants to add, subtract, multiply or divide the two numbers
        System.out.println("what would you like to do? ");
        System.out.println("Enter 'add', 'subtract', 'multiply', divide ");
        int anz = num1 * num2;
        String action = myScanner.nextLine();

        System.out.println("Your answer is: " + anz);

    }
}
