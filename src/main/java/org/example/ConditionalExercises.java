package org.example;

import java.util.Scanner;

public class ConditionalExercises {
    public boolean lessThanFive(int x) {
        // Replace the line below with code that returns true if x is less than 5, and false otherwise
        // (use an if statement with an else block).
        if(x<5) {
            return true;
        } else {
            return false;
        }
    }

    public String getAgeGroup(int age) {
        // Replace the line below with code that returns "child" if age is less than 13,
        // "teen" if age is less than 20, and "adult" otherwise
        // (use if, else if, and else)
        if (age < 13){
            return "child";
        } else if (age <20) {
            return "teen";
        } else {
            return "adult";
        }
    }

    public boolean isValidPassword(String password) {
        int passwordLength = password.length();

        // Replace the line below with code that returns true if password is at least 8 characters long
        // and false otherwise
        // (use an if statement with an else block.)
        if (passwordLength >= 8){
            return true;
        } else {
            return false;
        }

    }

    //I used this to manually test as I was writing but then ran the tests in the test folder with success.
    public static void main(String[] args) {

        ConditionalExercises ce = new ConditionalExercises();

        // test lessThanFive
        System.out.println(ce.lessThanFive(2));   // true
        System.out.println(ce.lessThanFive(9));   // false

//        // test getAgeGroup
        System.out.println(ce.getAgeGroup(10));   // child
        System.out.println(ce.getAgeGroup(15));   // teen
        System.out.println(ce.getAgeGroup(25));   // adult
//
//        // test isValidPassword
        System.out.println(ce.isValidPassword("abc"));        // false
        System.out.println(ce.isValidPassword("password123")); // true
    }
}
