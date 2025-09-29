package com;

import javax.swing.*;
import java.util.Scanner;

public class Sandwichapp {
    static void main(String[] args) {
        Scanner sandwich = new Scanner(System.in);
        // ask for the sandwhich size 'regular or large '
        System.out.print("What size sandwhich do you want? ");
        System.out.println("1. Regular: base price $5.45");
        System.out.println("2. Large: base price $8.95");

        int size = sandwich.nextInt();
//        System.out.println("size: " + size);


        double regular = 5.45;
        double large = 8.95;
        double finalPrice = 0;

        // ask for age
        System.out.println("What is your age? ");
        // atm i dont know how to have age be a variable that can be called upon for the user to answer
        int age = sandwich.nextInt();
        // if student is 17 or younger they get a 10 percent discount
        String command = sandwich.nextLine();
        if (size == 1){
            finalPrice = regular;

        }
        else if (size == 2) {
            finalPrice = large;
        }
        else {
            System.out.println("error: " + size + " is not an option");
        }



        if ( age <= 17 ) {
            finalPrice = finalPrice  - (finalPrice * .1);
            System.out.println("You get a 10% discount");
            }
        // if age is 65 or older you recieve a 20% discount
        else if ( age >= 65 ) {
            finalPrice = finalPrice - (finalPrice * .2);
            System.out.println("You get a 20% discount");
        }

        System.out.println("final price is: " + finalPrice);
        /*
         I know i need to apply the discount and that i need to
         */






    }
}
